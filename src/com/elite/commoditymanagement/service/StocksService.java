package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.bean.BillInfo;
import com.elite.commoditymanagement.model.Bill;

public interface StocksService {
	
	
	public List<BillInfo> selectByView();

	public List<BillInfo> selectByCondition(String condition);
	
	public List<Bill> selectByBill();

	public List<Bill> selectByBillCondition(String string);
}
