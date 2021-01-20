package com.zking.erp.base.service;

import com.zking.erp.base.model.Inventory;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.vo.InventoryVo;


public interface IInventoryService {
    int deleteByPrimaryKey(Long inventoryId);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Long inventoryId);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

    JsonResponseBody<?> selectInPager(InventoryVo inventoryVo, PageBean pageBean);

    JsonResponseBody<?> Examine(InventoryVo inventoryVo,Long id);
}