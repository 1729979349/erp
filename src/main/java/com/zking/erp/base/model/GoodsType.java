package com.zking.erp.base.model;

public class GoodsType {
    private Long goodstypeId;

    private String goodstypeName;

    public GoodsType(Long goodstypeId, String goodstypeName) {
        this.goodstypeId = goodstypeId;
        this.goodstypeName = goodstypeName;
    }

    public GoodsType() {
        super();
    }

    public Long getGoodstypeId() {
        return goodstypeId;
    }

    public void setGoodstypeId(Long goodstypeId) {
        this.goodstypeId = goodstypeId;
    }

    public String getGoodstypeName() {
        return goodstypeName;
    }

    public void setGoodstypeName(String goodstypeName) {
        this.goodstypeName = goodstypeName;
    }
}