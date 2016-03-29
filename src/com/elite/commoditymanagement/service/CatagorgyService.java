package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.model.Catagorgy;

public interface CatagorgyService {
	
	int insert(Catagorgy record);
	
	int deleteByPrimaryKey(Integer catagorgyId);
	
	int updateByPrimaryKeySelective(Catagorgy record);
	
	int updateByPrimaryKey(Catagorgy record);

	List<Catagorgy> selectAllCatagorgy();
	
	Catagorgy selectByPrimaryKey(Integer catagorgyId);

	List<Catagorgy> selectByPid(Integer pid);

	List<Catagorgy> selectByCondition(String condition);
}
