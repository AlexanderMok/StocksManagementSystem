package com.elite.commoditymanagement.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 继承Action控制类 获取request、response、session等常用servlet对象
 * 
 * @param <T>
 *            实体对象
 */
public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private HttpServletResponse response;

	protected HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}

	protected HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}

	protected HttpSession getSession() {
		return getRequest().getSession();
	}

	protected Object getAttribute(String attrName) {
		return getRequest().getAttribute(attrName);
	}

	protected Object getSessionAttr(String attrName) {
		return getSession().getAttribute(attrName);
	}

	protected void setSessionAttr(String attrName, Object obj) {
		getSession().setAttribute(attrName, obj);
	}

	protected PrintWriter getWriter() {
		try {
			return ServletActionContext.getResponse().getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	protected Object getParameter(String param) {
		return getRequest().getParameter(param);
	}

	/**
	 * get cookies
	 * 
	 * @param request
	 * @return
	 */
	protected String getCookies_Base(HttpServletRequest request, String key) {
		// 下面是读取存储的 COOKIE
		try {
			Cookie[] cookies = request.getCookies();
			String cookieValue = null;
			if (cookies != null) {
				for (int i = 0; i < cookies.length; i++) {
					if (cookies[i].getName().equals(key)) {
						cookieValue = cookies[i].getValue();
						if (cookieValue != null)
							System.out.println("BaseController->getCookies->" + "key:" + cookieValue);
						break;
					}
				}
			} else
				cookieValue = "";
			return cookieValue;
		} catch (Exception e) {
			System.out.println("BaseController->getCookies->" + "key: error!!!!!!, return blank.");
			return "";
		}
	}

	/**
	 * set cookie
	 * 
	 * @param CKey
	 * @param CValue
	 * @param age
	 */
	protected void setCookie(String CKey, String CValue, int age) {
		// 下面是写存储的 COOKIE
		Cookie cookie = new Cookie(CKey, CValue);
		cookie.setMaxAge(age);
		// cookie.setPath("/");//根据你创建cookie的路径进行填写
		response.addCookie(cookie);
	}

}
