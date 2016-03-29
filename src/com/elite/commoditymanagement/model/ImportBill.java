package com.elite.commoditymanagement.model;

import java.util.Date;

public class ImportBill {
    private String importId;

    private String itemId;

    private Double importPrice;

    private Integer importAmount;

    private String suppId;

    private Date importDate;

    private String importPerson;

    private String note;

    public String getImportId() {
        return importId;
    }

    public void setImportId(String importId) {
        this.importId = importId == null ? null : importId.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public Double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Double importPrice) {
        this.importPrice = importPrice;
    }

    public Integer getImportAmount() {
        return importAmount;
    }

    public void setImportAmount(Integer importAmount) {
        this.importAmount = importAmount;
    }

    public String getSuppId() {
        return suppId;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId == null ? null : suppId.trim();
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public String getImportPerson() {
        return importPerson;
    }

    public void setImportPerson(String importPerson) {
        this.importPerson = importPerson == null ? null : importPerson.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}