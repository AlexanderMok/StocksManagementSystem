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
<link rel="stylesheet" type="text/css"	href="resources/back_end/css/common.css" />
<link rel="stylesheet" type="text/css"	href="resources/back_end/css/main.css" />
<script type="text/javascript"	src="resources/back_end/js/modernizr.min.js"></script>
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
					href="item!list">商品管理</a><span class="crumb-step">&gt;</span><span>商品出货录入</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">
				<form action="item!out" method="post"
					enctype="multipart/form-data">
					<table class="insert-tab" width="100%">
						<tbody>
							
							<tr>
								<th>商品编号：</th>
								<td>
									<input type = "text" class="common-text price"
									 size="50" name="exportBill.itemId" value="${itemId}" disabled/>
									<input type = "hidden" name="exportBill.itemId" value="${itemId}"/>
								</td>
							</tr>
							<tr>
								<th>商品名：</th>
								<td>
									<input type = "text" class="common-text price"
									 size="50" name="itemName" value="${itemName}" disabled/>
								</td>
							</tr>
							<tr>
								<th>商品单位：</th>
								<td>
									<input type = "text" class="common-text price"
									 size="50" name="unitName" value="${unitName}" disabled/>
								</td>
							</tr>
							<tr>
								<th>商品种类：</th>
								<td>
									<input type = "text" class="common-text price"
									 size="50" name="cataName" value="${cataName}" disabled/>
								</td>
							</tr>
							<tr>
								<th>供应商：</th>
								<td>
									<input type="hidden" name="exportBill.suppId" value="${suppId}"/>
									<input type = "text" class="common-text price"
									 size="50" name="suppName" value="${suppName}" disabled/>
								</td>
							</tr>
							<tr>
								<th>进货价格（成本价格）</th>
								<td>
									<input class="common-text price"
									 size="50" type="text"
									value="${importPrice}" disabled>
									
								</td>
							</tr>
							<tr>
								<th>出货编号</th>
								<td><input class="common-text" name="exportBill.exportId" id="outId"
									size="50" type="text" placeholder="请输入出货编号" required></td>
							</tr>
							<tr>
								<th>数量</th>
								<td><input class="common-text amount outNum"
									name="exportBill.exportAmount" size="50" type="text"
									placeholder="当前库存量${stocks}" value="${stocks}" required></td>
							</tr>
							<tr>
								<th>出货价格（零售价）</th>
								<td><input class="common-text price"
									name="exportBill.exportPrice" size="50" type="text"
									placeholder="请输入价格" value="${retailPrice}" required></td>
							</tr>
							<tr>
								<th>时间：</th>
								<td><input type="date" name="exportBill.exportDate"
									class="common-text date" size="50"
									value="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date())%>"
									placeholder="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date())%>" />
								</td>
							</tr>
							<tr>
								<th>执行人：</th>
								<td>
									<input type="text" value="${user.userName}" disabled/>
									<input type="hidden" name="exportBill.exportPerson" value="${user.userName}"/>
								</td>
							</tr>
							<tr>
								<th>备注</th>
								<td><input class="common-text" name="exportBill.note"
									size="50" type="text" value="商品出货" placeholder="商品出货" required></td>
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
</body>
<script>
$(function(){
	$("#outId").focus();
	
	var num = $(".outNum");
	num.blur(function(){
		var pnum = parseInt(num.val());
		var ps = parseInt(${stocks});
		if( pnum > ps) {
			alert("注意，没那么多库存！");
			num.focus();
		}
	});
});
</script>
<script>
    chk();
	function chk() {
		var oinput = $("#outId");
		oinput.blur(function(){
			ajaxChk(oinput);
		});
	}
	
	function ajaxChk(obj){
		var value = $("#outId").val();
		$.ajax({
			type:"get",
			url:"item!findExportOne?exportId=" + value,
			success:function(res){
				if(res==value){
					$("#outId").val("该编号已经存在，请保证唯一性");
					obj.focus();
				}
			},
			error:function(res){
			}
		});
	}
</script>	
<script type="text/javascript" src="resources/back_end/js/inputPosition.js"></script>
<script type="text/javascript" src="resources/back_end/js/page.js"></script>
</html>