package com.zking.erp.base.controller;

import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.model.Orders;
import com.zking.erp.base.service.IOrdersService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import com.zking.erp.base.vo.OrdersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	@Autowired
	private IOrdersService ordersService;

	/**
	 * 销售统计分析
	 * @param record
	 * @param req
	 * @return
	 */
	@RequestMapping("/ordersTime")
	@ResponseBody
	public JsonResponseBody ordersTime(OrdersVo record, HttpServletRequest req){
		try {
			PageBean pageBean=new PageBean();
			pageBean.setRequest(req);
			return ordersService.ordersTimePager(record, pageBean);
		} catch (Exception e) {
			throw new BusinessException(ResponseStatus.STATUS_204);
		}
	}

	/**
	 * 销售趋势分析
	 * @param req
	 * @return
	 */
	@RequestMapping("/ordersMonthTime")
	@ResponseBody
	public JsonResponseBody ordersMonthTime(String year, HttpServletRequest req){
		try {
		return ordersService.ordersMonthTime(year);
	} catch (Exception e) {
		throw new BusinessException(ResponseStatus.STATUS_204);
	}
}


	/**
	 * 查询所有有年
	 * @return
	 */
	@RequestMapping("/ordersyear")
	@ResponseBody
	public JsonResponseBody ordersyear(){
		try {

			return ordersService.ordersyear();
		} catch (Exception e) {
			throw new BusinessException(ResponseStatus.STATUS_204);
		}
	}





}
