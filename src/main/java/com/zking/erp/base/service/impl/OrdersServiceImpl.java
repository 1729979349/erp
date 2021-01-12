package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.OrdersMapper;
import com.zking.erp.base.model.Orders;
import com.zking.erp.base.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int deleteByPrimaryKey(Long ordersId) {
        return 0;
    }

    @Override
    public int insert(Orders record) {
        return 0;
    }

    @Override
    public int insertSelective(Orders record) {
        return 0;
    }

    @Override
    public Orders selectByPrimaryKey(Long ordersId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Orders record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Orders record) {
        return 0;
    }
}
