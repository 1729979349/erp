package com.zking.erp.base.service;

import com.zking.erp.base.model.Returnorders;
import org.springframework.stereotype.Repository;

public interface IReturnordersService {
    int deleteByPrimaryKey(Long returnordersId);

    int insert(Returnorders record);

    int insertSelective(Returnorders record);

    Returnorders selectByPrimaryKey(Long returnordersId);

    int updateByPrimaryKeySelective(Returnorders record);

    int updateByPrimaryKey(Returnorders record);
}