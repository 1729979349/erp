package com.zking.erp.base.service;

import com.zking.erp.base.model.Supplier;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;

import java.util.List;

public interface ISupplierService {
    /**
     * 删除供应商或客户信息
     * @param supplierId
     * @return
     */
    JsonResponseBody<?> deleteByPrimaryKey(Long supplierId);

    /**
     * 添加供应商或客户信息
     * @param record
     * @return
     */
    JsonResponseBody<?> insert(Supplier record);

    /**
     * 通过供应商或客户名查询单个信息
     * @param supplierName
     * @return
     */
    JsonResponseBody<?> selectByPrimaryKey(String supplierName);

    /**
     * 修改供应商或客户信息
     * @param record
     * @return
     */
    JsonResponseBody<?> updateByPrimaryKey(Supplier record);

    /**
     *分页查询供应商
     * @param supplier
     * @return
     */
    JsonResponseBody<?> querySupplierPager(Supplier supplier, PageBean pageBean);

    /**
     *  分页查询客户
     * @param supplier
     * @return
     */
    JsonResponseBody<?> queryCustomerPager(Supplier supplier, PageBean pageBean);
}
