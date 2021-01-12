package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.StoreoperMapper;
import com.zking.erp.base.model.Storeoper;
import com.zking.erp.base.service.IStoreoperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreoperServiceImpl implements IStoreoperService {
    @Autowired
    private StoreoperMapper storeoperMapper;
    @Override
    public int deleteByPrimaryKey(Long storeoperId) {
        return 0;
    }

    @Override
    public int insert(Storeoper record) {
        return 0;
    }

    @Override
    public int insertSelective(Storeoper record) {
        return 0;
    }

    @Override
    public Storeoper selectByPrimaryKey(Long storeoperId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Storeoper record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Storeoper record) {
        return 0;
    }
}
