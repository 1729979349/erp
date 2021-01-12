package com.zking.erp.base.model;

import java.util.Date;

public class Storeoper {
    private Long storeoperId;

    private Long storeoperEmpId;

    private Date storeoperOpertime;

    private Long storeoperStoreId;

    private Long storeoperGoodsId;

    private Integer storeoperNum;

    private String storeoperType;

    public Storeoper(Long storeoperId, Long storeoperEmpId, Date storeoperOpertime, Long storeoperStoreId, Long storeoperGoodsId, Integer storeoperNum, String storeoperType) {
        this.storeoperId = storeoperId;
        this.storeoperEmpId = storeoperEmpId;
        this.storeoperOpertime = storeoperOpertime;
        this.storeoperStoreId = storeoperStoreId;
        this.storeoperGoodsId = storeoperGoodsId;
        this.storeoperNum = storeoperNum;
        this.storeoperType = storeoperType;
    }

    public Storeoper() {
        super();
    }

    public Long getStoreoperId() {
        return storeoperId;
    }

    public void setStoreoperId(Long storeoperId) {
        this.storeoperId = storeoperId;
    }

    public Long getStoreoperEmpId() {
        return storeoperEmpId;
    }

    public void setStoreoperEmpId(Long storeoperEmpId) {
        this.storeoperEmpId = storeoperEmpId;
    }

    public Date getStoreoperOpertime() {
        return storeoperOpertime;
    }

    public void setStoreoperOpertime(Date storeoperOpertime) {
        this.storeoperOpertime = storeoperOpertime;
    }

    public Long getStoreoperStoreId() {
        return storeoperStoreId;
    }

    public void setStoreoperStoreId(Long storeoperStoreId) {
        this.storeoperStoreId = storeoperStoreId;
    }

    public Long getStoreoperGoodsId() {
        return storeoperGoodsId;
    }

    public void setStoreoperGoodsId(Long storeoperGoodsId) {
        this.storeoperGoodsId = storeoperGoodsId;
    }

    public Integer getStoreoperNum() {
        return storeoperNum;
    }

    public void setStoreoperNum(Integer storeoperNum) {
        this.storeoperNum = storeoperNum;
    }

    public String getStoreoperType() {
        return storeoperType;
    }

    public void setStoreoperType(String storeoperType) {
        this.storeoperType = storeoperType;
    }
}