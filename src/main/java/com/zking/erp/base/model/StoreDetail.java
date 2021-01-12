package com.zking.erp.base.model;

public class StoreDetail {
    private Long storedetailId;

    private Long storedetailStoreId;

    private Long storedetailGoodsId;

    private Integer storedetailNum;

    public StoreDetail(Long storedetailId, Long storedetailStoreId, Long storedetailGoodsId, Integer storedetailNum) {
        this.storedetailId = storedetailId;
        this.storedetailStoreId = storedetailStoreId;
        this.storedetailGoodsId = storedetailGoodsId;
        this.storedetailNum = storedetailNum;
    }

    public StoreDetail() {
        super();
    }

    public Long getStoredetailId() {
        return storedetailId;
    }

    public void setStoredetailId(Long storedetailId) {
        this.storedetailId = storedetailId;
    }

    public Long getStoredetailStoreId() {
        return storedetailStoreId;
    }

    public void setStoredetailStoreId(Long storedetailStoreId) {
        this.storedetailStoreId = storedetailStoreId;
    }

    public Long getStoredetailGoodsId() {
        return storedetailGoodsId;
    }

    public void setStoredetailGoodsId(Long storedetailGoodsId) {
        this.storedetailGoodsId = storedetailGoodsId;
    }

    public Integer getStoredetailNum() {
        return storedetailNum;
    }

    public void setStoredetailNum(Integer storedetailNum) {
        this.storedetailNum = storedetailNum;
    }
}