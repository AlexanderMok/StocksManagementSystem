package com.elite.commoditymanagement.bean;

public class ItemInfo {
	
	private String itemId;
	private String itemName;
	private String cataName;
	private Double retailPrice;
	private Double importPrice;
	private Integer stocks;
	private String unitName;
	private String suppId;
	private String suppName;
	private String phone;
	private String contactPerson;
	private String note;
	private Integer safeAmount;
	private String itemPic;
	private String[] itemPaths;
	
	public ItemInfo() {
	}

	public ItemInfo(String itemId, String itemName, String cataName, Double retailPrice, Double importPrice,
			Integer stocks, String unitName, String suppId, String suppName, String phone, String contactPerson,
			String note, Integer safeAmount, String itemPic, String[] itemPaths) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.cataName = cataName;
		this.retailPrice = retailPrice;
		this.importPrice = importPrice;
		this.stocks = stocks;
		this.unitName = unitName;
		this.suppId = suppId;
		this.suppName = suppName;
		this.phone = phone;
		this.contactPerson = contactPerson;
		this.note = note;
		this.safeAmount = safeAmount;
		this.itemPic = itemPic;
		this.itemPaths = itemPaths;
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


	public String getCataName() {
		return cataName;
	}


	public void setCataName(String cataName) {
		this.cataName = cataName;
	}


	public Double getRetailPrice() {
		return retailPrice;
	}


	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}


	public Integer getStocks() {
		return stocks;
	}


	public void setStocks(Integer stocks) {
		this.stocks = stocks;
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


	public String getSuppName() {
		return suppName;
	}


	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getContactPerson() {
		return contactPerson;
	}


	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public Integer getSafeAmount() {
		return safeAmount;
	}


	public void setSafeAmount(Integer safeAmount) {
		this.safeAmount = safeAmount;
	}


	public String getItemPic() {
		return itemPic;
	}

	public void setItemPic(String itemPic) {
		this.itemPic = itemPic;
	}


	public String[] getItemPaths() {
		return itemPaths;
	}

	public void setItemPaths(String[] itemPaths) {
		this.itemPaths = itemPaths;
	}

	public Double getImportPrice() {
		return importPrice;
	}

	public void setImportPrice(Double importPrice) {
		this.importPrice = importPrice;
	}
	
}
