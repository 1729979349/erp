package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Emp;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpMapper {
    int deleteByPrimaryKey(Long empId);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Long empId);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}