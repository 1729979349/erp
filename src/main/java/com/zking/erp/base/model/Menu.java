package com.zking.erp.base.model;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
    private String menuId;

    private String menuName;

    private String menuIcon;

    private String menuUrl;

    private String menuPid;

    private String menuFunction;

    private List<Menu> mlist;

    public List<Menu> getMlist() {
        return mlist;
    }

    public void setMlist(List<Menu> mlist) {
        this.mlist = mlist;
    }

    public Menu(String menuId, String menuName, String menuIcon, String menuUrl, String menuPid, String menuFunction) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuIcon = menuIcon;
        this.menuUrl = menuUrl;
        this.menuPid = menuPid;
        this.menuFunction = menuFunction;
    }

    public Menu() {
        super();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuPid() {
        return menuPid;
    }

    public void setMenuPid(String menuPid) {
        this.menuPid = menuPid;
    }

    public String getMenuFunction() {
        return menuFunction;
    }

    public void setMenuFunction(String menuFunction) {
        this.menuFunction = menuFunction;
    }
}