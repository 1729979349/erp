package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.InventoryMapper;
import com.zking.erp.base.mapper.StoreDetailMapper;
import com.zking.erp.base.mapper.StoreoperMapper;
import com.zking.erp.base.model.Inventory;
import com.zking.erp.base.model.StoreDetail;
import com.zking.erp.base.service.IInventoryService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.vo.InventoryVo;
import com.zking.erp.base.vo.StoreoperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class InventoryServiceImpl implements IInventoryService {
    @Autowired
    private InventoryMapper inventoryMapper;

    @Autowired
    private StoreoperMapper storeoperMapper;

    @Autowired
    private StoreDetailMapper storeDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long inventoryId) {
        return 0;
    }

    @Override
    public int insert(Inventory record) {

        return inventoryMapper.insert(record);
    }

    @Override
    public int insertSelective(Inventory record) {
        return 0;
    }

    @Override
    public Inventory selectByPrimaryKey(Long inventoryId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Inventory record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Inventory record) {
        return 0;
    }

    @Override
    public JsonResponseBody<?> selectInPager(InventoryVo inventoryVo, PageBean pageBean) {
        List<Map<String, Object>> maps = inventoryMapper.selectInPager(inventoryVo);
        return new JsonResponseBody<>(maps,pageBean.getTotal());
    }

    @Transactional
    public JsonResponseBody<?> Examine(InventoryVo inventoryVo,Long id) {

        //2.判断类型是减还是加
        StoreDetail storeDetail=new StoreDetail();
        storeDetail.setStoredetailGoodsId(inventoryVo.getInventoryGoodsId());//商品编号
        storeDetail.setStoredetailStoreId(inventoryVo.getInventoryStoreId());//仓库编号

        String StoreoperType="";
        //根据商品编号以及仓库编号
        StoreDetail storeDetail1 = storeDetailMapper.queryStoredetailStoreIdAndStoredetailGoodsId(storeDetail);
        if(storeDetail1!=null){
            //加
            if(inventoryVo.getInventoryType().equals("0")){

                //修改库存
                StoreDetail storeDetail2=new StoreDetail();
                storeDetail2.setStoredetailId(storeDetail1.getStoredetailId());
                storeDetail2.setStoredetailStoreId(storeDetail1.getStoredetailStoreId());
                storeDetail2.setStoredetailGoodsId(storeDetail.getStoredetailGoodsId());
                //原来的+去现在的
                storeDetail2.setStoredetailNum(storeDetail1.getStoredetailNum()+inventoryVo.getInventoryNum());

                storeDetailMapper.updateByPrimaryKeySelective(storeDetail2);

                StoreoperType="0";
            }else if(inventoryVo.getInventoryType().equals("1")){//减
                if(inventoryVo.getInventoryNum()>storeDetail1.getStoredetailNum()){
                    return new JsonResponseBody<>(10001,"库存数量不足");
                }
                //修改库存
                StoreDetail storeDetail2=new StoreDetail();
                storeDetail2.setStoredetailId(storeDetail1.getStoredetailId());
                storeDetail2.setStoredetailStoreId(storeDetail1.getStoredetailStoreId());
                storeDetail2.setStoredetailGoodsId(storeDetail.getStoredetailGoodsId());
                //原来的-去现在的
                storeDetail2.setStoredetailNum(storeDetail1.getStoredetailNum()-inventoryVo.getInventoryNum());

                storeDetailMapper.updateByPrimaryKeySelective(storeDetail2);
                StoreoperType="1";
            }

            //3.添加一条商品库存操作记录
            StoreoperVo storeoperVo=new StoreoperVo();
            storeoperVo.setStoreoperEmpId(id);//库管员
            storeoperVo.setStoreoperStoreId(storeDetail1.getStoredetailStoreId());//仓库编号
            storeoperVo.setStoreoperGoodsId(storeDetail1.getStoredetailGoodsId());//商品编号
            storeoperVo.setStoreoperOpertime(new Date());//操作日期
            storeoperVo.setStoreoperType(StoreoperType);//类型
            storeoperVo.setStoreoperNum(inventoryVo.getInventoryNum());//数量

            storeoperMapper.insertSelective(storeoperVo);

        }

        //1.修改审核人、审核日期
        inventoryVo.setInventoryChecktime(new Date());
        inventoryVo.setInventoryChecker(id);//审核人
        inventoryVo.setInventoryState("1");
        inventoryMapper.updateByPrimaryKeySelective(inventoryVo);

        return new JsonResponseBody<>();
    }
}
