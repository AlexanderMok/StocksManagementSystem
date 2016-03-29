/**
 * 
 */
package com.elite.commoditymanagement.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化
 * @author 莫庆来
 *
 */
public class DateTool {
	
	public static String dateToString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	public static String dateToPic(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(date);
	}
}
