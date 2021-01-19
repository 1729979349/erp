package com.zking.erp.base.controller;

import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.model.Goods;
import com.zking.erp.base.model.Store;
import com.zking.erp.base.service.IStoreService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private IStoreService storeService;
    /**
     * 分页查询仓库信息
     * @param store
     * @param req
     * @return
     */
    @RequestMapping("/queryStorerPager")
    @ResponseBody
    public JsonResponseBody queryStorerPager(Store store, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        try {
            return storeService.queryStorerPager(store, pageBean);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_501);
        }
    }

    /**
     * 删除商品类型信息
     * @param store
     * @param req
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResponseBody<?> delete(Store store, HttpServletRequest req){
        try {
            return storeService.deleteByPrimaryKey(store.getStoreId());
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_502);
            // throw new RuntimeException(e);
        }
    }

    /**
     * 新增商品
     * @param store
     * @param req
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public JsonResponseBody<?> insert(Store store,HttpServletRequest req){
        try {
            return storeService.insert(store);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseStatus.STATUS_504);
        }
    }

    /**
     * 修改商品类型信息
     * @param store
     * @param req
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public JsonResponseBody<?> update(Store store,HttpServletRequest req){
        try {
            return storeService.updateByPrimaryKey(store);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_506);
        }
    }


}
