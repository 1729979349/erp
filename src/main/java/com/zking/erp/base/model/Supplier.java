package com.zking.erp.base.model;

public class Supplier {
    private Long supplierId;

    private String supplierName;

    private String supplierAddress;

    private String supplierContact;

    private String supplierTele;

    private String supplierEmail;

    private Long supplierType;

    public Supplier(Long supplierId, String supplierName, String supplierAddress, String supplierContact, String supplierTele, String supplierEmail, Long supplierType) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierContact = supplierContact;
        this.supplierTele = supplierTele;
        this.supplierEmail = supplierEmail;
        this.supplierType = supplierType;
    }

    public Supplier() {
        super();
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(String supplierContact) {
        this.supplierContact = supplierContact;
    }

    public String getSupplierTele() {
        return supplierTele;
    }

    public void setSupplierTele(String supplierTele) {
        this.supplierTele = supplierTele;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public Long getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(Long supplierType) {
        this.supplierType = supplierType;
    }
}