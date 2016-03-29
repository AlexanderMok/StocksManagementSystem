package com.elite.commoditymanagement.action;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.stereotype.Controller;

import com.elite.commoditymanagement.model.User;
import com.elite.commoditymanagement.util.DateTool;

@Result(name = "error", type = "redirect", location="error.jsp")
@Controller
public class IndexAction extends BaseAction {

	private static final long serialVersionUID = -2128404068776457750L;
	private Logger log = Logger.getLogger(this.getClass());

	/**
	 * 首页 /index
	 * @return
	 */
	public HttpHeaders index() {
		try {
			log.debug("doing execute index!index....");
			if (getSession().getAttribute("user") != null) {
				String date = DateTool.dateToString(new Date());
				this.setSessionAttr("date", date);
				return new DefaultHttpHeaders("user-admin").disableCaching();
			}
			return new DefaultHttpHeaders("user-login").disableCaching();
		} catch (Exception e) {
			log.error("userlogin!index -error: " + e.getMessage());
			System.out.println("UserLoginController->index->return Error:" + e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
	}

}
