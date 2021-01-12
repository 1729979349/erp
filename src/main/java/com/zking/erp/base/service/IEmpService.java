package com.zking.erp.base.service;

import com.zking.erp.base.model.Emp;

public interface IEmpService {
    int deleteByPrimaryKey(Long empId);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Long empId);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}