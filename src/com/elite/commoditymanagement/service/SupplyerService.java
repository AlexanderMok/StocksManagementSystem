package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.model.Supplyer;

public interface SupplyerService {
	int insert(Supplyer supplyer);

	int deleteByPrimaryKey(String suppId);

	int updateByPrimaryKeySelective(Supplyer supplyer);

	List<Supplyer> getAllSupp();

	List<Supplyer> selectByName(String suppName);

	Supplyer selectByPrimaryKey(String suppId);

	List<Supplyer> selectByCondition(String string);
}
