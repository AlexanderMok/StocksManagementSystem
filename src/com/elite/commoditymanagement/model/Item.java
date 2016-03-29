package com.elite.commoditymanagement.model;

public class Item {
    private String itemId;

    private String itemName;

    private Integer unitId;

    private Integer catagorgyId;

    private String suppId;

    private Double retailPrice;

    private String itemPic;

    private String note;

    private Long safeAmount;
    
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getCatagorgyId() {
        return catagorgyId;
    }

    public void setCatagorgyId(Integer catagorgyId) {
        this.catagorgyId = catagorgyId;
    }

    public String getSuppId() {
        return suppId;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId == null ? null : suppId.trim();
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getItemPic() {
        return itemPic;
    }

    public void setItemPic(String itemPic) {
        this.itemPic = itemPic == null ? null : itemPic.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Long getSafeAmount() {
        return safeAmount;
    }

    public void setSafeAmount(Long safeAmount) {
        this.safeAmount = safeAmount;
    }

}