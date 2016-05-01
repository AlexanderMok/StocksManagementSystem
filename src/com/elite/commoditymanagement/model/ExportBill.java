package com.elite.commoditymanagement.model;

import java.util.Date;

public class ExportBill {
    private String exportId;

    private String itemId;

    private Double exportPrice;

    private Integer exportAmount;

    private String suppId;

    private String exportDate;

    private String exportPerson;

    private String note;

    public String getExportId() {
        return exportId;
    }

    public void setExportId(String exportId) {
        this.exportId = exportId == null ? null : exportId.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public Double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(Double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public Integer getExportAmount() {
        return exportAmount;
    }

    public void setExportAmount(Integer exportAmount) {
        this.exportAmount = exportAmount;
    }

    public String getSuppId() {
        return suppId;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId == null ? null : suppId.trim();
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }

    public String getExportPerson() {
        return exportPerson;
    }

    public void setExportPerson(String exportPerson) {
        this.exportPerson = exportPerson == null ? null : exportPerson.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}