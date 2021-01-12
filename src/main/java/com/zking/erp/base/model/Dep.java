package com.zking.erp.base.model;

public class Dep {
    private Long depId;

    private String depName;

    private String depTele;

    public Dep(Long depId, String depName, String depTele) {
        this.depId = depId;
        this.depName = depName;
        this.depTele = depTele;
    }

    public Dep() {
        super();
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepTele() {
        return depTele;
    }

    public void setDepTele(String depTele) {
        this.depTele = depTele;
    }
}