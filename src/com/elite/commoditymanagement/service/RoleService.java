package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.model.Role;

public interface RoleService {
	
	int insert(Role record);
	
	int deleteByPrimaryKey(Integer RoleId);
	
	int updateByPrimaryKeySelective(Role record);

	List<Role> selectAllRole();
	
	Role selectByPrimaryKey(Integer RoleId);
}
