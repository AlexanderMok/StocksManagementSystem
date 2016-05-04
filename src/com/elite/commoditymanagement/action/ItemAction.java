package com.elite.commoditymanagement.action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.elite.commoditymanagement.bean.ItemInfo;
import com.elite.commoditymanagement.model.Catagorgy;
import com.elite.commoditymanagement.model.ExportBill;
import com.elite.commoditymanagement.model.ImportBill;
import com.elite.commoditymanagement.model.Item;
import com.elite.commoditymanagement.model.Supplyer;
import com.elite.commoditymanagement.model.Unit;
import com.elite.commoditymanagement.model.User;
import com.elite.commoditymanagement.service.CatagorgyService;
import com.elite.commoditymanagement.service.ExportBillService;
import com.elite.commoditymanagement.service.ImportBillService;
import com.elite.commoditymanagement.service.ItemService;
import com.elite.commoditymanagement.service.SupplyerService;
import com.elite.commoditymanagement.service.UnitService;
import com.elite.commoditymanagement.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author 莫庆来
 * @TODO 商品CURD操作
 */
@Result(name = "success", type = "redirectAction", location = "item!list")
@Controller
public class ItemAction extends BaseAction {

	private static final long serialVersionUID = -3847460798910280664L;
	private Logger log = Logger.getLogger(this.getClass());

	@Autowired
	private ItemService itemService;
	@Autowired
	private CatagorgyService catagorgyService;
	@Autowired
	private UnitService unitService;
	@Autowired
	private SupplyerService suppService;
	@Autowired
	private ImportBillService importBillService;
	@Autowired
	private ExportBillService exportBillService;
	@Autowired
	private UserService userService;

	private Item item;
	private ImportBill importBill;
	private ExportBill exportBill;
	
	//URL传递参数
	private String itemId;
	private String itemName;
	private String unitName;
	private String cataName;
	private String suppId;
	private String suppName;
	private Double retailPrice;
	private Double importPrice;
	private Integer stocks;
	private Integer safeAmount;
	private Double actionPrice;
	private String importId;
	private String exportId;
	
	//返回后台数据至前台
	private List<ItemInfo> infoList;
	private List<Item> itemList;
	private List<Unit> unitList;
	private List<Catagorgy> cataList;
	private List<Supplyer> suppList;
	private List<User> userList;
	
	//分页
	private Integer curPage = 1;//第一页
	private Integer pageSize = 6;//每页5个数据
	private Integer lastPage;
	private String order;
	private String sequence;
	
	//搜索条件
	private String condition;
	
	

