package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.SupplierMapper;
import com.zking.erp.base.model.Supplier;
import com.zking.erp.base.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements ISupplierService {
    @Autowired
    private SupplierMapper supplierMapper;
    @Override
    public int deleteByPrimaryKey(Long supplierId) {
        return 0;
    }

    @Override
    public int insert(Supplier record) {
        return 0;
    }

    @Override
    public int insertSelective(Supplier record) {
        return 0;
    }

    @Override
    public Supplier selectByPrimaryKey(Long supplierId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Supplier record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Supplier record) {
        return 0;
    }
}
