package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Orders;
import com.zking.erp.base.vo.OrdersVo;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface OrdersMapper {
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
    List<OrdersVo> ordersTime(OrdersVo record);


    /**
     * 销售趋势分析
     * @return
     */
    List<Map<String,Object>> ordersMonthTime(String year);

    /**
     * 获取所有年
     * @return
     */
    List<Map<String,Object>> ordersyear();



}