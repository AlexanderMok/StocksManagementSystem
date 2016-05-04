package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.bean.ItemInfo;
import com.elite.commoditymanagement.model.Item;

public interface ItemService {
	
	int insert(Item record);
	
	int deleteByExample();
	
	int deleteByPrimaryKey(String itemId);
	
	Item selectByPrimaryKey(String itemId);
	
	List<ItemInfo> selectStocksById(String itemId, String importPrice);
	
	List<ItemInfo> selectStocksById(String itemId);

	List<Item> selectBySuppId(String suppId);
	
	List<ItemInfo> selectByCondition(String condition);
	
	List<ItemInfo> selectByView();

	List<Item> selectAllItem();
	
	int updateByPrimaryKey(Item record);

	List<ItemInfo> selectByStocks();
}
