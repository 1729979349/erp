package com.zking.erp.base.mapper;

import com.zking.erp.base.model.EmpRole;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRoleMapper {
    int insert(EmpRole record);

    int insertSelective(EmpRole record);
}