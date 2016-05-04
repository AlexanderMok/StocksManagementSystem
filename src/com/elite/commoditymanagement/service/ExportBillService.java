package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.model.ExportBill;

public interface ExportBillService {
	public int insert(ExportBill record);

	public List<ExportBill> selectByExample();

	public List<ExportBill> selectByItemId(String itemId);

	public ExportBill selectByPrimaryKey(String exportId);
}
