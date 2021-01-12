package com.zking.erp.base.service;

import com.zking.erp.base.model.Menu;
import com.zking.erp.base.utils.JsonResponseBody;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IMenuSerivce {

    JsonResponseBody<?> queryMenuList();


}