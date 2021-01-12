package com.zking.erp.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class Returnorderdetail {
    private Long returnorderdetailId;

    private Long returnorderdetailGoodsId;

    private String returnorderdetailGoodsname;

    private BigDecimal returnorderdetailPrice;

    private Integer returnorderdetailNum;

    private BigDecimal returnorderdetailMoney;

    private Date returnorderdetailEndtime;

    private Long returnorderdetailEnder;

    private Long returnorderdetailStoreId;

    private String returnorderdetailState;

    private Long returnorderdetailOrdersId;

    public Returnorderdetail(Long returnorderdetailId, Long returnorderdetailGoodsId, String returnorderdetailGoodsname, BigDecimal returnorderdetailPrice, Integer returnorderdetailNum, BigDecimal returnorderdetailMoney, Date returnorderdetailEndtime, Long returnorderdetailEnder, Long returnorderdetailStoreId, String returnorderdetailState, Long returnorderdetailOrdersId) {
        this.returnorderdetailId = returnorderdetailId;
        this.returnorderdetailGoodsId = returnorderdetailGoodsId;
        this.returnorderdetailGoodsname = returnorderdetailGoodsname;
        this.returnorderdetailPrice = returnorderdetailPrice;
        this.returnorderdetailNum = returnorderdetailNum;
        this.returnorderdetailMoney = returnorderdetailMoney;
        this.returnorderdetailEndtime = returnorderdetailEndtime;
        this.returnorderdetailEnder = returnorderdetailEnder;
        this.returnorderdetailStoreId = returnorderdetailStoreId;
        this.returnorderdetailState = returnorderdetailState;
        this.returnorderdetailOrdersId = returnorderdetailOrdersId;
    }

    public Returnorderdetail() {
        super();
    }

    public Long getReturnorderdetailId() {
        return returnorderdetailId;
    }

    public void setReturnorderdetailId(Long returnorderdetailId) {
        this.returnorderdetailId = returnorderdetailId;
    }

    public Long getReturnorderdetailGoodsId() {
        return returnorderdetailGoodsId;
    }

    public void setReturnorderdetailGoodsId(Long returnorderdetailGoodsId) {
        this.returnorderdetailGoodsId = returnorderdetailGoodsId;
    }

    public String getReturnorderdetailGoodsname() {
        return returnorderdetailGoodsname;
    }

    public void setReturnorderdetailGoodsname(String returnorderdetailGoodsname) {
        this.returnorderdetailGoodsname = returnorderdetailGoodsname;
    }

    public BigDecimal getReturnorderdetailPrice() {
        return returnorderdetailPrice;
    }

    public void setReturnorderdetailPrice(BigDecimal returnorderdetailPrice) {
        this.returnorderdetailPrice = returnorderdetailPrice;
    }

    public Integer getReturnorderdetailNum() {
        return returnorderdetailNum;
    }

    public void setReturnorderdetailNum(Integer returnorderdetailNum) {
        this.returnorderdetailNum = returnorderdetailNum;
    }

    public BigDecimal getReturnorderdetailMoney() {
        return returnorderdetailMoney;
    }

    public void setReturnorderdetailMoney(BigDecimal returnorderdetailMoney) {
        this.returnorderdetailMoney = returnorderdetailMoney;
    }

    public Date getReturnorderdetailEndtime() {
        return returnorderdetailEndtime;
    }

    public void setReturnorderdetailEndtime(Date returnorderdetailEndtime) {
        this.returnorderdetailEndtime = returnorderdetailEndtime;
    }

    public Long getReturnorderdetailEnder() {
        return returnorderdetailEnder;
    }

    public void setReturnorderdetailEnder(Long returnorderdetailEnder) {
        this.returnorderdetailEnder = returnorderdetailEnder;
    }

    public Long getReturnorderdetailStoreId() {
        return returnorderdetailStoreId;
    }

    public void setReturnorderdetailStoreId(Long returnorderdetailStoreId) {
        this.returnorderdetailStoreId = returnorderdetailStoreId;
    }

    public String getReturnorderdetailState() {
        return returnorderdetailState;
    }

    public void setReturnorderdetailState(String returnorderdetailState) {
        this.returnorderdetailState = returnorderdetailState;
    }

    public Long getReturnorderdetailOrdersId() {
        return returnorderdetailOrdersId;
    }

    public void setReturnorderdetailOrdersId(Long returnorderdetailOrdersId) {
        this.returnorderdetailOrdersId = returnorderdetailOrdersId;
    }
}