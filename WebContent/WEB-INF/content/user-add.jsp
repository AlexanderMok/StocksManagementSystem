<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="resources/back_end/css/common.css" />
<link rel="stylesheet" type="text/css" href="resources/back_end/css/main.css" />
<script type="text/javascript" src="resources/back_end/js/modernizr.min.js"></script>
<script type="text/javascript" src="resources/public/js/jquery-1.12.2.min.js"></script>
<title>修改用户</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<div class="main-wrap">
		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index!index">后台首页</a><span
					class="crumb-step">&gt;</span><a class="crumb-name"
					href="user!list">用户管理</a><span class="crumb-step">&gt;</span><span>增加用户</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">
				<form action="user!saveUser" method="post">
					<table class="insert-tab" width="100%">
						<tbody>
							<tr>
								<th>用户名：</th>
								<td><input class="common-text required" id="title"
									name="user.userName" size="50" placeholder="请输入用户名" type="text" required></td>
							</tr>
							<tr>
								<th>用户角色：</th>
								<td>
									<select name="user.roleId" class="btn btn3">
										<option value="-1">--请选择角色--</option>
										<s:iterator value="roleList" var="i">
											<option value="${i.roleId}"><s:property
													value="roleName" /></option>
										</s:iterator>
									</select>	
								</td>
							</tr>
							<tr>
								<th>工号：</th>
								<td><input class="common-text" name="user.workCode" size="50"
									type="text" placeholder="请输入工号" required></td>
							</tr>
							<tr>
								<th>密码：</th>
								<td><input class="common-text" name="user.password" size="50"
									type="text" placeholder="请输入6到24位密码,数字、字母、下划线" required>
									<span class="error">${sessionScope.msg}</span>
								</td>
							</tr>
							<tr>
								<th></th>
								<td><input class="btn btn-primary btn6 mr10" value="提交"
									type="submit"> <input class="btn btn6"
									onclick="history.go(-1)" value="返回" type="button"></td>
							</tr>
						</tbody>
					</table>
				</form>
			</div>
		</div>
	</div>
	<!--/main-->
<script type="text/javascript" src="resources/back_end/js/inputPosition.js"></script>
	
</body>
</html>