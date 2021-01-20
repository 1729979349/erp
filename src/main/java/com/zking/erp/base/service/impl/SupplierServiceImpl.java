package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.SupplierMapper;
import com.zking.erp.base.model.Goods;
import com.zking.erp.base.model.Supplier;
import com.zking.erp.base.service.ISupplierService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements ISupplierService {
    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public JsonResponseBody<?> deleteByPrimaryKey(Long supplierId) {
        int i = supplierMapper.deleteByPrimaryKey(supplierId);
        if(i<1)
            return new JsonResponseBody<>(ResponseStatus.STATUS_502);
        return new JsonResponseBody<>(ResponseStatus.STATUS_503);
}

    @Override
    public JsonResponseBody<?> insert(Supplier record) {
        Supplier supplier = supplierMapper.selectByPrimaryKey(record.getSupplierName());
        System.out.println("子文妹妹"+supplier);
        if(null!=supplier){
            return new JsonResponseBody<>(ResponseStatus.STATUS_508);
        }else{
            int i = supplierMapper.insert(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_505);
        }
    }

    @Override
    public JsonResponseBody<?> selectByPrimaryKey(String supplierName) {
        Supplier supplier = supplierMapper.selectByPrimaryKey(supplierName);
        if(null==supplierName)
            return new JsonResponseBody<>(ResponseStatus.STATUS_501);
        return new JsonResponseBody<>(supplierName);
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKey(Supplier record) {
        Supplier supplier = supplierMapper.selectByPrimaryKey(record.getSupplierName());
        System.out.println(supplier);
        System.out.println(record);
        if (null==supplier){
            System.out.println("1111111111111111");
            int i = supplierMapper.updateByPrimaryKey(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_507);
        }else if (supplier.getSupplierId()==record.getSupplierId()&&supplier.getSupplierName().equals(record.getSupplierName())){
            System.out.println("22222222222222222");
            int i = supplierMapper.updateByPrimaryKey(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_507);
        }else{
            System.out.println("333333333333");
            return new JsonResponseBody<>(ResponseStatus.STATUS_509);
        }
    }

    @Override
    public JsonResponseBody<?> querySupplierPager(Supplier supplier, PageBean pageBean) {
        List<Supplier> list = supplierMapper.querySupplierPager(supplier);
        return new JsonResponseBody<>(list,pageBean.getTotal());
    }

    @Override
    public JsonResponseBody<?> queryCustomerPager(Supplier supplier, PageBean pageBean) {
        List<Supplier> customer = supplierMapper.queryCustomerPager(supplier);
        return new JsonResponseBody<>(customer,pageBean.getTotal());
    }
}
