package com.elite.commoditymanagement.util;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

public class ExportTool {
	
	//表头
	public static void outputHeaders(String[] title,HSSFSheet sheet ){
		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < title.length; i++) {
			sheet.setColumnWidth(i, 4000);
			row.createCell(i).setCellValue(title[i]);
		}
	}
	
	
	public static void outputColumns(String[] title,
			List<Object> columnInfo,HSSFSheet sheet,int rowIndex ){
		HSSFRow row ;
		//列数为title.length
		int headerSize = title.length;
		//行数为infoList.size()
		int columnSize = columnInfo.size();
		
		for (int i = 0; i < columnSize; i++) {
			row = sheet.createRow(rowIndex+i);
			Object obj = columnInfo.get(i);
			for (int j = 0; j < headerSize; j++) {
				Object value = getFieldValueByName(title[j],obj);
				row.createCell(j).setCellValue(value.toString());
			}
		}
		
	}


	private static Object getFieldValueByName(String fieldName, Object obj) {
		String firstLetter = fieldName.substring(0,1).toUpperCase();
		String getter = "get" +firstLetter + fieldName.substring(1);
		try {
			Method method = obj.getClass().getMethod(getter, new Class[]{});
			Object value = method.invoke(obj, new Object[]{});
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
		
	}
	
}
