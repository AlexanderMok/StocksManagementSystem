package com.elite.commoditymanagement.bean;

import java.util.List;

import com.elite.commoditymanagement.model.Item;

public class SuppInfo {
	 private String suppId;

	 private String suppName;

	 private String address;

	 private String phone;

	 private String contactPerson;

	 private String account;

	 private String bank;
	 
	 List<Item> itemList;
	 
	 

	public SuppInfo() {
	}
	
	
	public SuppInfo(String suppId, String suppName, String address, String phone, String contactPerson, String account,
			String bank, List<Item> itemList) {
		super();
		this.suppId = suppId;
		this.suppName = suppName;
		this.address = address;
		this.phone = phone;
		this.contactPerson = contactPerson;
		this.account = account;
		this.bank = bank;
		this.itemList = itemList;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	 
}
