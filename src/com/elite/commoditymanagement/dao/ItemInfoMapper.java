package com.elite.commoditymanagement.dao;

import java.util.List;

import com.elite.commoditymanagement.bean.ItemInfo;
import com.elite.commoditymanagement.bean.ItemInfoExample;

public interface ItemInfoMapper {
	List<ItemInfo> selectByView();

	List<ItemInfo> selectByExample(ItemInfoExample example);
	
	Integer selectStocksById(String itemId);

	List<ItemInfo> selectByStocks();
}
