package com.elite.commoditymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.commoditymanagement.dao.ExportBillMapper;
import com.elite.commoditymanagement.model.ExportBill;
import com.elite.commoditymanagement.model.ExportBillExample;
import com.elite.commoditymanagement.model.ExportBillExample.Criteria;
import com.elite.commoditymanagement.service.ExportBillService;
/**
 * 
 * @author 莫庆来
 *
 */
@Service
public class ExportBillServiceImpl implements ExportBillService {

	@Autowired
	private ExportBillMapper exportBillMapper;

	public int insert(ExportBill record) {
		return exportBillMapper.insert(record);
	}

	public List<ExportBill> selectByExample() {
		ExportBillExample example = new ExportBillExample();
		List<ExportBill> list = exportBillMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	public Integer selectAmountByItemId(String itemId) {
		Integer amount = exportBillMapper.selectAmountByItemId(itemId);
		return amount == null ? null : amount;
	}

	public List<ExportBill> selectByItemId(String itemId) {
		ExportBillExample example = new ExportBillExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(itemId);
		List<ExportBill> list = exportBillMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

}
