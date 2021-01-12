package com.zking.erp.base.service;

import com.zking.erp.base.model.EmpRole;

public interface IEmpRoleService {

    int insert(EmpRole record);

    int insertSelective(EmpRole record);
}