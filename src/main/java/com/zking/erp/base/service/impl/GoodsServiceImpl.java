package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.GoodsMapper;
import com.zking.erp.base.model.Goods;
import com.zking.erp.base.model.GoodsType;
import com.zking.erp.base.model.Store;
import com.zking.erp.base.service.IGoodsService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public JsonResponseBody<?> deleteByPrimaryKey(Long goodsId) {
        int i = goodsMapper.deleteByPrimaryKey(goodsId);
        if(i<1)
            return new JsonResponseBody<>(ResponseStatus.STATUS_502);
        return new JsonResponseBody<>(ResponseStatus.STATUS_503);
    }

    @Override
    public JsonResponseBody<?> insert(Goods record) {
        Goods goods = goodsMapper.selectByPrimaryKey(record.getGoodsName());
        System.out.println("子文妹妹"+goods);
        if(null!=goods){
            return new JsonResponseBody<>(ResponseStatus.STATUS_508);
        }else{
            int i = goodsMapper.insert(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_505);
        }
    }

    @Override
    public JsonResponseBody<?> selectByPrimaryKey(String goodsName) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsName);
        if(null==goodsName)
            return new JsonResponseBody<>(ResponseStatus.STATUS_501);
        return new JsonResponseBody<>(goodsName);
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKey(Goods record) {
        Goods goods = goodsMapper.selectByPrimaryKey(record.getGoodsName());
        if (null==goods){
            System.out.println("1111111111111111");
            int i = goodsMapper.updateByPrimaryKey(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_507);
        }else if (record.getGoodsId()==goods.getGoodsId()&&goods.getGoodsName().equals(record.getGoodsName())){
            System.out.println("22222222222222222");
            int i = goodsMapper.updateByPrimaryKey(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_507);
        }else{
            System.out.println("333333333333");
            return new JsonResponseBody<>(ResponseStatus.STATUS_509);
        }
    }

    @Override
    public JsonResponseBody<?> queryGoodsPager(Goods goods, PageBean pageBean) {
        List<Map<String, Object>> list = goodsMapper.queryGoodsPager(goods);
        return new JsonResponseBody<>(list,pageBean.getTotal());
    }
}
