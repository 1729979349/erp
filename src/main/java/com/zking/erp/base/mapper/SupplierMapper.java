package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Supplier;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierMapper {
    int deleteByPrimaryKey(Long supplierId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Long supplierId);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}