package com.elite.commoditymanagement.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.elite.commoditymanagement.model.Unit;
import com.elite.commoditymanagement.service.UnitService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@ParentPackage("admin")
@Result(name = "success", type = "redirectAction", location = "unit!list")
@Controller
public class UnitAction extends BaseAction {

	private static final long serialVersionUID = -6291266518510842956L;

	private Logger log = Logger.getLogger(this.getClass());

	@Autowired
	private UnitService unitService;

	private List<Unit> unitList;
	private Unit unit;
	private Integer unitId;
	private String unitName;
	
	private Integer curPage = 1;//第一页
	private Integer pageSize = 5;//每页7个数据
	private Integer lastPage;
	private String order;
	private String sequence;
	
	//搜索条件
	private String condition;
	
	/**
	 * @TODO 商品单位列表
	 * @return 商品单位页面
	 */
	public HttpHeaders list() {
		try {
			log.debug("doing execute unit!list....");
			
			PageHelper.startPage(curPage,pageSize);
			if(order !=null && !order.equals("") && sequence != null && !sequence.equals("")){
				PageHelper.orderBy(order +" "+ sequence);
			}
			if(condition!=null && !condition.equals("")) {
				unitList = unitService.selectByCondition("%" + condition + "%");
			}else{
				unitList = unitService.selectAllUnit();
			}
			PageInfo<Unit> page = new PageInfo<Unit>(unitList);
			lastPage = page.getLastPage();
			this.setSessionAttr("unitList", unitList);
		} catch (Exception e) {
			log.error("unit!list -error: " + e.getMessage());
			System.out.println("UnitAction->list->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("unit-list").disableCaching();
	}
	


	/**
	 * @TODO 跳转增加单位页面
	 * @return 添加页面
	 */
	public HttpHeaders add() {
		return new DefaultHttpHeaders("unit-add").disableCaching();
	}

	/**
	 * @TODO 增加单位，表单提交
	 * @return 添加后返回列表
	 */
	public HttpHeaders saveUnit() {
		try {
			log.debug("doing execute unit!saveUnit....");
			unitService.insert(unit);
		} catch (Exception e) {
			log.error("unit!saveUnit -error: " + e.getMessage());
			System.out.println("unitAction->saveUnit->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("unit-list").renderResult(SUCCESS);
	}

	/**
	 * @TODO 修改单位
	 * @param unitId，请求到特定页面 修改页面有该对象信息
	 * @return 修改特定页面
	 */
	public HttpHeaders editUnit() {
		try {
			log.debug("doing execute unit!editUnit....");
			unit = unitService.selectByPrimaryKey(unitId);
		} catch (Exception e) {
			log.error("unit!editUnit -error: " + e.getMessage());
			System.out.println("unitAction->editUnit->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}	
		return new DefaultHttpHeaders("unit-edit").disableCaching();
	}

	/**
	 * @TODO 修改单位，表单提交
	 * @return 修改后返回用户列表
	 */
	public HttpHeaders updateUnit() {
		try {
			log.debug("doing execute unit!updateUnit....");
			unitService.updateByPrimaryKeySelective(unit);
		} catch (Exception e) {
			log.error("user!updateUser -error: " + e.getMessage());
			System.out.println("UnitAction->updateUnit->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("unit-list").renderResult(SUCCESS);
	}

	/**
	 * @TODO 删除单位
	 * @TODO 根据页面传递的unitId删除
	 * @return 删除后返回列表
	 */
	public HttpHeaders deleteUnit() {
		unitService.deleteByPrimaryKey(unitId);
		return new DefaultHttpHeaders("unit-list").renderResult(SUCCESS);
	}

	public List<Unit> getUnitList() {
		return unitList;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

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
