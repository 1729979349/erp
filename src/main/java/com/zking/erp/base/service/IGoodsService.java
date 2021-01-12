package com.zking.erp.base.service;

import com.zking.erp.base.model.Goods;
import org.springframework.stereotype.Repository;


public interface IGoodsService {
    int deleteByPrimaryKey(Long goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}