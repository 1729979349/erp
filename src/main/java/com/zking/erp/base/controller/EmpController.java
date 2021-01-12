package com.zking.erp.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,Object> Test(){
        Map<String,Object> map=new HashMap<>();
        map.put("mag","测试成功");
        map.put("data","数据");
        return map;
    }

}
