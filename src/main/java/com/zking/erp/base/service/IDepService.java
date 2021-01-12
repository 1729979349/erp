package com.zking.erp.base.service;

import com.zking.erp.base.model.Dep;


public interface IDepService {
    int deleteByPrimaryKey(Long depId);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Long depId);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);
}