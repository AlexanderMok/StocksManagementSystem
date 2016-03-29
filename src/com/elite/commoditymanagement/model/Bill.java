package com.elite.commoditymanagement.model;

import java.util.Date;

public class Bill {
    private Long id;

    private Integer actionTag;

    private String actionId;

    private String itemId;

    private Double actionPrice;

    private Integer actionAmount;

    private String suppId;

    private Date actionDate;

    private String actionPerson;

    private String note;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getActionTag() {
        return actionTag;
    }

    public void setActionTag(Integer actionTag) {
        this.actionTag = actionTag;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId == null ? null : actionId.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public Double getActionPrice() {
        return actionPrice;
    }

    public void setActionPrice(Double actionPrice) {
        this.actionPrice = actionPrice;
    }

    public Integer getActionAmount() {
        return actionAmount;
    }

    public void setActionAmount(Integer actionAmount) {
        this.actionAmount = actionAmount;
    }

    public String getSuppId() {
        return suppId;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId == null ? null : suppId.trim();
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getActionPerson() {
        return actionPerson;
    }

    public void setActionPerson(String actionPerson) {
        this.actionPerson = actionPerson == null ? null : actionPerson.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

}