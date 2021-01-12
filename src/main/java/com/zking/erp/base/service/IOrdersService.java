package com.zking.erp.base.service;

import com.zking.erp.base.model.Orders;
import org.springframework.stereotype.Repository;

public interface IOrdersService {
    int deleteByPrimaryKey(Long ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Long ordersId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}