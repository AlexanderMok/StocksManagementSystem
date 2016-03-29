<%@ page language="java" import="java.util.*"
	import="java.text.SimpleDateFormat"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
<link rel="stylesheet" type="text/css"  href="resources/back_end/css/common.css" />
<link rel="stylesheet" type="text/css"	href="resources/back_end/css/main.css" />
<script type="text/javascript" src="resources/back_end/js/modernizr.min.js"></script>
<script type="text/javascript" src="resources/public/js/jquery-1.12.2.min.js"></script>
<title>商品出货</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="main-wrap">
		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index!index">后台首页</a><span
					class="crumb-step">&gt;</span><a class="crumb-name"
					href="user!userList">商品管理</a><span class="crumb-step">&gt;</span><span>商品出货录入</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">
				<form action="item!out" method="post">
					<table class="insert-tab" width="100%">
						<tbody>
							<tr>
								<th>出货编号</th>
								<td><input class="common-text" name="exportBill.exportId"
									size="50" type="text" placeholder="请输入出货编号" required></td>
							</tr>
							<tr>
								<th>商品名：</th>
								<td><select name="exportBill.itemId" class="btn btn3">
										<option value="-1">--请选择商品--</option>
										<s:iterator value="itemList" var="i">
											<option value="${i.itemId}"><s:property
													value="itemName" /></option>
										</s:iterator>
								</select></td>
							</tr>
							<!-- 非必要字段，可删除 -->
							<tr>
								<th>商品单位：</th>
								<td><select name="unit" class="btn btn3">
										<option value="-1">--请选择单位--</option>
										<s:iterator value="unitList" var="u">
											<option value="${u.unitId}"><s:property
													value="unitName" /></option>
										</s:iterator>
								</select></td>
							</tr>
							<!-- 可删除 结束-->
							<tr>
								<th>供应商：</th>
								<td><select name="exportBill.suppId" class="btn btn3">
										<option value="-1">--请选择供应商--</option>
										<s:iterator value="suppList" var="s">
											<option value="${s.suppId}"><s:property
													value="suppName" /></option>
										</s:iterator>
								</select></td>
							</tr>
							
							<tr>
								<th>数量</th>
								<td><input class="common-text amount"
									name="exportBill.exportAmount" size="50" type="text"
									placeholder="请输入数量" required></td>
							</tr>
							<tr>
								<th>出货价格（零售价）</th>
								<td><input class="common-text price"
									name="exportBill.exportPrice" size="50" type="text"
									placeholder="请输入价格" required></td>
							</tr>
							<tr>
								<th>时间：</th>
								<td><input type="date" name="exportBill.exportDate"
									class="common-text date" size="50"
									value="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date())%>"
									placeholder="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date())%>" /></td>
							</tr>
							<tr>
								<th>执行人：</th>
								<td>
									<input type="text" name="exportBill.exportPerson" value="${user.userName}"/>
								</td>
							</tr>
							<tr>
								<th>备注</th>
								<td><input class="common-text" name="exportBill.note"
									size="50" type="text" placeholder="商品出货" value="商品出货" required></td>
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
<script type="text/javascript" src="resources/back_end/js/page.js"></script>	
</body>
</html>