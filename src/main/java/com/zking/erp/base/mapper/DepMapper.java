package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Dep;
import org.springframework.stereotype.Repository;

@Repository
public interface DepMapper {
    int deleteByPrimaryKey(Long depId);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Long depId);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);
}