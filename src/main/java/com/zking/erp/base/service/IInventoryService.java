package com.zking.erp.base.service;

import com.zking.erp.base.model.Inventory;
import org.springframework.stereotype.Repository;


public interface IInventoryService {
    int deleteByPrimaryKey(Long inventoryId);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Long inventoryId);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}