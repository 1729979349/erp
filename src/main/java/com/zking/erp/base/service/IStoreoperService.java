package com.zking.erp.base.service;

import com.zking.erp.base.model.Storeoper;
import org.springframework.stereotype.Repository;

public interface IStoreoperService {
    int deleteByPrimaryKey(Long storeoperId);

    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    Storeoper selectByPrimaryKey(Long storeoperId);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);
}