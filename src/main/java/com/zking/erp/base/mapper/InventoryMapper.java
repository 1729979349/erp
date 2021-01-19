package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Inventory;
import com.zking.erp.base.model.Storeoper;
import com.zking.erp.base.vo.InventoryVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface InventoryMapper {
    int deleteByPrimaryKey(Long inventoryId);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Long inventoryId);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

    List<Map<String,Object>> selectInPager(InventoryVo inventoryVo);
}