package com.zking.erp.base.controller;


import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.service.IStoreDetailService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import com.zking.erp.base.vo.StoreDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/storeDetail")
public class StoreDetailController {
    @Autowired
    private IStoreDetailService storeDetailService;
//    @Autowired
//    private JavaMailSenderImpl mailSender;

    @RequestMapping("/selectWarningPager")
    @ResponseBody
    public JsonResponseBody selectWarningPager(StoreDetailVo storeDetailVo, HttpServletRequest req){
        try {
            PageBean pageBean=new PageBean();
            pageBean.setRequest(req);
            return storeDetailService.selectWarningPager(storeDetailVo,pageBean);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_501);
        }
    }

    @Resource(name = "mailSender")
    JavaMailSenderImpl mailSender;
    @RequestMapping(path = "/sendword")
    @ResponseBody
    public JsonResponseBody  handle(@RequestBody Map<String,Object> map) {
        try {

            StoreDetailVo storeDetailVo=new StoreDetailVo();
            storeDetailVo.setRemak( map.get("remak").toString());
            storeDetailVo.setEmpEmail(map.get("empEmail").toString());

            PageBean pageBean=new PageBean();
            pageBean.setPagination(false);
            JsonResponseBody<?> list = storeDetailService.selectWarningPager(storeDetailVo, pageBean);
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo(storeDetailVo.getEmpEmail());//接收者邮箱
            mailMessage.setFrom("2296960040@qq.com");//发送者邮箱
            mailMessage.setSubject("您需要去采购了，库存数量不够了哦");
            mailMessage.setText(storeDetailVo.getRemak());
            mailSender.send(mailMessage);
            return new JsonResponseBody(ResponseStatus.STATUS_200);

        } catch (MailException e) {
            e.printStackTrace();
            throw new BusinessException(ResponseStatus.STATUS_208);
        }
    }


    @ResponseBody
    @RequestMapping("/selectAPager")
    public JsonResponseBody selectA(StoreDetailVo storeDetailVo, HttpServletRequest req) {
        try {
            PageBean pageBean=new PageBean();
            pageBean.setRequest(req);
            JsonResponseBody<?> jsonResponseBody = storeDetailService.selectAPager(storeDetailVo, pageBean);
            System.out.println(jsonResponseBody.getData());
            return jsonResponseBody;
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_204);
        }


    }
}
