package com.zking.erp.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class Returnorders {
    private Long returnordersId;

    private Date returnordersCreatetime;

    private Date returnordersChecktime;

    private Date returnordersEndtime;

    private String returnordersType;

    private Long returnordersCreater;

    private Long returnordersChecker;

    private Long returnordersEnder;

    private Long returnordersSupplierId;

    private BigDecimal returnordersTotalmoney;

    private String returnordersState;

    private String returnordersWaybillsn;

    private Long returnordersOrdersId;

    public Returnorders(Long returnordersId, Date returnordersCreatetime, Date returnordersChecktime, Date returnordersEndtime, String returnordersType, Long returnordersCreater, Long returnordersChecker, Long returnordersEnder, Long returnordersSupplierId, BigDecimal returnordersTotalmoney, String returnordersState, String returnordersWaybillsn, Long returnordersOrdersId) {
        this.returnordersId = returnordersId;
        this.returnordersCreatetime = returnordersCreatetime;
        this.returnordersChecktime = returnordersChecktime;
        this.returnordersEndtime = returnordersEndtime;
        this.returnordersType = returnordersType;
        this.returnordersCreater = returnordersCreater;
        this.returnordersChecker = returnordersChecker;
        this.returnordersEnder = returnordersEnder;
        this.returnordersSupplierId = returnordersSupplierId;
        this.returnordersTotalmoney = returnordersTotalmoney;
        this.returnordersState = returnordersState;
        this.returnordersWaybillsn = returnordersWaybillsn;
        this.returnordersOrdersId = returnordersOrdersId;
    }

    public Returnorders() {
        super();
    }

    public Long getReturnordersId() {
        return returnordersId;
    }

    public void setReturnordersId(Long returnordersId) {
        this.returnordersId = returnordersId;
    }

    public Date getReturnordersCreatetime() {
        return returnordersCreatetime;
    }

    public void setReturnordersCreatetime(Date returnordersCreatetime) {
        this.returnordersCreatetime = returnordersCreatetime;
    }

    public Date getReturnordersChecktime() {
        return returnordersChecktime;
    }

    public void setReturnordersChecktime(Date returnordersChecktime) {
        this.returnordersChecktime = returnordersChecktime;
    }

    public Date getReturnordersEndtime() {
        return returnordersEndtime;
    }

    public void setReturnordersEndtime(Date returnordersEndtime) {
        this.returnordersEndtime = returnordersEndtime;
    }

    public String getReturnordersType() {
        return returnordersType;
    }

    public void setReturnordersType(String returnordersType) {
        this.returnordersType = returnordersType;
    }

    public Long getReturnordersCreater() {
        return returnordersCreater;
    }

    public void setReturnordersCreater(Long returnordersCreater) {
        this.returnordersCreater = returnordersCreater;
    }

    public Long getReturnordersChecker() {
        return returnordersChecker;
    }

    public void setReturnordersChecker(Long returnordersChecker) {
        this.returnordersChecker = returnordersChecker;
    }

    public Long getReturnordersEnder() {
        return returnordersEnder;
    }

    public void setReturnordersEnder(Long returnordersEnder) {
        this.returnordersEnder = returnordersEnder;
    }

    public Long getReturnordersSupplierId() {
        return returnordersSupplierId;
    }

    public void setReturnordersSupplierId(Long returnordersSupplierId) {
        this.returnordersSupplierId = returnordersSupplierId;
    }

    public BigDecimal getReturnordersTotalmoney() {
        return returnordersTotalmoney;
    }

    public void setReturnordersTotalmoney(BigDecimal returnordersTotalmoney) {
        this.returnordersTotalmoney = returnordersTotalmoney;
    }

    public String getReturnordersState() {
        return returnordersState;
    }

    public void setReturnordersState(String returnordersState) {
        this.returnordersState = returnordersState;
    }

    public String getReturnordersWaybillsn() {
        return returnordersWaybillsn;
    }

    public void setReturnordersWaybillsn(String returnordersWaybillsn) {
        this.returnordersWaybillsn = returnordersWaybillsn;
    }

    public Long getReturnordersOrdersId() {
        return returnordersOrdersId;
    }

    public void setReturnordersOrdersId(Long returnordersOrdersId) {
        this.returnordersOrdersId = returnordersOrdersId;
    }
}