package com.elite.commoditymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.commoditymanagement.dao.RoleMapper;
import com.elite.commoditymanagement.model.Role;
import com.elite.commoditymanagement.model.RoleExample;
import com.elite.commoditymanagement.service.RoleService;

/**
 * 
 * @author 莫庆来
 *
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper RoleMapper;

	public int insert(Role record) {
		return RoleMapper.insert(record);
	}

	public int deleteByPrimaryKey(Integer RoleId) {
		return RoleMapper.deleteByPrimaryKey(RoleId);
	}

	public int updateByPrimaryKeySelective(Role record) {
		return RoleMapper.updateByPrimaryKeySelective(record);
	}

	public List<Role> selectAllRole() {
		RoleExample example = new RoleExample();
		example.setDistinct(true);
		List<Role> list = RoleMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public Role selectByPrimaryKey(Integer RoleId) {
		return RoleMapper.selectByPrimaryKey(RoleId);
	}

}
