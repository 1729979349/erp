package com.zking.erp.base.service;

import com.zking.erp.base.model.Orders;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.vo.OrdersVo;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

public interface IOrdersService {
    int deleteByPrimaryKey(Long ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Long ordersId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    /**
     * 销售统计分析
     * @param record
     * @return
     */
    JsonResponseBody<?> ordersTimePager(OrdersVo record, PageBean pageBean);

    /**
     * 销售趋势分析
     * @param record
     * @return
     */
    JsonResponseBody<?> ordersMonthTime(String record);

    /**
     * 查询所有订单的年
     * @return
     */
    JsonResponseBody<?> ordersyear();


}