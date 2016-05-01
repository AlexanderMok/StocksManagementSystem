package com.elite.commoditymanagement.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.elite.commoditymanagement.bean.SuppInfo;
import com.elite.commoditymanagement.model.Item;
import com.elite.commoditymanagement.model.Supplyer;
import com.elite.commoditymanagement.service.ItemService;
import com.elite.commoditymanagement.service.SupplyerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@ParentPackage("admin")
@Result(name = "success", type = "redirectAction", location = "supplyer!list")
@Controller
public class SupplyerAction extends BaseAction {
	
	private static final long serialVersionUID = 7947987201655983234L;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private SupplyerService supplyerService;
	@Autowired
	private ItemService itemService;
	
	private List<Supplyer> suppList;
	private List<SuppInfo> list;
	private Supplyer supplyer;
	private String suppId;
	
	private Integer curPage = 1;//第一页
	private Integer pageSize = 5;//每页5个数据
	private Integer lastPage;
	private String order;
	private String sequence;
	
	//搜索条件
	private String condition;
	

	/**
	 * @author 莫庆来
	 * @DESCRIPTION 供应商列表 
	 * @return 供应商页面
	 */
	public HttpHeaders list() {
		try {
			log.debug("doing execute supplyer!list....");
			
			PageHelper.startPage(curPage, pageSize);
			if(order !=null && !order.equals("") && sequence != null && !sequence.equals("")){
				PageHelper.orderBy(order +" "+ sequence);
			}
			if(condition!=null && !condition.equals("")) {
				suppList = supplyerService.selectByCondition("%" + condition + "%");
			}else{
				suppList = supplyerService.getAllSupp();
			}
			PageInfo<Supplyer> page = new PageInfo<Supplyer>(suppList);
			lastPage = page.getLastPage();
			
			SuppInfo suppInfo;
			//需要某供应商对应的商品list，因此需要重新封装成SuppInfo对象
			list = new ArrayList<SuppInfo>();
			
			for (int i = 0; i < suppList.size(); i++) {
				suppInfo = new SuppInfo();
				
				Supplyer supp = suppList.get(i);
				String suppId = supp.getSuppId();
				
				// 获取该suppId下，该供应商供应的商品list
				List<Item> iList = itemService.selectBySuppId(suppId);
				suppInfo = new SuppInfo(suppId, supp.getSuppName(), supp.getAddress(), supp.getPhone(),
						supp.getContactPerson(), supp.getAccount(), supp.getBank(), iList);

				list.add(suppInfo);
			}
			
		} catch (Exception e) {
			log.error("supplyer!list -error: " + e.getMessage());
			System.out.println("SupplyerAction->list->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return new DefaultHttpHeaders("supplyer-list").disableCaching();
	}

	/**
	 * @TODO 跳转增加供应商页面
	 * @return 添加页面
	 */
	public HttpHeaders add() {
		return new DefaultHttpHeaders("supplyer-add").disableCaching();
	}

	/**
	 * @TODO 增加供应商页面，表单提交
	 * @return 添加后返回列表
	 */
	public HttpHeaders saveSupp() {
		try {
			log.debug("doing execute supplyer!saveSupp....");
			supplyerService.insert(supplyer);
		} catch (Exception e) {
			log.error("supplyer!saveSupp -error: " + e.getMessage());
			System.out.println("supplyerAction->saveSupp->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("supplyer-list").renderResult(SUCCESS);
	}

	/**
	 * @TODO 修改供应商
	 * @param suppId 请求到指定对象  修改页面有该对象信息
	 * @return 修改特定页面
	 */
	public HttpHeaders editSupp() {
		try {
			log.debug("doing execute supplyer!editSupp....");
			supplyer = supplyerService.selectByPrimaryKey(suppId);
		} catch (Exception e) {
			log.error("supplyer!editSupp -error: " + e.getMessage());
			System.out.println("supplyerAction->editSupp->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}	
		return new DefaultHttpHeaders("supplyer-edit").disableCaching();
	}

	/**
	 * @TODO 修改供应商，表单提交
	 * @return 修改后返回供应商列表
	 */
	public HttpHeaders updateSupp() {
		try {
			log.debug("doing execute supplyer!updateSupplyer....");
			supplyerService.updateByPrimaryKeySelective(supplyer);
			
		} catch (Exception e) {
			log.error("user!updateUser -error: " + e.getMessage());
			System.out.println("SupplyerAction->updateSupplyer->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("supplyer-list").renderResult(SUCCESS);
	}
	
	/**
	 * @TODO 删除供应商
	 * @return 删除后返回列表
	 */
	public HttpHeaders deleteSupp() {
		supplyerService.deleteByPrimaryKey(suppId);
		return new DefaultHttpHeaders("supplyer-list").renderResult(SUCCESS);
	}

	public List<Supplyer> getSuppList() {
		return suppList;
	}

	public List<SuppInfo> getList() {
		return list;
	}

	public Supplyer getSupplyer() {
		return supplyer;
	}

	public void setSupplyer(Supplyer supplyer) {
		this.supplyer = supplyer;
	}

	public String getSuppId() throws UnsupportedEncodingException {
		return URLDecoder.decode(suppId, "UTF-8");
	}

	public void setSuppId(String suppId) {
		this.suppId = suppId;
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

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
