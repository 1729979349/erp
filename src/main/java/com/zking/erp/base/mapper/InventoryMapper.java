package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Inventory;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryMapper {
    int deleteByPrimaryKey(Long inventoryId);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Long inventoryId);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}