package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.OrdersMapper;
import com.zking.erp.base.model.Orders;
import com.zking.erp.base.service.IOrdersService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import com.zking.erp.base.vo.OrdersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 销售统计分析
     * @param record
     * @return
     */
    public JsonResponseBody<?> ordersTimePager(OrdersVo record, PageBean pageBean){
        List<OrdersVo> OrdersVos = ordersMapper.ordersTime(record);
        if(null==OrdersVos)
            return new JsonResponseBody<>(ResponseStatus.STATUS_268);
        return new JsonResponseBody<>(OrdersVos,pageBean.getTotal());
    }

    /**
     * 销售趋势分析
     * @return
     */
    @Override
    public JsonResponseBody<?> ordersMonthTime(String year) {
        List<Map<String, Object>> maps = ordersMapper.ordersMonthTime(year);
        int a=maps.size();

        for(int i = 1; i <=12 ; i++){
            boolean b=true;
            for (Map<String, Object> map : maps) {
                int month =(Integer) map.get("month");
                //根据月份判断是否相同 有则删除 在添加
                if(i==month){
//                    Map<String,Object> mapss=new HashMap<>();
//                    mapss.put("month",month);
//                    mapss.put("ordersTotalmoney",ordersTotalmoney);
                    //先删除
//                    maps.remove(map);
                    //在添加
//                    maps.add(mapss);
                    b=false;
                    break;
                }
            }
            if(b){
                Map<String,Object> map=new HashMap<>();
                map.put("month",i);
                map.put("ordersTotalmoney",0);
                maps.add(map);
            }
        }

        if(null==maps)
            return new JsonResponseBody<>(ResponseStatus.STATUS_268);

        return new JsonResponseBody<>(maps);
    }

    @Override
    public JsonResponseBody<?> ordersyear() {
        List<Map<String, Object>> ordersyear = ordersMapper.ordersyear();
        if(ordersyear==null)
            return new JsonResponseBody<>(ResponseStatus.STATUS_202);

        return new JsonResponseBody<>(ordersyear);
    }

}
