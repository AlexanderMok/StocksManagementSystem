package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.bean.BillInfo;

public interface StocksService {
	
	
	public List<BillInfo> selectByView();

	public List<BillInfo> selectByCondition(String condition);
}
