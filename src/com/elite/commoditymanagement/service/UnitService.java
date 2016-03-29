package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.model.Unit;

public interface UnitService {
	
	int insert(Unit record);
	
	int deleteByPrimaryKey(Integer unitId);
	
	int updateByPrimaryKeySelective(Unit record);

	List<Unit> selectAllUnit();
	
	Unit selectByPrimaryKey(Integer unitId);

	List<Unit> selectByCondition(String condition);
}
