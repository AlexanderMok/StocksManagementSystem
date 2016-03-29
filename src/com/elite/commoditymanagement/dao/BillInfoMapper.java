package com.elite.commoditymanagement.dao;

import java.util.List;

import com.elite.commoditymanagement.bean.BillInfo;
import com.elite.commoditymanagement.bean.BillInfoExample;

public interface BillInfoMapper {
	List<BillInfo> selectByView();

	List<BillInfo> selectByExample(BillInfoExample example);
}
