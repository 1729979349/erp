package com.zking.erp.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetail {
    private Long orderdetailId;

    private Long orderdetailGoodsId;

    private String orderdetailGoodsname;

    private BigDecimal orderdetailPrice;

    private Integer orderdetailNum;

    private BigDecimal orderdetailMoney;

    private Date orderdetailEndtime;

    private Long orderdetailEnder;

    private Long orderdetailStoreId;

    private String orderdetailState;

    private Long orderdetailOrdersId;

    public OrderDetail(Long orderdetailId, Long orderdetailGoodsId, String orderdetailGoodsname, BigDecimal orderdetailPrice, Integer orderdetailNum, BigDecimal orderdetailMoney, Date orderdetailEndtime, Long orderdetailEnder, Long orderdetailStoreId, String orderdetailState, Long orderdetailOrdersId) {
        this.orderdetailId = orderdetailId;
        this.orderdetailGoodsId = orderdetailGoodsId;
        this.orderdetailGoodsname = orderdetailGoodsname;
        this.orderdetailPrice = orderdetailPrice;
        this.orderdetailNum = orderdetailNum;
        this.orderdetailMoney = orderdetailMoney;
        this.orderdetailEndtime = orderdetailEndtime;
        this.orderdetailEnder = orderdetailEnder;
        this.orderdetailStoreId = orderdetailStoreId;
        this.orderdetailState = orderdetailState;
        this.orderdetailOrdersId = orderdetailOrdersId;
    }

    public OrderDetail() {
        super();
    }

    public Long getOrderdetailId() {
        return orderdetailId;
    }

    public void setOrderdetailId(Long orderdetailId) {
        this.orderdetailId = orderdetailId;
    }

    public Long getOrderdetailGoodsId() {
        return orderdetailGoodsId;
    }

    public void setOrderdetailGoodsId(Long orderdetailGoodsId) {
        this.orderdetailGoodsId = orderdetailGoodsId;
    }

    public String getOrderdetailGoodsname() {
        return orderdetailGoodsname;
    }

    public void setOrderdetailGoodsname(String orderdetailGoodsname) {
        this.orderdetailGoodsname = orderdetailGoodsname;
    }

    public BigDecimal getOrderdetailPrice() {
        return orderdetailPrice;
    }

    public void setOrderdetailPrice(BigDecimal orderdetailPrice) {
        this.orderdetailPrice = orderdetailPrice;
    }

    public Integer getOrderdetailNum() {
        return orderdetailNum;
    }

    public void setOrderdetailNum(Integer orderdetailNum) {
        this.orderdetailNum = orderdetailNum;
    }

    public BigDecimal getOrderdetailMoney() {
        return orderdetailMoney;
    }

    public void setOrderdetailMoney(BigDecimal orderdetailMoney) {
        this.orderdetailMoney = orderdetailMoney;
    }

    public Date getOrderdetailEndtime() {
        return orderdetailEndtime;
    }

    public void setOrderdetailEndtime(Date orderdetailEndtime) {
        this.orderdetailEndtime = orderdetailEndtime;
    }

    public Long getOrderdetailEnder() {
        return orderdetailEnder;
    }

    public void setOrderdetailEnder(Long orderdetailEnder) {
        this.orderdetailEnder = orderdetailEnder;
    }

    public Long getOrderdetailStoreId() {
        return orderdetailStoreId;
    }

    public void setOrderdetailStoreId(Long orderdetailStoreId) {
        this.orderdetailStoreId = orderdetailStoreId;
    }

    public String getOrderdetailState() {
        return orderdetailState;
    }

    public void setOrderdetailState(String orderdetailState) {
        this.orderdetailState = orderdetailState;
    }

    public Long getOrderdetailOrdersId() {
        return orderdetailOrdersId;
    }

    public void setOrderdetailOrdersId(Long orderdetailOrdersId) {
        this.orderdetailOrdersId = orderdetailOrdersId;
    }
}