	/**
	 * @TODO 查询商品基本信息
	 * @return 商品页面
	 */
	public HttpHeaders list() {
		try {
			log.debug("doing execute item!list....");
			
			PageHelper.startPage(curPage,pageSize);
			if(order !=null && !order.equals("") && sequence != null && !sequence.equals("")){
				PageHelper.orderBy(order +" "+ sequence);
			}
			if(condition!=null && !condition.equals("")) {
				infoList = itemService.selectByCondition("%"+condition+"%");
			}else{
				infoList = itemService.selectByView();
			}
			PageInfo<ItemInfo> page = new PageInfo<ItemInfo>(infoList);
			lastPage = page.getLastPage();
			//截取数据库图片路径
			for(ItemInfo itemInfo : infoList) {
				String[] newItemPaths = itemInfo.getItemPic().substring(1).split(",");
				itemInfo.setItemPaths(newItemPaths);
			}
			
		} catch (Exception e) {
			log.error("item!list -error: " + e.getMessage());
			System.out.println("ItemAction->list->return Error:"
					+ e.getStackTrace());
			e.printStackTrace();
			return new DefaultHttpHeaders("item-list").disableCaching();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new DefaultHttpHeaders("item-list").disableCaching();
	}
	
	
	/**
	 * 查库存
	 * @return
	 * @throws IOException
	 */
	public HttpHeaders findStocks() throws IOException {
		ItemInfo infos = itemService.selectStocksById(itemId,
				String.valueOf(importPrice)).get(0);
		StringBuffer bf = new StringBuffer();
		bf.append("{stock:[{");
		bf.append("\"stocks\"").append(":").append("\"").append(infos.getStocks()).append("\"").append(",");
		bf.append("\"suppId\"").append(":").append("\"").append(infos.getSuppId()).append("\"").append(",");
		bf.append("\"suppName\"").append(":").append("\"").append(infos.getSuppName()).append("\"").append(",");
		bf.append("\"retailPrice\"").append(":").append("\"").append(infos.getRetailPrice()).append("\"");
		bf.append("}]}");
		this.getResponse().getWriter().write(bf.toString());
		return null;
	}
	/**
	 * 查供应商
	 * @return
	 * @throws IOException
	 */
	public HttpHeaders findSupp() throws IOException {
		ItemInfo infos = itemService.selectStocksById(itemId).get(0);
		StringBuffer bf = new StringBuffer();
		bf.append("{supp:[{");
		bf.append("\"suppId\"").append(":").append("\"").append(infos.getSuppId()).append("\"").append(",");
		bf.append("\"suppName\"").append(":").append("\"").append(infos.getSuppName()).append("\"");
		bf.append("}]}");
		this.getResponse().getWriter().write(bf.toString());
		return null;
	}
	/**
	 * ajax检测itemId唯一性
	 * @return
	 */
	public HttpHeaders findOne() {
		item = itemService.selectByPrimaryKey(itemId);
		this.getWriter().write(JSONObject.fromObject(item).toString());
		return null;
	}


	/**
	 * @TODO 增加新商品，传入单位、种类、供应商列表 备选
	 * @return 添加页面
	 */
	public HttpHeaders add() {
		try {
			log.debug("doing execute item!add....");

			unitList = unitService.selectAllUnit();

			cataList = catagorgyService.selectAllCatagorgy();

			suppList = suppService.getAllSupp();
		} catch (Exception e) {
			log.error("item!add -error: " + e.getMessage());
			System.out.println("itemAction->add->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("item-add").disableCaching();
	}

	/**
	 * @TODO 添加新商品，表单提交
	 * @return 添加后返回列表
	 */
	public HttpHeaders saveItem() {
		try {
			log.debug("doing execute item!saveItem....");
			
			itemService.insert(item);
			
		} catch (Exception e) {
			log.error("item!saveItem -error: " + e.getMessage());
			System.out.println("itemAction->saveItem->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("item-list").renderResult(SUCCESS);
	}
	
	
	public HttpHeaders editItemOne(){
		
		unitList = unitService.selectAllUnit();

		cataList = catagorgyService.selectAllCatagorgy();

		suppList = suppService.getAllSupp();
		return new DefaultHttpHeaders("item-one-edit").disableCaching();
	}

	/**
	 * @TODO 修改商品信息，传入单位、种类、供应商列表 备选
	 * @return 修改特定页面
	 */
	public HttpHeaders editItem() {
		try {
			log.debug("doing execute item!editItem....");
			unitList = unitService.selectAllUnit();

			cataList = catagorgyService.selectAllCatagorgy();

			suppList = suppService.getAllSupp();

			item = itemService.selectByPrimaryKey(itemId);

		} catch (Exception e) {
			log.error("item!editItem -error: " + e.getMessage());
			System.out.println("itemAction->editItem->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("item-edit").disableCaching();
	}

	/**
	 * @TODO 更新商品信息，表单提交
	 * @return 修改后返回用户列表
	 */
	public HttpHeaders updateItem() {
		try {
			log.debug("doing execute item!updateItem....");
			itemService.updateByPrimaryKey(item);
		} catch (Exception e) {
			log.error("user!updateUser -error: " + e.getMessage());
			System.out.println("ItemAction->updateItem->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("item-list").renderResult(SUCCESS);
	}

	/**
	 * @TODO 根据页面传递的itemId删除
	 * @return 删除后返回列表
	 */
	public HttpHeaders deleteItem() {
		int i = itemService.deleteByPrimaryKey(itemId);
		System.out.println("删除成功－－－－" + i);
		return new DefaultHttpHeaders("item-list").renderResult(SUCCESS);
	}

	/**
	 * @TODO 单个商品进货录入
	 * @return 录入页面
	 */
	public HttpHeaders inItemOne() {

		return new DefaultHttpHeaders("item-one-instock").disableCaching();
	}
	
	
	/**
	 * @TODO 单个商品出货录入
	 * @return 录入页面
	 */
	public HttpHeaders outItemOne() {
		
		return new DefaultHttpHeaders("item-one-outstock").disableCaching();
	}

	/**
	 * @TODO 商品进货录入
	 * @return 录入页面
	 */
	public HttpHeaders inItem() {
		try {
			log.debug("doing execute item!inItem....");

			itemList = itemService.selectAllItem();

			unitList = unitService.selectAllUnit();

			cataList = catagorgyService.selectAllCatagorgy();

			suppList = suppService.getAllSupp();

			userList = userService.getAllUsers();

			item = itemService.selectByPrimaryKey(itemId);
		} catch (Exception e) {
			log.error("item!inItem -error: " + e.getMessage());
			System.out.println("itemAction->inItem->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("item-instock").disableCaching();
	}

	/**
	 * @TODO 商品进货表单提交
	 * @return 商品列表
	 */
	public HttpHeaders in() {
		try {
			importBillService.insert(importBill);
		} catch (Exception e) {
			log.error("item!in -error: " + e.getMessage());
			System.out.println("itemAction->in->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("item-list").renderResult(SUCCESS);
	}

	/**
	 * @TODO 商品出货录入
	 * @return 出货页面
	 */
	public HttpHeaders outItem() {
		try {
			log.debug("doing execute item!outItem....");
			// 传入进货的商品,出货商品从进货商品里边取
			List<ImportBill> inBillList = importBillService.selectByExample();
			System.out.println("====" + inBillList.size());
			Item item;
			itemList = new ArrayList<Item>();
			for (ImportBill importBill : inBillList) {

				item = new Item();

				String itemId = importBill.getItemId();
				item.setItemId(itemId);

				String itemName = itemService.selectByPrimaryKey(itemId)
						.getItemName();
				item.setItemName(itemName);
				
				Double importPrice = importBill.getImportPrice();
				item.setImportPrice(importPrice);
				
				itemList.add(item);
			}

			suppList = suppService.getAllSupp();

			item = itemService.selectByPrimaryKey(itemId);
		} catch (Exception e) {
			log.error("item!outItem -error: " + e.getMessage());
			System.out.println("itemAction->outItem->return Error:"
					+ e.getStackTrace());
			e.printStackTrace();
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("item-outstock").disableCaching();
	}

	/**
	 * @TODO 商品出货表单提交
	 * @return 商品信息列表
	 */
	public HttpHeaders out() {
		try {
			exportBillService.insert(exportBill);
		} catch (Exception e) {
			log.error("item!in -error: " + e.getMessage());
			System.out.println("itemAction->in->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("item-list").renderResult(SUCCESS);
	}
	
	/**
	 * 
	 * ajax检测进货编号唯一性
	 */
	public void findImportOne() {
		ImportBill ib = importBillService.selectByPrimaryKey(importId);
		String importId = ib.getImportId();
		this.getWriter().write(importId);
	}
	/**
	 * ajax检测出货编号唯一性
	 */
	public void findExportOne() {
		ExportBill eb = exportBillService.selectByPrimaryKey(exportId);
		String exportId = eb.getExportId();
		this.getWriter().write(exportId);
	}
	

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ImportBill getImportBill() {
		return importBill;
	}

	public void setImportBill(ImportBill importBill) {
		this.importBill = importBill;
	}

	public ExportBill getExportBill() {
		return exportBill;
	}

	public void setExportBill(ExportBill exportBill) {
		this.exportBill = exportBill;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public void setImportId(String importId) {
		this.importId = importId;
	}


	public void setExportId(String exportId) {
		this.exportId = exportId;
	}

	
	public List<ItemInfo> getInfoList() {
		return infoList;
	}


	public List<Item> getItemList() {
		return itemList;
	}

	public List<Unit> getUnitList() {
		return unitList;
	}

	public List<Catagorgy> getCataList() {
		return cataList;
	}

	public List<Supplyer> getSuppList() {
		return suppList;
	}

	public List<User> getUserList() {
		return userList;
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
	 * 
	 * @throws UnsupportedEncodingException 
	 * @TODO 修改、进货、出货单个商品信息，通过URL传参数
	 */
	public String getUnitName() throws UnsupportedEncodingException {
		return URLDecoder.decode(unitName, "UTF-8");
		
	}


	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}


	public String getCataName() throws UnsupportedEncodingException {
		return URLDecoder.decode(cataName, "UTF-8");
	}


	public void setCataName(String cataName) {
		this.cataName = cataName;
	}


	public String getSuppId() {
		return suppId;
	}


	public void setSuppId(String suppId) {
		this.suppId = suppId;
	}


	public String getSuppName() throws UnsupportedEncodingException {
		return URLDecoder.decode(suppName, "UTF-8");
	}


	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}


	public String getItemName() throws UnsupportedEncodingException {
		return URLDecoder.decode(itemName, "UTF-8");
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Integer getStocks() {
		return stocks;
	}

	public void setStocks(Integer stocks) {
		this.stocks = stocks;
	}

	public Double getImportPrice() {
		return importPrice;
	}


	public void setImportPrice(Double importPrice) {
		this.importPrice = importPrice;
	}

	public Integer getSafeAmount() {
		return safeAmount;
	}

	public void setSafeAmount(Integer safeAmount) {
		this.safeAmount = safeAmount;
	}


	public Double getActionPrice() {
		return actionPrice;
	}


	public void setActionPrice(Double actionPrice) {
		this.actionPrice = actionPrice;
	}

	

	//模糊查询条件，搜索功能用
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	

}
