package com.zking.erp.base.controller;

import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.service.IInventoryService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import com.zking.erp.base.utils.StringUtils;
import com.zking.erp.base.vo.InventoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.zking.erp.base.utils.ResponseStatus.STATUS_200;

@Controller
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private IInventoryService iInventoryService;

    @ResponseBody
    @RequestMapping("/selectIn")
    public JsonResponseBody selectIn(InventoryVo inventoryVo, HttpServletRequest req){
        try {

            if(StringUtils.isNotBlank(inventoryVo.getStatusinventoryCreatetime()) && StringUtils.isNotBlank(inventoryVo.getEndinventoryChecktime())){

                String dateStr =inventoryVo.getStatusinventoryCreatetime();
                String dateStr2=inventoryVo.getEndinventoryChecktime();
                dateStr = dateStr.replace("Z", " UTC");
                dateStr2 = dateStr2.replace("Z", " UTC");
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
                Date date = format.parse(dateStr);
                Date date2 = format.parse(dateStr2);
                format = new SimpleDateFormat("yyyy-MM-dd");
                dateStr = format.format(date)+" 00:00:00";
                dateStr2 = format.format(date2)+ " 29:59:59";

                inventoryVo.setStatusinventoryCreatetime(dateStr);
                inventoryVo.setEndinventoryChecktime(dateStr2);
            }

            if(StringUtils.isNotBlank(inventoryVo.getStatusinventoryCreatetime2()) && StringUtils.isNotBlank(inventoryVo.getEndinventoryChecktime2())){

                String dateStr =inventoryVo.getStatusinventoryCreatetime2();
                String dateStr2=inventoryVo.getEndinventoryChecktime2();
                dateStr = dateStr.replace("Z", " UTC");
                dateStr2 = dateStr2.replace("Z", " UTC");
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
                Date date = format.parse(dateStr);
                Date date2 = format.parse(dateStr2);
                format = new SimpleDateFormat("yyyy-MM-dd");
                dateStr = format.format(date)+" 00:00:00";
                dateStr2 = format.format(date2)+ " 29:59:59";

                inventoryVo.setStatusinventoryCreatetime2(dateStr);
                inventoryVo.setEndinventoryChecktime2(dateStr2);
            }

            PageBean pageBean=new PageBean();
            pageBean.setRequest(req);
            JsonResponseBody<?> jsonResponseBody = iInventoryService.selectInPager(inventoryVo, pageBean);
            return jsonResponseBody;
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_204);
        }
    }

    @ResponseBody
    @RequestMapping("/insert")
    public JsonResponseBody<?> insert(InventoryVo inventoryVo){

        try {

            inventoryVo.setInventoryCreatetime(new Date());
            int i = iInventoryService.insert(inventoryVo);
            return new JsonResponseBody<>(ResponseStatus.STATUS_200);

        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_504);
        }
    }

    @RequestMapping("/Examine")
    @ResponseBody
    public JsonResponseBody<?> Examine(InventoryVo inventoryVo,Long id){
        try {
            return iInventoryService.Examine(inventoryVo,id);
        } catch (Exception e) {
         throw  new BusinessException(ResponseStatus.STATUS_1000);
        }
    }


}
