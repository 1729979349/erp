package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.InventoryMapper;
import com.zking.erp.base.model.Inventory;
import com.zking.erp.base.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements IInventoryService {
    @Autowired
    private InventoryMapper inventoryMapper;

    @Override
    public int deleteByPrimaryKey(Long inventoryId) {
        return 0;
    }

    @Override
    public int insert(Inventory record) {
        return 0;
    }

    @Override
    public int insertSelective(Inventory record) {
        return 0;
    }

    @Override
    public Inventory selectByPrimaryKey(Long inventoryId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Inventory record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Inventory record) {
        return 0;
    }
}
