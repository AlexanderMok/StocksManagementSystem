package com.elite.commoditymanagement.bean;

import java.util.Date;
/**
 * 
 * @author 莫庆来
 * @DESCRIPTOIN 流水记录视图BIllInfoView
 */
public class BillInfo {
	// 流水编号
	private Long id;
	// 库存操作标记
	private String actionTag;
	// 操作编号
	private String actionId;

	private String itemId;
	// 商品名称
	private String itemName;
	// 价格
	private Double actionPrice;
	// 操作数量
	private Integer actionAmount;
	// 供应商名称
	private String suppName;
	// 操作时间
	private Date actionDate;
	// 操作人
	private String actionPerson;
	// 备注
	private String note;
	//商品类别
	private String cataName;
	//商品单位名称
	private String unitName;
	
	private String suppId;

	public BillInfo() {
	}

	public BillInfo(Long id, String actionTag, String actionId, String itemId,
			String itemName, Double actionPrice, Integer actionAmount,
			String suppName, Date actionDate, String actionPerson, String note) {
		super();
		this.id = id;
		this.actionTag = actionTag;
		this.actionId = actionId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.actionPrice = actionPrice;
		this.actionAmount = actionAmount;
		this.suppName = suppName;
		this.actionDate = actionDate;
		this.actionPerson = actionPerson;
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActionTag() {
		return actionTag;
	}

	public void setActionTag(String actionTag) {
		this.actionTag = actionTag;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public String getSuppName() {
		return suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
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
		this.actionPerson = actionPerson;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCataName() {
		return cataName;
	}

	public void setCataName(String cataName) {
		this.cataName = cataName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getSuppId() {
		return suppId;
	}

	public void setSuppId(String suppId) {
		this.suppId = suppId;
	}

}
