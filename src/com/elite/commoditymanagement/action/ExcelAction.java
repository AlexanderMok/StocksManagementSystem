package com.elite.commoditymanagement.action;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.elite.commoditymanagement.bean.BillInfo;
import com.elite.commoditymanagement.bean.ItemInfo;
import com.elite.commoditymanagement.model.Bill;
import com.elite.commoditymanagement.service.ItemService;
import com.elite.commoditymanagement.service.StocksService;
import com.elite.commoditymanagement.util.ExportTool;

@Controller
public class ExcelAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private ItemService itemService;
	@Autowired
	private StocksService stocksService;

	private List<ItemInfo> infoList;
	private String[] title = { "商品编号", "商品名称", "商品种类", "零售价", "进货价", "库存", "单位", "供应商",
			"联系电话", "联系人", "备注" };
	
	private List<BillInfo> billInfos;
	private List<Bill> bills;
	private String[] billTitle = {"流水编号","操作行为","操作编号","商品名称","操作价格","操作数量","供应商",
			"操作时间","操作人","备注"};
	
	
	
	public HttpHeaders index() {
		HSSFWorkbook wb = null;
		OutputStream out = null;
		try {
		log.debug("doing execute excel!index....");
		HttpServletResponse response = this.getResponse();
//		response.setContentType("application/octet-stream");
		response.setContentType("application/x-msdownload");
		response.setHeader("Content-Disposition",
				"attachment;filename=item-report.xls");

		infoList = itemService.selectByView();

		// 创建excel
		wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("sheet0");
		// 首行
		ExportTool.outputHeaders(title, sheet);
		
		
		int columnSize = title.length;
		int rowSize = infoList.size() + 1;
		HSSFRow nextRow;
		ItemInfo itemInfo;
		//追加  列数为title.length,行数为infoList.size()
		for (int i = 1; i < rowSize; i++){
			nextRow = sheet.createRow(i);
			itemInfo = infoList.get(i-1);
			for (int j = 0; j < columnSize + 1; j++) {
				nextRow.createCell(0).setCellValue(itemInfo.getItemId());
				nextRow.createCell(1).setCellValue(itemInfo.getItemName());
				nextRow.createCell(2).setCellValue(itemInfo.getCataName());
				nextRow.createCell(3).setCellValue(itemInfo.getRetailPrice());
				nextRow.createCell(4).setCellValue(itemInfo.getImportPrice());
				nextRow.createCell(5).setCellValue(itemInfo.getStocks());
				nextRow.createCell(6).setCellValue(itemInfo.getUnitName());
				nextRow.createCell(7).setCellValue(itemInfo.getSuppName());
				nextRow.createCell(8).setCellValue(itemInfo.getPhone());
				nextRow.createCell(9).setCellValue(itemInfo.getContactPerson());
				nextRow.createCell(10).setCellValue(itemInfo.getNote());
			}
		}
		
		//获取输出流，
		out = response.getOutputStream();
		//写入excel 
		wb.write(out);
		} catch (Exception e) {
			try {
				out.close();
				//关闭
				wb.close();
			} catch (IOException e1) {
				
			}
			log.error("excel!index -error: " + e.getMessage());
			System.out.println("ExcelAction->index->return Error:"
					+ e.getStackTrace());
			e.printStackTrace();
		}
		return null;
	}
	
	public void billInfoExcel(){
		HSSFWorkbook wb = null;
		OutputStream out = null;
		try {
			log.debug("doing execute excel!index....");
			HttpServletResponse response = this.getResponse();
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition",
					"attachment;filename=bill-report.xls");

			billInfos = stocksService.selectByView();

			// 创建excel
			wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet("sheet0");
			// 首行
			ExportTool.outputHeaders(billTitle, sheet);

			int columnSize = billTitle.length;
			int rowSize = billInfos.size() + 1;
			HSSFRow nextRow;
			
			BillInfo billInfo;
			//追加  
			for (int i = 1; i < rowSize; i++){
				nextRow = sheet.createRow(i);
				billInfo = billInfos.get(i-1);
				for (int j = 0; j < columnSize + 1; j++) {
					nextRow.createCell(0).setCellValue(billInfo.getId());
					nextRow.createCell(1).setCellValue(billInfo.getActionTag());
					nextRow.createCell(2).setCellValue(billInfo.getActionId());
					nextRow.createCell(3).setCellValue(billInfo.getItemName());
					nextRow.createCell(4).setCellValue(billInfo.getActionPrice());
					nextRow.createCell(5).setCellValue(billInfo.getActionAmount());
					nextRow.createCell(6).setCellValue(billInfo.getSuppName());
					nextRow.createCell(7).setCellValue(billInfo.getActionDate());
					nextRow.createCell(8).setCellValue(billInfo.getActionPerson());
					nextRow.createCell(9).setCellValue(billInfo.getNote());
				}
			}
			
			// 获取输出流，
			out = response.getOutputStream();
			// 写入excel
			wb.write(out);
		} catch (Exception e) {
			try {
				out.close();
				// 关闭
				wb.close();
			} catch (IOException e1) {

			}
			log.error("excel!billInfoExcel -error: " + e.getMessage());
			System.out.println("ExcelAction->index->return Error:"
					+ e.getStackTrace());
			e.printStackTrace();
		}
	}
	
	
	public void billExcel(){
		HSSFWorkbook wb = null;
		OutputStream out = null;
		try {
			log.debug("doing execute excel!index....");
			HttpServletResponse response = this.getResponse();
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition",
					"attachment;filename=bill-report.xls");

			bills = stocksService.selectByBill();

			// 创建excel
			wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet("sheet0");
			// 首行
			ExportTool.outputHeaders(billTitle, sheet);

			int columnSize = billTitle.length;
			int rowSize = bills.size() + 1;
			HSSFRow nextRow;
			
			Bill bill;
			//追加  
			for (int i = 1; i < rowSize; i++){
				nextRow = sheet.createRow(i);
				bill = bills.get(i-1);
				for (int j = 0; j < columnSize + 1; j++) {
					nextRow.createCell(0).setCellValue(bill.getId());
					nextRow.createCell(1).setCellValue(bill.getActionTag());
					nextRow.createCell(2).setCellValue(bill.getActionId());
					nextRow.createCell(3).setCellValue(bill.getItemName());
					nextRow.createCell(4).setCellValue(bill.getActionPrice());
					nextRow.createCell(5).setCellValue(bill.getActionAmount());
					nextRow.createCell(6).setCellValue(bill.getSuppName());
					nextRow.createCell(7).setCellValue(bill.getActionDate());
					nextRow.createCell(8).setCellValue(bill.getActionPerson());
					nextRow.createCell(9).setCellValue(bill.getNote());
				}
			}
			
			// 获取输出流，
			out = response.getOutputStream();
			// 写入excel
			wb.write(out);
		} catch (Exception e) {
			try {
				out.close();
				// 关闭
				wb.close();
			} catch (IOException e1) {

			}
			log.error("excel!billExcel -error: " + e.getMessage());
			System.out.println("ExcelAction->index->return Error:"
					+ e.getStackTrace());
			e.printStackTrace();
		}
	}
}
