package com.zking.erp.base.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zking.erp.base.model.Inventory;
import org.springframework.format.annotation.DateTimeFormat;

public class InventoryVo extends Inventory {
    /*private Integer inventoryId;
    private String storename;
    private String goodsname;
    private */
    private String statusinventoryCreatetime;
    private String endinventoryChecktime;
    private String statusinventoryCreatetime2;
    private String endinventoryChecktime2;

    public String getStatusinventoryCreatetime2() {
        return statusinventoryCreatetime2;
    }

    public void setStatusinventoryCreatetime2(String statusinventoryCreatetime2) {
        this.statusinventoryCreatetime2 = statusinventoryCreatetime2;
    }

    public String getEndinventoryChecktime2() {
        return endinventoryChecktime2;
    }

    public void setEndinventoryChecktime2(String endinventoryChecktime2) {
        this.endinventoryChecktime2 = endinventoryChecktime2;
    }

    public String getStatusinventoryCreatetime() {
        return statusinventoryCreatetime;
    }

    public void setStatusinventoryCreatetime(String statusinventoryCreatetime) {
        this.statusinventoryCreatetime = statusinventoryCreatetime;
    }

    public String getEndinventoryChecktime() {
        return endinventoryChecktime;
    }

    public void setEndinventoryChecktime(String endinventoryChecktime) {
        this.endinventoryChecktime = endinventoryChecktime;
    }
}
