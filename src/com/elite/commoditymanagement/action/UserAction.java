package com.elite.commoditymanagement.action;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.elite.commoditymanagement.model.Role;
import com.elite.commoditymanagement.model.User;
import com.elite.commoditymanagement.service.RoleService;
import com.elite.commoditymanagement.service.UserService;
import com.elite.commoditymanagement.util.DateTool;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@ParentPackage("admin")
@Result(name = "success", type = "redirectAction", location = "user!list")
@Controller
public class UserAction extends BaseAction {

	private static final long serialVersionUID = -7341297727088683943L;

	private Logger log = Logger.getLogger(this.getClass());

	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;

	private User user;
	private Integer userId;
	private String userName;
	private String password;
	private List<User> list;
	private List<Role> roleList;
	//分页
	private Integer curPage = 1;//第一页
	private Integer pageSize = 5;//每页5个数据
	private Integer lastPage;
	private String order;
	private String sequence;
	
	//搜索条件
	private String condition;
	//密码验证，前段js已做一次验证，为防止用户浏览器禁用js，控制器内再次验证
	private String msg = "请输入8位密码，数字、字母、下划线";

	/**
	 * @author 莫庆来
	 * @TODO 用户登陆验证 user!valid
	 * @return 后台首页
	 */
	public HttpHeaders valid() {
		try {
			log.info("doing execute user!valid....");
			
			if(password==null || "".equals(password) || !(password.matches("^[0-9a-zA-Z_]{8}$"))){
				this.setSessionAttr("Msg", msg);
				System.out.print(msg);
				return new DefaultHttpHeaders("user-login").disableCaching();
			}
			System.out.print("userName is "+userName+", password is "+password+".................");
			
			Boolean flag = userService.selectByNamePass(userName, password);

			if (flag==true) {
				log.info("===========use found and it is valid");
				user = userService.selectByName(userName).get(0);
				String date = DateTool.dateToString(new Date());
				this.setSessionAttr("user", user);
				this.setSessionAttr("date", date);
				this.getSession().setMaxInactiveInterval(60 * 15);// 15分钟
				return new DefaultHttpHeaders("user-admin").disableCaching();
			} else {
				log.info("use not found and it is not valid==========");
				this.setSessionAttr("Msg", "用户名或密码有误");
				return new DefaultHttpHeaders("user-login").disableCaching();
			}
		} catch (Exception e) {
			log.error("user!valid -error: " + e.getMessage());
			System.out.println("UserAction->valid->return Error:"
					+ e.getStackTrace());
			e.printStackTrace();
			return new DefaultHttpHeaders("error").disableCaching();
		}
	}

	/**
	 * @author 莫庆来
	 * @TODO 登出
	 * @return 返回登陆页
	 */
	public HttpHeaders logout() {
		getSession().removeAttribute("user");
		return new DefaultHttpHeaders("user-login").disableCaching();
	}

	/**
	 * @author 莫庆来
	 * @TODO 查询所有用戶
	 * @return 用户列表
	 */
	public HttpHeaders list() {
		try {
			log.debug("doing execute user!list....");
			PageHelper.startPage(curPage,pageSize);
			if(order !=null && !order.equals("") && sequence != null && !sequence.equals("")){
				PageHelper.orderBy(order +" "+ sequence);
			}
			if(condition!=null && !condition.equals("")) {
				list = userService.selectByCondition("%" + condition + "%");
			}else{
				list = userService.getAllUsers();
			}
			PageInfo<User> page = new PageInfo<User>(list);
			lastPage = page.getLastPage();
						
		} catch (Exception e) {
			log.error("user!list -error: " + e.getMessage());
			System.out.println("UserAction->list->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("user-list").disableCaching();
	}

	/**
	 * @author 莫庆来
	 * @TODO 跳转添加用户页面
	 * @return 添加用户页面
	 */
	public HttpHeaders addUser() {
		try {
			log.debug("doing execute user!addUser....");
			this.getSession().removeAttribute("msg");
			roleList = roleService.selectAllRole();
		} catch (Exception e) {
			log.error("user!addUser -error: " + e.getMessage());
			System.out.println("UserAction->addUser->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}

		return new DefaultHttpHeaders("user-add").disableCaching();
	}

	/**
	 * @author 莫庆来
	 * @TODO 保存新用户，验证密码格式
	 * @return 添加后返回用户列表
	 */
	public HttpHeaders saveUser() {
		try {
			log.debug("doing execute user!saveUser....");
			
			roleList = roleService.selectAllRole();
			password = user.getPassword();
			
			if(password!=null && !"".equals(password) && password.matches("^[0-9a-zA-Z_]{8}$")){
				userService.insert(user);
				this.getSession().removeAttribute("msg");
			} else {
				this.setSessionAttr("msg", msg);
				return new DefaultHttpHeaders("user-add").disableCaching();
			}
		    
		} catch (Exception e) {
			log.error("user!saveUser -error: " + e.getMessage());
			System.out.println("UserAction->saveUser->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("user-list").renderResult(SUCCESS);
	}

	/**
	 * @author 莫庆来
	 * @param userId获取特定用户
	 *            修改页面有该对象信息
	 * @return 修改特定用户页面
	 */
	public HttpHeaders editUser() {
		try {
			log.debug("doing execute user!editUser....");
			this.getSession().removeAttribute("msg");
			// 根据id传入要修改的对象进入编辑页面
			user = userService.selectByPrimaryKey(userId).get(0);

			roleList = roleService.selectAllRole();

		} catch (Exception e) {
			log.error("user!editUser -error: " + e.getMessage());
			System.out.println("UserAction->editUser->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("user-edit").disableCaching();
	}

	/**
	 * @author 莫庆来
	 * @TODO 更新用户
	 * @return 修改后返回用户列表
	 */
	public HttpHeaders updateUser() {
		try {
			log.debug("doing execute user!updateUser....");
			roleList = roleService.selectAllRole();
			password = user.getPassword();
			
			if(password!=null && !"".equals(password) && password.matches("^[0-9a-zA-Z_]{8}$")){
				userService.updateByPrimaryKeySelective(user);
				this.getSession().removeAttribute("msg");
			} else {
				this.setSessionAttr("msg", msg);
				return new DefaultHttpHeaders("user-edit").disableCaching();
			}
		} catch (Exception e) {
			log.error("user!updateUser -error: " + e.getMessage());
			System.out.println("UserAction->updateUser->return Error:"
					+ e.getStackTrace());
			return new DefaultHttpHeaders("error").disableCaching();
		}
		return new DefaultHttpHeaders("user-list").renderResult(SUCCESS);
	}

	/**
	 * @author 莫庆来
	 * @TODO 根据页面传递的userId删除用户
	 * @return 删除后返回用户列表
	 */
	public HttpHeaders deleteUser() {
		userService.deleteByPrimaryKey(userId);
		return new DefaultHttpHeaders("user-list").renderResult(SUCCESS);
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getList() {
		return list;
	}

	public List<Role> getRoleList() {
		return roleList;
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
