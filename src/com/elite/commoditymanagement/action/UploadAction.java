package com.elite.commoditymanagement.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.stereotype.Controller;

@Controller
public class UploadAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());
	private File file;
	private String fileName;
	private String fileContextType;
	private String msg = "上传成功";

	/**
	 * 
	 * @TODO 上传图片控制器
	 * @RETURN JSON图片路径
	 * @throws Exception
	 */
	public HttpHeaders upload() throws Exception {
		HttpServletRequest request = this.getRequest();
		PrintWriter writer = this.getWriter();
		//保存文件的目录
		String path = request.getSession().getServletContext().getRealPath("/resources/upload/itemPic");
		try {
			File f = this.getFile();
			if (this.getFileName().endsWith(".exe")) {
				msg = "对不起,你上载的文件格式不允许!";
				return new DefaultHttpHeaders("item-add").disableCaching();
			}
			FileInputStream inputStream = new FileInputStream(f);
			String saveName = new Date().getTime() + this.getFileName().substring(this.getFileName().lastIndexOf("."));
			FileOutputStream outputStream = new FileOutputStream(path + "/" + saveName);
			byte[] buf = new byte[1024];
			int length = 0;
			while ((length = inputStream.read(buf)) != -1) {
				outputStream.write(buf, 0, length);
			}
			inputStream.close();
			outputStream.flush();
			outputStream.close();
			// request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/upload/itemPic/"+this.getFileName();
			// 保存后图片的浏览器访问路径
			String picUrl = "resources/upload/itemPic/" + saveName;
			String json = "{picUrl:\"" + picUrl + "\"}";
			writer.print(json);

		} catch (Exception e) {
			log.error("catagorgy!listCata -error: " + e.getMessage());
			writer.print("{");
			writer.print("error:对不起,文件上传失败了!");
			writer.print("}");
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return null;
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileContextType() {
		return fileContextType;
	}

	public void setFileContextType(String fileContextType) {
		this.fileContextType = fileContextType;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
