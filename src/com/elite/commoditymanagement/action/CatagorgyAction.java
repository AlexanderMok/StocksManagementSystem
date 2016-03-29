package com.elite.commoditymanagement.action;

import java.util.List;

import net.sf.json.JSONArray;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.elite.commoditymanagement.model.Catagorgy;
import com.elite.commoditymanagement.service.CatagorgyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@ParentPackage("admin")
@Result(name = "success", type = "redirectAction", location = "catagorgy!list")
@Controller
public class CatagorgyAction extends BaseAction{

	private static final long serialVersionUID = -6291266518510842956L;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private CatagorgyService catagorgyService;
	
	
	private Catagorgy catagorgy;
	private List<Catagorgy> catagorgyList;
	private Integer catagorgyId;
	
	private Integer curPage = 1;//第一页
	private Integer pageSize = 8;//每页5个数据
	private Integer lastPage;
	private String order;
	private String sequence;
	
	//搜索条件
	private String condition;
	
	
	/**
	 * @TODO 商品种类列表
	 * @return 商品种类页面
	 */
	public HttpHeaders list() {
		try {
			log.debug("doing execute catagorgy!list....");
			
			PageHelper.startPage(curPage, pageSize);
			if(order != null && !order.equals("") && sequence != null && !sequence.equals("")){
				PageHelper.orderBy(order +" "+ sequence);
			}
			if(condition!=null && !condition.equals("")) {
				catagorgyList = catagorgyService.selectByCondition("%" + condition + "%");
			}else{
				catagorgyList = catagorgyService.selectAllCatagorgy();
			}
			
			PageInfo<Catagorgy> page = new PageInfo<Catagorgy>(catagorgyList);
			lastPage = page.getLastPage();
			
		} catch (Exception e) {
			log.error("catagorgy!list -error: " + e.getMessage());
			System.out.println("CatagorgyAction->list->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("catagorgy-list").disableCaching();
	}
	
	/**
	 * @TODO 商品类别选项联动
	 * @return 商品类别JSON
	 */
	public HttpHeaders listCata() {
		try {
			List<Catagorgy> list = catagorgyService.selectByPid(catagorgyId);
			JSONArray json = JSONArray.fromObject(list);
			System.out.println(json);
			this.getWriter().print(json.toString());
		} catch (Exception e) {
			log.error("catagorgy!listCata -error: " + e.getMessage());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return null;
	}
	
	/**
	 * TODO 跳转添加页面
	 * @return 添加页面
	 */
	public HttpHeaders add() {
		try {
			log.debug("doing execute catagorgy!add....");
			catagorgyList = catagorgyService.selectAllCatagorgy();
		} catch (Exception e) {
			log.error("catagorgy!add -error: " + e.getMessage());
			System.out.println("CatagorgyAction->add->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("catagorgy-add").disableCaching();
	}
	
	/**
	 * @TODO 添加类别，提交表单 
	 * @return 添加后返回列表
	 */
	public HttpHeaders saveCata() {
		try {
			log.debug("doing execute catagorgy!saveCata....");
			catagorgyService.insert(catagorgy);
		} catch (Exception e) {
			log.error("catagorgy!saveCatagorgy -error: " + e.getMessage());
			System.out.println("catagorgyAction->saveCata->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}	
		return new DefaultHttpHeaders("catagorgy-list").renderResult(SUCCESS);
	}
	
	
	/**
	 * @TODO 修改类别
	 * @param catagorgyId 请求指定对象，修改页面有该对象信息
	 * @return 修改特定类别页面
	 */
	public HttpHeaders editCata() {
		try {
			log.debug("doing execute catagorgy!editCata....");
			catagorgy = catagorgyService.selectByPrimaryKey(catagorgyId);
			catagorgyList = catagorgyService.selectAllCatagorgy();
		} catch (Exception e) {
			log.error("catagorgy!editCata -error: " + e.getMessage());
			System.out.println("CatagorgyAction->editCata->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("catagorgy-edit").disableCaching();
	}
	/**
	 * @TODO 更新类别
	 * @return 修改后返回用户列表
	 */
	public HttpHeaders updateCata() {
		try {
			log.debug("doing execute catagorgy!updateCata....");
			
			catagorgyService.updateByPrimaryKeySelective(catagorgy);
		} catch (Exception e) {
			log.error("user!updateUser -error: " + e.getMessage());
			System.out.println("CatagorgyAction->updateCata->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("catagorgy-list").renderResult(SUCCESS);
	}
	
	/**
	 * @TODO 根据页面传递的catagorgyId删除
	 * @return 删除后返回列表
	 */
	public HttpHeaders deleteCata() {
		catagorgyService.deleteByPrimaryKey(catagorgyId);
		return new DefaultHttpHeaders("catagorgy-list").renderResult(SUCCESS);
	}
	
	
	public List<Catagorgy> getCatagorgyList() {
		return catagorgyList;
	}

	public Catagorgy getCatagorgy() {
		return catagorgy;
	}

	public void setCatagorgy(Catagorgy catagorgy) {
		this.catagorgy = catagorgy;
	}


	public Integer getCatagorgyId() {
		return catagorgyId;
	}

	public void setCatagorgyId(Integer catagorgyId) {
		this.catagorgyId = catagorgyId;
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
