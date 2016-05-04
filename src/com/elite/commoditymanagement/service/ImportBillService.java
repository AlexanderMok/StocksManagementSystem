package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.model.ImportBill;

public interface ImportBillService {
	
	int insert(ImportBill record);
	
	List<ImportBill> selectByExample();
	
	List<ImportBill> selectByItemId(String itemId);
	
	ImportBill selectByPrimaryKey(String importId);
}
