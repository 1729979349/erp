package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Storeoper;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreoperMapper {
    int deleteByPrimaryKey(Long storeoperId);

    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    Storeoper selectByPrimaryKey(Long storeoperId);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);
}