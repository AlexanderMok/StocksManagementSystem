package com.elite.commoditymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.commoditymanagement.dao.CatagorgyMapper;
import com.elite.commoditymanagement.model.Catagorgy;
import com.elite.commoditymanagement.model.CatagorgyExample;
import com.elite.commoditymanagement.model.CatagorgyExample.Criteria;
import com.elite.commoditymanagement.service.CatagorgyService;

/**
 * 
 * @author 莫庆来
 *
 */
@Service
public class CatagorgyServiceImpl implements CatagorgyService {

	@Autowired
	private CatagorgyMapper catagorgyMapper;

	public int insert(Catagorgy record) {
		return catagorgyMapper.insert(record);
	}

	public int deleteByPrimaryKey(Integer catagorgyId) {
		return catagorgyMapper.deleteByPrimaryKey(catagorgyId);
	}

	public int updateByPrimaryKeySelective(Catagorgy record) {
		return catagorgyMapper.updateByPrimaryKeySelective(record);
	}

	public List<Catagorgy> selectAllCatagorgy() {
		CatagorgyExample example = new CatagorgyExample();
		example.setDistinct(true);
		List<Catagorgy> list = catagorgyMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public Catagorgy selectByPrimaryKey(Integer CatagorgyId) {
		return catagorgyMapper.selectByPrimaryKey(CatagorgyId);
	}
	
	public List<Catagorgy> selectByPid(Integer pid) {
		CatagorgyExample example = new CatagorgyExample();
		Criteria criteria = example.createCriteria();
		criteria.andCatagorgyParentIdEqualTo(pid);
		List<Catagorgy> list = catagorgyMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public int updateByPrimaryKey(Catagorgy record) {
		return catagorgyMapper.updateByPrimaryKey(record);
	}

	
	public List<Catagorgy> selectParent() {
		CatagorgyExample example = new CatagorgyExample();
		Criteria criteria = example.createCriteria();
		criteria.andCatagorgyParentIdLessThanOrEqualTo(3);
		List<Catagorgy> list = catagorgyMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public List<Catagorgy> selectByCondition(String string) {
		CatagorgyExample example = new CatagorgyExample();
		example.or().andCatagorgyNameLike(string);
		List<Catagorgy> list = catagorgyMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}
	
}
