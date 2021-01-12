package com.zking.erp.base.model;

public class Store {
    private Long storeId;

    private String storeName;

    private Long storeEmpId;

    private String storeAddress;

    public Store(Long storeId, String storeName, Long storeEmpId, String storeAddress) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeEmpId = storeEmpId;
        this.storeAddress = storeAddress;
    }

    public Store() {
        super();
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Long getStoreEmpId() {
        return storeEmpId;
    }

    public void setStoreEmpId(Long storeEmpId) {
        this.storeEmpId = storeEmpId;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }
}