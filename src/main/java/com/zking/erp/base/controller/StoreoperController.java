package com.zking.erp.base.controller;

import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.model.Storeoper;
import com.zking.erp.base.service.IStoreoperService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import com.zking.erp.base.vo.StoreoperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/storeoper")
public class StoreoperController {

    @Autowired
    private IStoreoperService iStoreoperService;

    @ResponseBody
    @RequestMapping("/selectAllPager")
    public JsonResponseBody selectAll(StoreoperVo storeoperVo, HttpServletRequest req){
        try {
            PageBean pageBean=new PageBean();
            pageBean.setRequest(req);
            JsonResponseBody<?> jsonResponseBody =iStoreoperService.selectAllPager(storeoperVo,pageBean);
            System.out.println(jsonResponseBody.getData());
            return jsonResponseBody;
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_204);
        }
    }

}


