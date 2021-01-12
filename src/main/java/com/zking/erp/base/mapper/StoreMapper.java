package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Store;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreMapper {
    int deleteByPrimaryKey(Long storeId);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Long storeId);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}