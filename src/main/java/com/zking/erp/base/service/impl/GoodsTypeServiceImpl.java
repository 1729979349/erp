package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.GoodsMapper;
import com.zking.erp.base.mapper.GoodsTypeMapper;
import com.zking.erp.base.model.GoodsType;
import com.zking.erp.base.service.IGoodsTypeService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public JsonResponseBody<?> deleteByPrimaryKey(Long goodstypeId) {
        int i = goodsTypeMapper.deleteByPrimaryKey(goodstypeId);
        if(i<1)
            return new JsonResponseBody<>(ResponseStatus.STATUS_502);
        return new JsonResponseBody<>(ResponseStatus.STATUS_503);
    }

    @Override
    public JsonResponseBody<?> insert(GoodsType record) {
        GoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(record.getGoodstypeName());
        System.out.println("你大爷的"+goodsType);
        if(null!=goodsType){
            return new JsonResponseBody<>(ResponseStatus.STATUS_508);
        }else {
            int i = goodsTypeMapper.insert(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_505);
        }

    }

    @Override
    public JsonResponseBody<?> selectByPrimaryKey(String goodstypeName) {
        GoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(goodstypeName);
        if(null==goodstypeName)
            return new JsonResponseBody<>(ResponseStatus.STATUS_501);
        return new JsonResponseBody<>(goodstypeName);
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKey(GoodsType record) {
        GoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(record.getGoodstypeName());
        System.out.println("你大爷的"+goodsType);
        if(null!=goodsType) {
            return new JsonResponseBody<>(ResponseStatus.STATUS_509);
        }else{
            int i = goodsTypeMapper.updateByPrimaryKey(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_507);
        }
    }

    @Override
    public JsonResponseBody<?> queryGoodsPagePager(GoodsType goodsType, PageBean pageBean) {
        List<GoodsType> goodsTypes = goodsTypeMapper.queryGoodsPagePager(goodsType);
        return new JsonResponseBody<>(goodsTypes,pageBean.getTotal());
    }
}
