package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.EmpRoleMapper;
import com.zking.erp.base.model.EmpRole;
import com.zking.erp.base.service.IEmpRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpRoleServiceImpl implements IEmpRoleService {

    @Autowired
    private EmpRoleMapper empRoleMapper;

    @Override
    public int insert(EmpRole record) {
        return 0;
    }

    @Override
    public int insertSelective(EmpRole record) {
        return 0;
    }
}
