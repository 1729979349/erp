package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.RoleMenuMapper;
import com.zking.erp.base.model.RoleMenu;
import com.zking.erp.base.service.IRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleMenuServiceImpl implements IRoleMenuService {
    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public int insert(RoleMenu record) {
        return 0;
    }

    @Override
    public int insertSelective(RoleMenu record) {
        return 0;
    }
}
