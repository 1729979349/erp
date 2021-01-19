package com.zking.erp.base.controller;

import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.model.Goods;
import com.zking.erp.base.model.Supplier;
import com.zking.erp.base.service.ISupplierService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private ISupplierService supplierService;
    /**
     * 分页查询供应商信息
     * @param supplier
     * @param req
     * @return
     */
    @RequestMapping("/querySupplierPager")
    @ResponseBody
    public JsonResponseBody querySupplierPager(Supplier supplier, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        try {
            return supplierService.querySupplierPager(supplier, pageBean);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_501);
        }
    }

    /**
     * 分页查询客户
     * @param supplier
     * @return
     */
    @RequestMapping("/queryCustomerPager")
    @ResponseBody
    public JsonResponseBody queryCustomerPager(Supplier supplier, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        try {
            return supplierService.queryCustomerPager(supplier, pageBean);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_501);
        }
    }

    /**
     * 删除供应商或客户类型信息
     * @param supplier
     * @param req
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResponseBody<?> delete(Supplier supplier, HttpServletRequest req){
        try {
            return supplierService.deleteByPrimaryKey(supplier.getSupplierId());
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_502);
            // throw new RuntimeException(e);
        }
    }

    /**
     * 新增供应商或客户
     * @param supplier
     * @param req
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public JsonResponseBody<?> insert(Supplier supplier,HttpServletRequest req){
        try {
            return supplierService.insert(supplier);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseStatus.STATUS_504);
        }
    }

    /**
     * 修改商品类型信息
     * @param supplier
     * @param req
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public JsonResponseBody<?> update(Supplier supplier,HttpServletRequest req){
        try {
            return supplierService.updateByPrimaryKey(supplier);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_506);
        }
    }


}
