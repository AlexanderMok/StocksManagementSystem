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
<title>超市进销存管理系统</title>
<link rel="stylesheet" type="text/css"	href="resources/back_end/css/admin_login.css" />
<script type="text/javascript" src="resources/public/js/jquery-1.12.2.min.js"></script>
</head>
<body>
	<div class="admin_login_wrap">
		<h1>超市进销存管理系统</h1>
		<div class="adming_login_border">
			<div class="admin_input">
				<form action="user!valid" method="post">
					<ul class="admin_items">
						<li>
							<label for="userName">用户名：</label> 
							<input type="text" name="userName" placeholder="请输入用户名" id="userName" size="40"
							class="admin_input_style" required /> 
						</li>
						<li><label for="password">密码：</label> 
							<input type="password" name="password" placeholder="请输入6-24位密码，数字字母或下划线" id="pwd" size="40" 
							class="admin_input_style" required />
							
						</li>
						<li>
							<span class="error">${sessionScope.Msg}</span>
							<input type="submit" tabindex="3" value="提交"
							class="btn btn-primary" />
						</li>
					</ul>
				</form>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="resources/back_end/js/inputPosition.js"></script>
<script>
/*密码验证*/
function isPass(className) {
	$(className).blur(function(){
		if(/^[0-9a-zA-Z_]{6,24}$/.test(this.value)==false){
			this.value="请输入8位密码，数字、字母、下划线";
			this.focus();
		}
	});	
}
isPass("#pwd");
</script>
</html>