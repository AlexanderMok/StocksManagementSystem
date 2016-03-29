package com.elite.commoditymanagement.service;

import java.util.List;

import com.elite.commoditymanagement.model.User;

public interface UserService {
	int insert(User user) throws Exception;

	int deleteByPrimaryKey(Integer userId);

	int updateByPrimaryKey(User user);
	
	int updateByPrimaryKeySelective(User user) throws Exception;

	List<User> getAllUsers();

	List<User> selectByName(String userName);

	List<User> selectByPrimaryKey(Integer userId);

	Boolean selectByNamePass(String userName, String password) throws Exception;

	List<User> selectByCondition(String condition);
}
