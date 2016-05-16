package com.elite.commoditymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.commoditymanagement.dao.UserMapper;
import com.elite.commoditymanagement.model.User;
import com.elite.commoditymanagement.model.UserExample;
import com.elite.commoditymanagement.model.UserExample.Criteria;
import com.elite.commoditymanagement.service.UserService;
import com.elite.commoditymanagement.util.Encription;

/**
 * 
 * @author 莫庆来
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserMapper userMapper;
	
	public int insert(User user) throws Exception {
		//加密数据
	    String str = Encription.encrypt(user.getPassword(), "Eng");
	    user.setPassword(str);
		return userMapper.insert(user);
	}

	public int deleteByPrimaryKey(Integer userId) {
		return userMapper.deleteByPrimaryKey(userId);
	}

	public List<User> getAllUsers() {
		List<User> list = userMapper.selectAllUser();
		return list.size() > 0 ? list : null;
	}

	public List<User> selectByName(String userName) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(userName);
		List<User> list = userMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public List<User> selectByPrimaryKey(Integer userId) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<User> list = userMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public Boolean selectByNamePass(String userName, String password) throws Exception {
        UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(userName);
		//根据用户名查询数据，得到相应密码，再解密，对比是否匹配
		String pass = userMapper.selectByExample(example).get(0).getPassword();
		//加密，密钥为Eng
		String str = Encription.decrypt(pass, "Eng");
		
		if(new String(str).equals(password)){
			return true;
		}
		return false;
	}

	public int updateByPrimaryKey(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	public int updateByPrimaryKeySelective(User user) throws Exception {
		//加密数据
		String str = Encription.encrypt(user.getPassword(), "Eng");
		user.setPassword(str);
		return userMapper.updateByPrimaryKeySelective(user);
	}

	public List<User> selectByCondition(String condition) {
		UserExample example = new UserExample();
		example.or().andUserNameLike(condition);
		example.or().andWorkCodeLike(condition);
		example.or().andRoleNameLike(condition);
		List<User> list =  userMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

}
