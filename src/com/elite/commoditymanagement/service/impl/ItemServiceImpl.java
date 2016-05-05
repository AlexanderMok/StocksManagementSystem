package com.elite.commoditymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.commoditymanagement.bean.ItemInfo;
import com.elite.commoditymanagement.bean.ItemInfoExample;
import com.elite.commoditymanagement.dao.ItemInfoMapper;
import com.elite.commoditymanagement.dao.ItemMapper;
import com.elite.commoditymanagement.model.Item;
import com.elite.commoditymanagement.model.ItemExample;
import com.elite.commoditymanagement.model.ItemExample.Criteria;
import com.elite.commoditymanagement.service.ItemService;
/**
 * 
 * @author 莫庆来
 *
 */
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;
	@Autowired
	private ItemInfoMapper itemInfoMapper;

	public int insert(Item record) {
		return itemMapper.insert(record);
	}

	public int deleteByExample() {
		ItemExample example = new ItemExample();
		return itemMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String itemId) {
		
		return itemMapper.deleteByPrimaryKey(itemId);
	}
	
	public List<ItemInfo> selectStocksById(String itemId, String importPrice) {
		ItemInfoExample example = new ItemInfoExample();
		com.elite.commoditymanagement.bean.ItemInfoExample.Criteria criteria = example
				.createCriteria();
		criteria.andItemIdEqualTo(itemId)
		.andImportPriceEquals(importPrice);
		return itemInfoMapper.selectByExample(example);
	}
	
	public List<ItemInfo> selectStocksById(String itemId) {
		ItemInfoExample example = new ItemInfoExample();
		com.elite.commoditymanagement.bean.ItemInfoExample.Criteria criteria = example
				.createCriteria();
		criteria.andItemIdEqualTo(itemId);
		return itemInfoMapper.selectByExample(example);
	}
	
	public List<ItemInfo> selectByCondition(String condition) {
		ItemInfoExample example = new ItemInfoExample();
		example.or().andItemIdLike(condition);
		example.or().andItemNameLike(condition);
		example.or().andNoteLike(condition);
		example.or().andRetailPriceLike(condition);
		example.or().andImportPriceLike(condition);
		example.or().andCataNameLike(condition);
		example.or().andUnitNameLike(condition);
		example.or().andContactPersonLike(condition);
		example.or().andStocksLike(condition);
		example.or().andSuppNameLike(condition);
		example.or().andPhoneLike(condition);
		example.or().andImportPriceLike(condition);
		List<ItemInfo> list = itemInfoMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}


	public List<Item> selectAllItem() {
		ItemExample example = new ItemExample();
		example.setOrderByClause("safe_amount asc");
		List<Item> list = itemMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public Item selectByPrimaryKey(String itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}

	public List<Item> selectBySuppId(String suppId) {
		ItemExample example = new ItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andSuppIdEqualTo(suppId);
		List<Item> list = itemMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public int updateByPrimaryKey(Item record) {
		return itemMapper.updateByPrimaryKey(record);
	}

	public List<ItemInfo> selectByView() {
		List<ItemInfo> list = itemInfoMapper.selectByView();
		return list.size() > 0 ? list : null;
	}

	public List<ItemInfo> selectByStocks() {
		
		return itemInfoMapper.selectByStocks();
	}

}
