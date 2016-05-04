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
					href="item!list">商品管理</a><span class="crumb-step">&gt;</span><span>商品出货录入</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">
				<form action="item!out" method="post">
					<table class="insert-tab" width="100%">
						<tbody>
							<tr>
								<th>商品名：</th>
								<td><select name="exportBill.itemId" class="btn btn3" id="selecItem">
										<option value="-1">--请选择商品--</option>
										<s:iterator value="itemList" var="i">
											<option value="${i.itemId}"><s:property
													value="itemName" /> : 成本价 <s:property value="importPrice"/></option>
										</s:iterator>
								</select></td>
							</tr>
							<tr>
								<th>出货编号</th>
								<td><input class="common-text" name="exportBill.exportId" id="outId"
									size="50" type="text" placeholder="请输入出货编号" required></td>
							</tr>
							<tr>
								<th>供应商：</th>
								<td>
									<input type="hidden" id="suppId" name="exportBill.suppId" value=""/>
									<input type="text" size="50" class="common-text" id="suppName" name="suppName" value=""/>
								</td>
							</tr>
							<tr>
								<th>数量</th>
								<td><input class="common-text amount outNum"
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
					<input type="hidden" id="stocks">
				</form>
			</div>
		</div>
	</div>
	<!--/main-->
</body>
<script>
$(document).ready(function(){
	var oSelect = $("#selecItem");
	var num = $(".outNum");
	oSelect.change(function(){
		var str = $("#selecItem option:selected").text();
		var price = str.substring(str.lastIndexOf(" ") + 1);
		$.ajax({
			type:"get",
			url:"item!findStocks?itemId=" + oSelect.val() + "&importPrice=" + price,
			success: function(res){
				var json = eval(res);
				num.attr("placeholder","当前商品库存量为" + json[0].stocks);
				$("#suppId").val(json[0].suppId);
				$("#suppName").val(json[0].suppName);
				$(".price").val(json[0].retailPrice);
				$("#stocks").val(json[0].stocks);
			},
			error: function(obj,res) {
// 				alert("获取库存有错误" + res);
			}
		});
	});
	num.blur(function(){
		var pnum = parseInt(num.val())
		var ps = parseInt($("#stocks").val());
		if( pnum > ps ) {
			alert("注意，没那么多库存！");
			num.focus();
		}
	});
	
	
	var oinput = $("#outId");
	oinput.blur(function(){
		ajaxChk(oinput);
	});
	
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
	
});
</script>
<%-- <script>
    chk();
	function chk() {
		
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
</script>	 --%>
<script type="text/javascript" src="resources/back_end/js/inputPosition.js"></script>
<script type="text/javascript" src="resources/back_end/js/page.js"></script>
</html>