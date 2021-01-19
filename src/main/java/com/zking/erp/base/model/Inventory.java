package com.zking.erp.base.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Inventory {
    private Long inventoryId;

    private Long inventoryGoodsId;

    private Long inventoryStoreId;

    private Integer inventoryNum;

    private String inventoryType;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date inventoryCreatetime;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date inventoryChecktime;

    private Long inventoryCreater;

    private Long inventoryChecker;

    private String inventoryState;

    private String inventoryRemark;

    public Inventory(Long inventoryId, Long inventoryGoodsId, Long inventoryStoreId, Integer inventoryNum, String inventoryType, Date inventoryCreatetime, Date inventoryChecktime, Long inventoryCreater, Long inventoryChecker, String inventoryState, String inventoryRemark) {
        this.inventoryId = inventoryId;
        this.inventoryGoodsId = inventoryGoodsId;
        this.inventoryStoreId = inventoryStoreId;
        this.inventoryNum = inventoryNum;
        this.inventoryType = inventoryType;
        this.inventoryCreatetime = inventoryCreatetime;
        this.inventoryChecktime = inventoryChecktime;
        this.inventoryCreater = inventoryCreater;
        this.inventoryChecker = inventoryChecker;
        this.inventoryState = inventoryState;
        this.inventoryRemark = inventoryRemark;
    }

    public Inventory() {
        super();
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Long getInventoryGoodsId() {
        return inventoryGoodsId;
    }

    public void setInventoryGoodsId(Long inventoryGoodsId) {
        this.inventoryGoodsId = inventoryGoodsId;
    }

    public Long getInventoryStoreId() {
        return inventoryStoreId;
    }

    public void setInventoryStoreId(Long inventoryStoreId) {
        this.inventoryStoreId = inventoryStoreId;
    }

    public Integer getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(Integer inventoryNum) {
        this.inventoryNum = inventoryNum;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Date getInventoryCreatetime() {
        return inventoryCreatetime;
    }

    public void setInventoryCreatetime(Date inventoryCreatetime) {
        this.inventoryCreatetime = inventoryCreatetime;
    }

    public Date getInventoryChecktime() {
        return inventoryChecktime;
    }

    public void setInventoryChecktime(Date inventoryChecktime) {
        this.inventoryChecktime = inventoryChecktime;
    }

    public Long getInventoryCreater() {
        return inventoryCreater;
    }

    public void setInventoryCreater(Long inventoryCreater) {
        this.inventoryCreater = inventoryCreater;
    }

    public Long getInventoryChecker() {
        return inventoryChecker;
    }

    public void setInventoryChecker(Long inventoryChecker) {
        this.inventoryChecker = inventoryChecker;
    }

    public String getInventoryState() {
        return inventoryState;
    }

    public void setInventoryState(String inventoryState) {
        this.inventoryState = inventoryState;
    }

    public String getInventoryRemark() {
        return inventoryRemark;
    }

    public void setInventoryRemark(String inventoryRemark) {
        this.inventoryRemark = inventoryRemark;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId=" + inventoryId +
                ", inventoryGoodsId=" + inventoryGoodsId +
                ", inventoryStoreId=" + inventoryStoreId +
                ", inventoryNum=" + inventoryNum +
                ", inventoryType='" + inventoryType + '\'' +
                ", inventoryCreatetime=" + inventoryCreatetime +
                ", inventoryChecktime=" + inventoryChecktime +
                ", inventoryCreater=" + inventoryCreater +
                ", inventoryChecker=" + inventoryChecker +
                ", inventoryState='" + inventoryState + '\'' +
                ", inventoryRemark='" + inventoryRemark + '\'' +
                '}';
    }
}