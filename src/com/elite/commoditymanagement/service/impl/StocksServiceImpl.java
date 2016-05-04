package com.elite.commoditymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.commoditymanagement.bean.BillInfo;
import com.elite.commoditymanagement.bean.BillInfoExample;
import com.elite.commoditymanagement.dao.BillInfoMapper;
import com.elite.commoditymanagement.dao.BillMapper;
import com.elite.commoditymanagement.model.Bill;
import com.elite.commoditymanagement.model.BillExample;
import com.elite.commoditymanagement.service.StocksService;

/**
 * 
 * @author 莫庆来
 * @DESCRIPTOIN 库存操作
 */
@Service
public class StocksServiceImpl implements StocksService {

	@Autowired
	private BillInfoMapper billInfoMapper;
	@Autowired
	private BillMapper billMapper;

	/**
	 * 
	 * @author 莫庆来
	 * @DESCRIPTOIN 查询流水记录视图BIllInfoView
	 * @TODO 查询视图所有记录，默认按操作时间降序排列
	 */
	public List<BillInfo> selectByView() {
		return billInfoMapper.selectByView();
	}

	/**
	 * 
	 * @author 莫庆来
	 * @DESCRIPTOIN 照着造了一个BillInfoExample类，并在andXXXlike()方法中中增加binary，保证不报错 1271
	 *              Illegal mix of collations for operation 'like'
	 * @TODO 模糊查询，但资源消耗大             
	 */
	public List<BillInfo> selectByCondition(String condition) {
		BillInfoExample example = new BillInfoExample();
		example.or().andActionIdLike(condition);
		example.or().andItemNameLike(condition);
		example.or().andActionTagLike(condition);
		example.or().andActionPriceLike(condition);
		example.or().andActionAmountLike(condition);
		example.or().andSuppNameLike(condition);
		example.or().andActionDateLike(condition);
		example.or().andActionPersonLike(condition);
		example.or().andNoteLike(condition);
		return billInfoMapper.selectByExample(example);
	}
	
	public List<Bill> selectByBill() {
		return billMapper.selectByBill();
	}
	
	public List<Bill> selectByBillCondition(String condition) {
		BillExample example = new BillExample();
		example.or().andActionIdLike(condition);
		example.or().andItemNameLike(condition);
		example.or().andActionTagLike(condition);
		example.or().andActionPriceLike(condition);
		example.or().andActionAmountLike(condition);
		example.or().andSuppNameLike(condition);
		example.or().andActionDateLike(condition);
		example.or().andActionPersonLike(condition);
		example.or().andNoteLike(condition);
		return billMapper.selectByExample(example);
	}
}
