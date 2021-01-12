package com.zking.erp.base.model;

import java.io.Serializable;

public class RoleMenu implements Serializable {
    private Long roleId;

    private String menuId;

    public RoleMenu(Long roleId, String menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

    public RoleMenu() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}