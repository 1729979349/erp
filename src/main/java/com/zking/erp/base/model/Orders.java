package com.zking.erp.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Long ordersId;

    private Date ordersCreatetime;

    private Date ordersChecktime;

    private Date ordersStarttime;

    private Date ordersEndtime;

    private String ordersType;

    private Long ordersCreater;

    private Long ordersChecker;

    private Long ordersStarter;

    private Long ordersEnder;

    private Long ordersSupplierId;

    private BigDecimal ordersTotalmoney;

    private String ordersState;

    private String ordersWaybillsn;

    public Orders(Long ordersId, Date ordersCreatetime, Date ordersChecktime, Date ordersStarttime, Date ordersEndtime, String ordersType, Long ordersCreater, Long ordersChecker, Long ordersStarter, Long ordersEnder, Long ordersSupplierId, BigDecimal ordersTotalmoney, String ordersState, String ordersWaybillsn) {
        this.ordersId = ordersId;
        this.ordersCreatetime = ordersCreatetime;
        this.ordersChecktime = ordersChecktime;
        this.ordersStarttime = ordersStarttime;
        this.ordersEndtime = ordersEndtime;
        this.ordersType = ordersType;
        this.ordersCreater = ordersCreater;
        this.ordersChecker = ordersChecker;
        this.ordersStarter = ordersStarter;
        this.ordersEnder = ordersEnder;
        this.ordersSupplierId = ordersSupplierId;
        this.ordersTotalmoney = ordersTotalmoney;
        this.ordersState = ordersState;
        this.ordersWaybillsn = ordersWaybillsn;
    }

    public Orders() {
        super();
    }

    public Long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Long ordersId) {
        this.ordersId = ordersId;
    }

    public Date getOrdersCreatetime() {
        return ordersCreatetime;
    }

    public void setOrdersCreatetime(Date ordersCreatetime) {
        this.ordersCreatetime = ordersCreatetime;
    }

    public Date getOrdersChecktime() {
        return ordersChecktime;
    }

    public void setOrdersChecktime(Date ordersChecktime) {
        this.ordersChecktime = ordersChecktime;
    }

    public Date getOrdersStarttime() {
        return ordersStarttime;
    }

    public void setOrdersStarttime(Date ordersStarttime) {
        this.ordersStarttime = ordersStarttime;
    }

    public Date getOrdersEndtime() {
        return ordersEndtime;
    }

    public void setOrdersEndtime(Date ordersEndtime) {
        this.ordersEndtime = ordersEndtime;
    }

    public String getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(String ordersType) {
        this.ordersType = ordersType;
    }

    public Long getOrdersCreater() {
        return ordersCreater;
    }

    public void setOrdersCreater(Long ordersCreater) {
        this.ordersCreater = ordersCreater;
    }

    public Long getOrdersChecker() {
        return ordersChecker;
    }

    public void setOrdersChecker(Long ordersChecker) {
        this.ordersChecker = ordersChecker;
    }

    public Long getOrdersStarter() {
        return ordersStarter;
    }

    public void setOrdersStarter(Long ordersStarter) {
        this.ordersStarter = ordersStarter;
    }

    public Long getOrdersEnder() {
        return ordersEnder;
    }

    public void setOrdersEnder(Long ordersEnder) {
        this.ordersEnder = ordersEnder;
    }

    public Long getOrdersSupplierId() {
        return ordersSupplierId;
    }

    public void setOrdersSupplierId(Long ordersSupplierId) {
        this.ordersSupplierId = ordersSupplierId;
    }

    public BigDecimal getOrdersTotalmoney() {
        return ordersTotalmoney;
    }

    public void setOrdersTotalmoney(BigDecimal ordersTotalmoney) {
        this.ordersTotalmoney = ordersTotalmoney;
    }

    public String getOrdersState() {
        return ordersState;
    }

    public void setOrdersState(String ordersState) {
        this.ordersState = ordersState;
    }

    public String getOrdersWaybillsn() {
        return ordersWaybillsn;
    }

    public void setOrdersWaybillsn(String ordersWaybillsn) {
        this.ordersWaybillsn = ordersWaybillsn;
    }
}