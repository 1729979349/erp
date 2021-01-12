package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.StoreDetailMapper;
import com.zking.erp.base.model.StoreDetail;
import com.zking.erp.base.service.IStoreDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreDetailServiceImpl implements IStoreDetailService {
    @Autowired
    private StoreDetailMapper storeDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long storedetailId) {
        return 0;
    }

    @Override
    public int insert(StoreDetail record) {
        return 0;
    }

    @Override
    public int insertSelective(StoreDetail record) {
        return 0;
    }

    @Override
    public StoreDetail selectByPrimaryKey(Long storedetailId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(StoreDetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StoreDetail record) {
        return 0;
    }
}
