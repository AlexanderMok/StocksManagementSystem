package com.elite.commoditymanagement.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.elite.commoditymanagement.bean.BillInfo;
import com.elite.commoditymanagement.model.Bill;
import com.elite.commoditymanagement.service.StocksService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author 莫庆来
 * @TODO 进出货流水记录
 */
@Controller
public class StocksAction extends BaseAction {

	private static final long serialVersionUID = -4890006443698420674L;
	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private StocksService stocksService;
	
	private List<BillInfo> billInfoList;
	private List<Bill> billList;

	//分页
	private Integer curPage = 1;//第一页
	private Integer pageSize = 7;//每页7个数据
	private Integer lastPage;
	private String order;
	private String sequence;
	
	//搜索条件
	private String condition;
	
	/**
	 * @author 莫庆来
	 * @DESCRIPTION 进货出货流水记录,视图查询
	 * @return 流水记录页面
	 */
	public HttpHeaders list() {
		try {
			log.debug("doing execute stocks!list....");
			
			PageHelper.startPage(curPage,pageSize);
			if(order !=null && !order.equals("") && sequence != null && !sequence.equals("")){
				PageHelper.orderBy(order +" "+ sequence);
			}
			if(condition!=null && !condition.equals("")) {
				billInfoList = stocksService.selectByCondition("%" + condition + "%");
			}else{
				billInfoList = stocksService.selectByView();
			}
			PageInfo<BillInfo> page = new PageInfo<BillInfo>(billInfoList);
			lastPage = page.getLastPage();
			
		} catch (Exception e) {
			log.error("stocks!list -error: " + e.getMessage());
			System.out.println("stocksAction->list->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return new DefaultHttpHeaders("bill-list").disableCaching();
	}
	
	
	public HttpHeaders billList() {
		try {
			log.debug("doing execute stocks!billList....");
			
			PageHelper.startPage(curPage,pageSize);
			if(order !=null && !order.equals("") && sequence != null && !sequence.equals("")){
				PageHelper.orderBy(order +" "+ sequence);
			}
			if(condition!=null && !condition.equals("")) {
				billList = stocksService.selectByBillCondition("%" + condition + "%");
			}else{
				billList = stocksService.selectByBill();
			}
			PageInfo<Bill> page = new PageInfo<Bill>(billList);
			lastPage = page.getLastPage();
			
		} catch (Exception e) {
			log.error("stocks!billList -error: " + e.getMessage());
			System.out.println("stocksAction->billList->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return new DefaultHttpHeaders("bill-noview-list").disableCaching();
	}
	
	

	public List<BillInfo> getBillInfoList() {
		return billInfoList;
	}

	
	public List<Bill> getBillList() {
		return billList;
	}

	//分页
	public Integer getCurPage() {
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getLastPage() {
		return lastPage;
	}

	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}
	
	//排序
	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
	
	/**
	 * 模糊查询条件，搜索功能用
	 */
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
		
}
