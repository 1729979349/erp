package com.zking.erp.base.mapper;

import com.zking.erp.base.model.StoreDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDetailMapper {
    int deleteByPrimaryKey(Long storedetailId);

    int insert(StoreDetail record);

    int insertSelective(StoreDetail record);

    StoreDetail selectByPrimaryKey(Long storedetailId);

    int updateByPrimaryKeySelective(StoreDetail record);

    int updateByPrimaryKey(StoreDetail record);
}