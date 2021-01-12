package com.zking.erp.base.service;

import com.zking.erp.base.model.StoreDetail;
import org.springframework.stereotype.Repository;

public interface IStoreDetailService {
    int deleteByPrimaryKey(Long storedetailId);

    int insert(StoreDetail record);

    int insertSelective(StoreDetail record);

    StoreDetail selectByPrimaryKey(Long storedetailId);

    int updateByPrimaryKeySelective(StoreDetail record);

    int updateByPrimaryKey(StoreDetail record);
}