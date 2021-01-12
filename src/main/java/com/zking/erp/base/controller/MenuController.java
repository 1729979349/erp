package com.zking.erp.base.controller;

import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.ResponseStatus;
import com.zking.erp.base.service.IMenuSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IMenuSerivce menuSerivce;

    @RequestMapping(value = "/menuList",method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseBody<?> queryMenuList() {
        try {
//            int i=Integer.parseInt("a");
            //左侧菜单
            return menuSerivce.queryMenuList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseStatus.STATUS_204);
        }
    }



}
