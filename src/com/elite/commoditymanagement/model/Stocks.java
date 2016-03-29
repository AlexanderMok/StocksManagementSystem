package com.elite.commoditymanagement.model;

public class Stocks {
    private String itemId;

    private Integer amount;

    private Long safeAmount;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getSafeAmount() {
        return safeAmount;
    }

    public void setSafeAmount(Long safeAmount) {
        this.safeAmount = safeAmount;
    }
}