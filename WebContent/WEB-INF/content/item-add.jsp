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
<script type="text/javascript"	src="resources/back_end/js/modernizr.min.js"></script>
<script type="text/javascript" src="resources/public/js/jquery-1.12.2.min.js"></script>
<title>增加商品</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="main-wrap">
		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index!index">后台首页</a><span
					class="crumb-step">&gt;</span><a class="crumb-name"
					href="user!userList">商品管理</a><span class="crumb-step">&gt;</span><span>增加商品</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">
				<form action="item!saveItem" method="post" id="myform" name="myform"
					enctype="multipart/form-data">
					<table class="insert-tab" width="100%">
						<tbody>
							
							<tr>
								<th>商品单位(<span class="error">必选</span>)：</th>
								<td><select name="item.unitId" class="btn btn3">
										<option value="-1">--请选择单位--</option>
										<s:iterator value="unitList" var="u">
											<option value="${u.unitId}"><s:property
													value="unitName" /></option>
										</s:iterator>
								</select></td>
							</tr>
							<tr>
								<th>商品种类(<span class="error">必选</span>)：</th>
								
								<td>
								<select  class="btn btn3" id="selecttype">
										<option value="-1">--请选择分类--</option>
										<s:iterator value="cataList" var="c">
											<option value="${c.catagorgyId}"><s:property
													value="catagorgyName" /></option>
										</s:iterator>
								</select>
								<select id="sectype" style="display:none;" class="btn"></select> 
								<select	id="thirdtype" style="display:none;" class="btn"></select></td>
							</tr>
							<tr>
								<th>供应商(<span class="error">必选</span>)：</th>
								<td><select name="item.suppId" class="btn btn3">
										<option value="-1">--请选择供应商--</option>
										<s:iterator value="suppList" var="s">
											<option value="${s.suppId}"><s:property
													value="suppName" /></option>
										</s:iterator>
								</select></td>
							</tr>
							<tr>
								<th>商品编号：</th>
								<td><input class="common-text required" id="itemId"
									name="item.itemId" size="50" placeholder="请输入商品编号，确认后不可更改" type="text"
									required></td>
							</tr>
							<tr>
								<th>商品名：</th>
								<td><input class="common-text required" id="title"
									name="item.itemName" size="50" placeholder="请输入商品名" type="text"
									required></td>
							</tr>
							<tr>
								<th>零售价</th>
								<td>
									<input class="common-text number price" name="item.retailPrice"
									size="50" type="text" placeholder="请输入零售价" required>
								</td>
							</tr>
							<tr>
								<th>商品安全库存量：</th>
								<td><input class="common-text number amount" name="item.safeAmount"
									size="50" type="text" placeholder="请输入安全库存量" required></td>
							</tr>
							<tr>
								<th>商品图片：</th>
								<td>
									<div id="viewImgs" class="viewImgs"></div>
									<button name="uploadImg" id="uploadImg" class="btn btn10">请选择上载图片</button>
									<input type="hidden" name="item.itemPic" id="picpath">
								</td>
							</tr>
							<tr>
								<th>商品备注：</th>
								<td><input class="common-text" name="item.note"
									size="50" type="text" placeholder="新增商品" value="新增商品" required></td>
							</tr>
							<tr>
								<th></th>
								<td><input class="btn btn-primary btn6 mr10" value="提交"
									type="submit"> <input class="btn btn6"
									onclick="history.go(-1)" value="返回" type="button"></td>
							</tr>
						</tbody>
					</table>
					<input type="hidden" name="item.catagorgyId" id="cataId" value=""/>
					<input type="hidden" name="item.activityId" value="1"/>
				</form>
			</div>
		</div>
	</div>
	<!--/main-->
</body>
<script type="text/javascript" src="resources/back_end/js/item_cata.js"></script>
<script type="text/javascript" src="resources/back_end/js/inputPosition.js"></script>
<script type="text/javascript" src="resources/public/js/ajaxupload.js"></script>
<script type="text/javascript" src="resources/public/js/upload_pic.js"></script>
<script type="text/javascript" src="resources/back_end/js/page.js"></script>
<script>
    chk();
	function chk() {
		var oinput = $("#itemId");
		oinput.blur(function(){
			ajaxChk(oinput);
		});
	}
	
	function ajaxChk(obj){
		var value = $("#itemId").val();
		$.ajax({
			type:"get",
			url:"item!findOne?itemId=" + value,
			success:function(res){
				if(res!='null'){
					alert("该编号已经存在，请保证唯一性");
					obj.focus();
				}
			},
			error:function(res){
				alert("error" + res);
			}
		});
	}
</script>
</html>