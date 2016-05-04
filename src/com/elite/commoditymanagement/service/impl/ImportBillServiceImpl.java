package com.elite.commoditymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.commoditymanagement.dao.ImportBillMapper;
import com.elite.commoditymanagement.model.ImportBill;
import com.elite.commoditymanagement.model.ImportBillExample;
import com.elite.commoditymanagement.model.ImportBillExample.Criteria;
import com.elite.commoditymanagement.service.ImportBillService;

/**
 * 
 * @author 莫庆来
 *
 */
@Service
public class ImportBillServiceImpl implements ImportBillService {

	@Autowired
	private ImportBillMapper importBillMapper;

	public int insert(ImportBill record) {
		return importBillMapper.insert(record);
	}
	
	public List<ImportBill> selectByExample() {
		ImportBillExample example = new ImportBillExample();
		List<ImportBill> list = importBillMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public List<ImportBill> selectByItemId(String itemId) {
		ImportBillExample example = new ImportBillExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(itemId);
		List<ImportBill> list = importBillMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public ImportBill selectByPrimaryKey(String importId) {
		return importBillMapper.selectByPrimaryKey(importId);
	}

}
