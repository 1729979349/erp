package com.zking.erp.base.model;

import java.io.Serializable;

public class EmpRole implements Serializable {
    private Long empId;

    private Long roleId;

    public EmpRole(Long empId, Long roleId) {
        this.empId = empId;
        this.roleId = roleId;
    }

    public EmpRole() {
        super();
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}