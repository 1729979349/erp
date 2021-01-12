package com.zking.erp.base.service;

import com.zking.erp.base.model.Supplier;
import org.springframework.stereotype.Repository;

public interface ISupplierService {
    int deleteByPrimaryKey(Long supplierId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Long supplierId);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}