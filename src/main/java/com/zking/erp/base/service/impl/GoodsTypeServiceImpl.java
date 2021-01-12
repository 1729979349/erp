package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.GoodsMapper;
import com.zking.erp.base.mapper.GoodsTypeMapper;
import com.zking.erp.base.model.GoodsType;
import com.zking.erp.base.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public int deleteByPrimaryKey(Long goodstypeId) {
        return 0;
    }

    @Override
    public int insert(GoodsType record) {
        return 0;
    }

    @Override
    public int insertSelective(GoodsType record) {
        return 0;
    }

    @Override
    public GoodsType selectByPrimaryKey(Long goodstypeId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsType record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(GoodsType record) {
        return 0;
    }
}
