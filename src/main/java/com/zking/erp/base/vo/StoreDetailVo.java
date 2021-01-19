package com.zking.erp.base.vo;

import com.zking.erp.base.model.StoreDetail;
import lombok.Data;

@Data
public class StoreDetailVo extends StoreDetail {
   private String storeName;
    private  String remak;//采购申请
    private  String empEmail;//采购员邮箱
    private  String goodsName;//商品名称

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
