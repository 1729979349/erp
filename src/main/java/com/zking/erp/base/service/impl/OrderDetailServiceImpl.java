package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.OrderDetailMapper;
import com.zking.erp.base.model.OrderDetail;
import com.zking.erp.base.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements IOrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long orderdetailId) {
        return 0;
    }

    @Override
    public int insert(OrderDetail record) {
        return 0;
    }

    @Override
    public int insertSelective(OrderDetail record) {
        return 0;
    }

    @Override
    public OrderDetail selectByPrimaryKey(Long orderdetailId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(OrderDetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(OrderDetail record) {
        return 0;
    }
}
