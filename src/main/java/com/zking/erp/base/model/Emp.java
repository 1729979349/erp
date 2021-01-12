package com.zking.erp.base.model;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {

    private Long empId;

    private String empUsername;

    private String empPwd;

    private String empName;

    private Integer empGender;

    private String empEmail;

    private String empTele;

    private String empAddress;

    private Date empBirthday;

    private Long empDepId;

    public Emp(Long empId, String empUsername, String empPwd, String empName, Integer empGender, String empEmail, String empTele, String empAddress, Date empBirthday, Long empDepId) {
        this.empId = empId;
        this.empUsername = empUsername;
        this.empPwd = empPwd;
        this.empName = empName;
        this.empGender = empGender;
        this.empEmail = empEmail;
        this.empTele = empTele;
        this.empAddress = empAddress;
        this.empBirthday = empBirthday;
        this.empDepId = empDepId;
    }

    public Emp() {
        super();
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpUsername() {
        return empUsername;
    }

    public void setEmpUsername(String empUsername) {
        this.empUsername = empUsername;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpGender() {
        return empGender;
    }

    public void setEmpGender(Integer empGender) {
        this.empGender = empGender;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpTele() {
        return empTele;
    }

    public void setEmpTele(String empTele) {
        this.empTele = empTele;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Date getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(Date empBirthday) {
        this.empBirthday = empBirthday;
    }

    public Long getEmpDepId() {
        return empDepId;
    }

    public void setEmpDepId(Long empDepId) {
        this.empDepId = empDepId;
    }
}