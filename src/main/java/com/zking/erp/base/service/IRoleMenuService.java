package com.zking.erp.base.service;

import com.zking.erp.base.model.RoleMenu;
import org.springframework.stereotype.Repository;

public interface IRoleMenuService {
    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);
}