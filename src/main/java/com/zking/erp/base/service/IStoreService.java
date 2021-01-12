package com.zking.erp.base.service;

import com.zking.erp.base.model.Store;
import org.springframework.stereotype.Repository;

public interface IStoreService {
    int deleteByPrimaryKey(Long storeId);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Long storeId);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}