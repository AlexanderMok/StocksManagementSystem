/**
 * 
 */
package com.elite.commoditymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.commoditymanagement.dao.SupplyerMapper;
import com.elite.commoditymanagement.model.Supplyer;
import com.elite.commoditymanagement.model.SupplyerExample;
import com.elite.commoditymanagement.model.SupplyerExample.Criteria;
import com.elite.commoditymanagement.service.SupplyerService;

/**
 * @author 莫庆来
 * 
 */
@Service
public class SupplyerServiceImpl implements SupplyerService {

	@Autowired
	private SupplyerMapper supplyerMapper;

	public int insert(Supplyer supplyer) {
		return supplyerMapper.insert(supplyer);
	}

	public int deleteByPrimaryKey(String suppId) {
		return supplyerMapper.deleteByPrimaryKey(suppId);
	}

	public int updateByPrimaryKeySelective(Supplyer supplyer) {
		return supplyerMapper.updateByPrimaryKeySelective(supplyer);
	}

	public List<Supplyer> getAllSupp() {
		SupplyerExample example = new SupplyerExample();
		List<Supplyer> list = supplyerMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public List<Supplyer> selectByName(String suppName) {
		SupplyerExample example = new SupplyerExample();
		Criteria criteria = example.createCriteria();
		criteria.andSuppNameEqualTo(suppName);
		List<Supplyer> list = supplyerMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public Supplyer selectByPrimaryKey(String suppId) {
		return supplyerMapper.selectByPrimaryKey(suppId);
	}


	public List<Supplyer> selectByCondition(String condition) {
		SupplyerExample example = new SupplyerExample();
		example.or().andSuppIdLike(condition);
		example.or().andSuppNameLike(condition);
		example.or().andAddressLike(condition);
		example.or().andPhoneLike(condition);
		example.or().andContactPersonLike(condition);
		example.or().andAccountLike(condition);
		example.or().andBankLike(condition);
		return supplyerMapper.selectByExample(example);
	}

}
