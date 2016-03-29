package com.elite.commoditymanagement.model;


public class Catagorgy {
    private Integer catagorgyId;

    private Integer catagorgyParentId;

    private String catagorgyName;
    
    public Integer getCatagorgyId() {
        return catagorgyId;
    }

    public void setCatagorgyId(Integer catagorgyId) {
        this.catagorgyId = catagorgyId;
    }

    public Integer getCatagorgyParentId() {
        return catagorgyParentId;
    }

    public void setCatagorgyParentId(Integer catagorgyParentId) {
        this.catagorgyParentId = catagorgyParentId;
    }

    public String getCatagorgyName() {
        return catagorgyName;
    }

    public void setCatagorgyName(String catagorgyName) {
        this.catagorgyName = catagorgyName == null ? null : catagorgyName.trim();
    }

}