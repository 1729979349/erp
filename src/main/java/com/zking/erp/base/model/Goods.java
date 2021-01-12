package com.zking.erp.base.model;

import java.math.BigDecimal;

public class Goods {
    private Long goodsId;

    private String goodsName;

    private String goodsOrigin;

    private String goodsProducer;

    private String goodsUnit;

    private BigDecimal goodsInprice;

    private BigDecimal goodsOutprice;

    private Long goodsGoodstypeId;

    public Goods(Long goodsId, String goodsName, String goodsOrigin, String goodsProducer, String goodsUnit, BigDecimal goodsInprice, BigDecimal goodsOutprice, Long goodsGoodstypeId) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsOrigin = goodsOrigin;
        this.goodsProducer = goodsProducer;
        this.goodsUnit = goodsUnit;
        this.goodsInprice = goodsInprice;
        this.goodsOutprice = goodsOutprice;
        this.goodsGoodstypeId = goodsGoodstypeId;
    }

    public Goods() {
        super();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsOrigin() {
        return goodsOrigin;
    }

    public void setGoodsOrigin(String goodsOrigin) {
        this.goodsOrigin = goodsOrigin;
    }

    public String getGoodsProducer() {
        return goodsProducer;
    }

    public void setGoodsProducer(String goodsProducer) {
        this.goodsProducer = goodsProducer;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public BigDecimal getGoodsInprice() {
        return goodsInprice;
    }

    public void setGoodsInprice(BigDecimal goodsInprice) {
        this.goodsInprice = goodsInprice;
    }

    public BigDecimal getGoodsOutprice() {
        return goodsOutprice;
    }

    public void setGoodsOutprice(BigDecimal goodsOutprice) {
        this.goodsOutprice = goodsOutprice;
    }

    public Long getGoodsGoodstypeId() {
        return goodsGoodstypeId;
    }

    public void setGoodsGoodstypeId(Long goodsGoodstypeId) {
        this.goodsGoodstypeId = goodsGoodstypeId;
    }
}