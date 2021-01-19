package com.zking.erp.base.vo;

import com.zking.erp.base.model.Orders;
import lombok.Data;

import java.io.Serializable;
@Data
public class OrdersVo extends Orders implements Serializable {
	private String goodstypeNname;
	private String StartTime;
	private String EndTime;
}
