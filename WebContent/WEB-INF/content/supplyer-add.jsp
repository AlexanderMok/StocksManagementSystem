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
<link rel="stylesheet" type="text/css"	href="resources/back_end/css/common.css" />
<link rel="stylesheet" type="text/css"	href="resources/back_end/css/main.css" />
<script type="text/javascript" src="resources/back_end/js/modernizr.min.js"></script>
<script type="text/javascript" src="resources/public/js/jquery-1.12.2.min.js"></script>	
<title>增加供应商</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="main-wrap">
		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index!index">后台首页</a><span
					class="crumb-step">&gt;</span><a class="crumb-name"
					href="supplyer!list">供应商管理</a><span class="crumb-step">&gt;</span><span>增加供应商</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">
				<form action="supplyer!saveSupp" method="post" id="myform"
					name="myform" enctype="multipart/form-data">
					<table class="insert-tab" width="100%">
						<tbody>
							<tr>
								<th>供应商编号：</th>
								<td><input class="common-text required" id="title"
									name="supplyer.suppId" size="50" placeholder="请输入供应商编号,确认后不可更改"
									type="text" required></td>
							</tr>
							<tr>
								<th>供应商名称：</th>
								<td><input class="common-text required" id="title"
									name="supplyer.suppName" size="50" placeholder="请输入供应商名称"
									type="text" required></td>
							</tr>
							<tr>
								<th>供应商地址：</th>
								<td><input class="common-text" name="supplyer.address"
									size="50" type="text" placeholder="请输入供应商地址" required></td>
							</tr>
							<tr>
								<th>联系电话：</th>
								<td><input class="common-text" name="supplyer.phone"
									size="50" type="text" placeholder="请输入联系电话" required></td>
							</tr>
							<tr>
								<th>联系人：</th>
								<td><input class="common-text"
									name="supplyer.contactPerson" size="50" type="text"
									placeholder="请输入联系人" required></td>
							</tr>
							<tr>
								<th>银行帐号：</th>
								<td><input class="common-text" name="supplyer.account"
									size="50" type="text" placeholder="请输入银行帐号" required></td>
							</tr>
							<tr>
								<th>银行名称：</th>
								<td><input class="common-text" name="supplyer.bank"
									size="50" type="text" placeholder="请输入银行名称" required></td>
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