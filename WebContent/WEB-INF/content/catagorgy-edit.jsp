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
<script type="text/javascript" src="resources/public/js/jquery-1.12.2.min.js"></script>w
<title>修改商品种类</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<div class="main-wrap">
		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index!index">后台首页</a><span
					class="crumb-step">&gt;</span><a class="crumb-name"
					href="user!userList">商品管理</a><span class="crumb-step">&gt;</span><span>修改商品种类</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">
				<form action="catagorgy!updateCata" method="post">
						<input type="hidden" value="${catagorgy.catagorgyId}" name="catagorgy.catagorgyId">
					<table class="insert-tab" width="100%">
						<tbody>
							<tr>
								<th>类别编号：</th>
								<td>
									<input class="common-text required" id="title"
									 size="50" value="${catagorgy.catagorgyId}" type="text" disabled>
								</td>
							</tr>
							<tr>
								<th>上一级类别：</th>
								<td><select name="catagorgy.catagorgyParentId" class="btn btn3">
										<option value="-1">--请选择类别--</option>
										<s:iterator value="catagorgyList" var="p">
											<option value="<s:property value='catagorgyParentId' />"><s:property
													value="catagorgyName" /></option>
										</s:iterator>
									</select>	
								</td>
							</tr>
							<tr>
								<th>商品类别：</th>
								<td><input class="common-text" name="catagorgy.catagorgyName" size="50"
									type="text" placeholder="${catagorgy.catagorgyName}" required></td>
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