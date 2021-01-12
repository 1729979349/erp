package com.zking.erp.base.service;

import com.zking.erp.base.model.OrderDetail;
import org.springframework.stereotype.Repository;

public interface IOrderDetailService {
    int deleteByPrimaryKey(Long orderdetailId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long orderdetailId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}