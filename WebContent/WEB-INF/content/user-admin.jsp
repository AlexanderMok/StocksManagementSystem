<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>后台管理</title>
<link rel="stylesheet" type="text/css" href="resources/back_end/css/common.css" />
<link rel="stylesheet" type="text/css" href="resources/back_end/css/main.css" />
<script type="text/javascript" src="resources/back_end/js/modernizr.min.js"></script>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<!--/sidebar-->
	<div class="main-wrap">
		<div class="result-wrap">
			<div class="result-title">
				<h1>快捷操作</h1>
			</div>
			<div class="result-content">
				<div class="short-wrap">
					<a href="item!add"><i class="icon-font">&#xe001;</i>添加商品</a>
					<a href="item!list"><i class="icon-font">&#xe048;</i>商品基础信息</a>
				</div>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-title">
				<h1>
					欢迎
					<c:choose>
						<c:when test="${sessionScope.user.roleId==1}">管理员</c:when>
						<c:when test="${sessionScope.user.roleId==2}">员工</c:when>
					</c:choose>：${sessionScope.user.userName}
					
				</h1>
			</div>
			<div class="result-content">
				<ul class="sys-info-list">
					<li><label class="res-lab">登陆时间</label><span class="res-info">${sessionScope.date}</span>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!--/main-->
</body>
</html>