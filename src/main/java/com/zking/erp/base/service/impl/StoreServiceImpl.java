package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.StoreMapper;
import com.zking.erp.base.model.Store;
import com.zking.erp.base.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements IStoreService {
    @Autowired
    private StoreMapper storeMapper;
    @Override
    public int deleteByPrimaryKey(Long storeId) {
        return 0;
    }

    @Override
    public int insert(Store record) {
        return 0;
    }

    @Override
    public int insertSelective(Store record) {
        return 0;
    }

    @Override
    public Store selectByPrimaryKey(Long storeId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Store record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Store record) {
        return 0;
    }
}
