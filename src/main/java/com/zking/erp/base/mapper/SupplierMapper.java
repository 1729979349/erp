package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Supplier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierMapper {
    /**
     * 删除供应商或客户信息
     * @param supplierId
     * @return
     */
    int deleteByPrimaryKey(Long supplierId);

    /**
     * 添加供应商或客户信息
     * @param record
     * @return
     */
    int insert(Supplier record);

    /**
     * 通过供应商或客户名查询单个信息
     * @param supplierName
     * @return
     */
    Supplier selectByPrimaryKey(String supplierName);

    /**
     * 修改供应商或客户信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Supplier record);

    /**
     * 分页查询供应商
     * @param supplier
     * @return
     */
    List<Supplier> querySupplierPager(Supplier supplier);

    /**
     * 分页查询客户
     * @param supplier
     * @return
     */
    List<Supplier> queryCustomerPager(Supplier supplier);
}