package com.zking.erp.base.service;

import com.zking.erp.base.model.GoodsType;
import org.springframework.stereotype.Repository;


public interface IGoodsTypeService {
    int deleteByPrimaryKey(Long goodstypeId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Long goodstypeId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}