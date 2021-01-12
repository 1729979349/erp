package com.zking.erp.base.service;

import com.zking.erp.base.model.Role;
import org.springframework.stereotype.Repository;

public interface IRoleService {
    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}