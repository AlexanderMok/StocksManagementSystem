package com.elite.commoditymanagement.action;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.elite.commoditymanagement.bean.ItemInfo;
import com.elite.commoditymanagement.service.ItemService;
import com.elite.commoditymanagement.util.ExportTool;

@Controller
public class ExcelAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private ItemService itemService;

	private List<ItemInfo> infoList;
	String[] title = { "商品编号", "商品名称", "商品种类", "零售价", "进货价", "库存", "单位", "供应商",
			"联系电话", "联系人", "备注" };

	public HttpHeaders index() {
		try {
		log.debug("doing execute excel!index....");
//		HttpServletResponse response = this.getResponse();
//		response.setContentType("application/octet-stream");
//		response.setHeader("Content-Disposition",
//				"attachment;filename=item-report.xls");

		infoList = itemService.selectByView();

		// 创建excel
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("sheet0");
		// 首行
		ExportTool.outputHeaders(title, sheet);
		
		
		int columnSize = title.length;
		int rowSize = infoList.size();
		HSSFRow nextRow;
		ItemInfo itemInfo;
		//追加  列数为title.length,行数为infoList.size()
		for (int i = 1; i < rowSize; i++){
			nextRow = sheet.createRow(i);
			itemInfo = infoList.get(i);
			for (int j = 0; j < columnSize; j++) {
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
		
		File file = new File("C:/Users/Administrator/Desktop/item-report.xls");
		if(!file.exists()){
			file.createNewFile();
		}
		FileOutputStream out = FileUtils.openOutputStream(file);
		//获取输出流，写入excel 并关闭
//		ServletOutputStream out = response.getOutputStream();
		wb.write(out);
		out.close();
		wb.close();
		} catch (Exception e) {
			log.error("excel!index -error: " + e.getMessage());
			System.out.println("ExcelAction->index->return Error:"
					+ e.getStackTrace());
		}
		return null;
	}
}