package com.elite.commoditymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.commoditymanagement.dao.UnitMapper;
import com.elite.commoditymanagement.model.Unit;
import com.elite.commoditymanagement.model.UnitExample;
import com.elite.commoditymanagement.service.UnitService;

/**
 * 
 * @author 莫庆来
 *
 */
@Service
public class UnitServiceImpl implements UnitService {
	
	@Autowired
	private UnitMapper unitMapper;
	
	public int insert(Unit record) {
		return unitMapper.insert(record);
	}

	public int deleteByPrimaryKey(Integer unitId) {
		return unitMapper.deleteByPrimaryKey(unitId);
	}

	public int updateByPrimaryKeySelective(Unit record) {
		return unitMapper.updateByPrimaryKeySelective(record);
	}

	public List<Unit> selectAllUnit() {
		UnitExample example = new UnitExample();
		example.setDistinct(true);
		return unitMapper.selectByExample(example);
	}

	public Unit selectByPrimaryKey(Integer unitId) {
		return unitMapper.selectByPrimaryKey(unitId);
	}

	public List<Unit> selectByCondition(String condition) {
		UnitExample example = new UnitExample();
		example.or().andUnitNameLike(condition);
		return unitMapper.selectByExample(example);
	}
	
}
