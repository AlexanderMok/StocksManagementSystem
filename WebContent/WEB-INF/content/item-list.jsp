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
<title>商品列表</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<!--/sidebar-->
	<div class="main-wrap">
		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index!index">后台首页</a><span
					class="crumb-step">&gt;</span><span class="crumb-name">商品列表</span>
			</div>
		</div>
		<div class="search-wrap">
			<div class="search-content">
					<table class="search-tab">
						<tr>
							<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<c:choose>
									<c:when test="${sessionScope.user.roleId==1}">管理员</c:when>
									<c:when test="${sessionScope.user.roleId==2}">员工</c:when>
								</c:choose>：${sessionScope.user.userName}
								工号：${sessionScope.user.workCode}
							</th>
							<td></td>
							<th></th>
							<th></th>
							<th></th>
						</tr>
					</table>
					<form id="search">
                    <table class="search-tab">
                        <tr>
                            <th width="120"><a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i></a></th>
                            <td><input class="common-text" placeholder="关键字" name="condition" id="condition" type="text"></td>
                            <td><input class="btn btn-primary btn2" id="btn_search" value="查询" type="submit"></td>
                        </tr>
                    </table>
                </form>
                <form id="order">
                    <table class="search-tab">
                        <tr>
                            <th width="120"><a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i></a></th>
                            <td>
                                <select name="order" id="orderBy">
                                    <option value="-1">选择</option>
                                    <option value="safe_amount">默认排序</option>
                                    <option value="item_name">商品名称</option>
                                    <option value="stocks">库存</option>
                                    <option value="retail_price">零售价</option>
                                    <option value="catagorgy_id">商品类别</option>
                                    <option value="supp_name">供应商</option>
                                    <option value="contact_person">联系人</option>
                                    <option value="phone">联系电话</option>
                                    <option value="unit_name">商品单位</option>
                                </select>
                                <select name="sequence" id="sequence">
                                	<option value="-1">选择</option>
                                	<option value="asc">升序</option>
                                	<option value="desc">降序</option>
                                </select>
                            </td>
                            <td><input class="btn btn-primary btn2" name="orderQuery" value="排序" type="submit"></td>
                        </tr>
                    </table>
                </form>
			</div>
		</div>
		<div class="result-wrap">
				<div class="result-title">
					<div class="result-list">
						<a href="item!add"><i class="icon-font"></i>添加商品</a>
					</div>
				</div>
				<div class="result-content">
				
					<table class="result-tab" width="100%" style="text-align: center;">
						<tr class="result-head">
							<td class="tc"><input class="allChoose" name=""
								type="checkbox"></td>
							<td>商品编号</td>
							<td>商品名称</td>
							<td>商品图片</td>
							<td>商品种类</td>
							<td>零售价</td>
							<td>进货价</td>
							<td>库存</td>
							<td>单位</td>
							<td>供应商</td>
							<td>联系电话</td>
							<td>联系人</td>
							<td>备注</td>
							<td>操作</td>
						</tr>

						<s:iterator value="infoList" var="i">
							<tr class="result-body">
								<td class="tc"></td>
								<td><s:property value="itemId" /></td>
								<td><s:property value="itemName" /></td>
								<td width=20%>
									<s:iterator value="itemPaths">
										<img src="<s:property/>" class="itemPic">
									</s:iterator>
								</td>
								<td><s:property value="cataName" /></td>
								<td><s:property value="retailPrice" /></td>
								<td><s:property value="importPrice" /></td>
								<td>
									<c:if test="${i.stocks<i.safeAmount}">
										<span style="color:red">
											<s:property value="stocks" />
										</span>	
									</c:if>
									<c:if test="${i.stocks>=i.safeAmount}">
										<span style="color:green">
											<s:property value="stocks" />
										</span>	
									</c:if>
								</td>
								<td><s:property value="unitName" /></td>
								<td><s:property value="suppName" /></td>
								<td><s:property value="phone" /></td>
								<td><s:property value="contactPerson" /></td>
								<td><s:property value="note" /></td>
								<td>
									<a class="link-update" href="item!editItemOne?itemId=${i.itemId}&itemName=${i.itemName}&unitName=${i.unitName}&cataName=${i.cataName}&suppId=${i.suppId}&suppName=${i.suppName}&retailPrice=${i.retailPrice}&safeAmount=${i.safeAmount}">修改商品</a>
									<a class="link-update" href="item!inItemOne?itemId=${i.itemId}&itemName=${i.itemName}&unitName=${i.unitName}&cataName=${i.cataName}&suppId=${i.suppId}&suppName=${i.suppName}&stocks=${i.stocks}&retailPrice=${i.retailPrice}&importPrice=${i.importPrice}">商品进货</a>
									<a class="link-update" href="item!outItemOne?itemId=${i.itemId}&itemName=${i.itemName}&unitName=${i.unitName}&cataName=${i.cataName}&suppId=${i.suppId}&suppName=${i.suppName}&stocks=${i.stocks}&retailPrice=${i.retailPrice}">商品出货</a>
									<a class="link-del" href="item!deleteItem?itemId=${i.itemId}">删除</a>
								</td>
							</tr>
						</s:iterator>
					</table>
				</div>
				<form name="item">
						<div class="page_ctrl">
								<c:if test="${curPage != 1}">
									<a href="item!list?curPage=1&pageSize=${pageSize}&order=${order}&sequence=${sequence}">首页</a>&nbsp;
									<a href="item!list?curPage=${curPage - 1}&pageSize=${pageSize}&order=${order}&sequence=${sequence}">上一页</a>&nbsp;
								</c:if> 
								<c:if test="${curPage == 1}">
									首页&nbsp;
								</c:if> 
								第${curPage}页&nbsp;&nbsp;共${lastPage}页								
								<c:if test="${curPage != lastPage}">
									<a href="item!list?curPage=${curPage+1}&pageSize=${pageSize}&order=${order}&sequence=${sequence}">下一页</a>&nbsp;
									<a href="item!list?curPage=${lastPage}&pageSize=${pageSize}&order=${order}&sequence=${sequence}">尾页</a>&nbsp;
								</c:if>
								<c:if test="${curPage == lastPage}">
									尾页
								</c:if>&nbsp;&nbsp;&nbsp;第&nbsp;<input type="text" id="toPage"/>&nbsp;页&nbsp;&nbsp;
								<input type="submit" id="btn_page" class="btn" value="确定"/>
						</div>
					<input type="hidden" id="lastPage" value="${lastPage}"/>
					<input type="hidden" id="curPage" value="${curPage}"/>
					<input type="hidden" id="varOrder" value="${order}"/>
					<input type="hidden" id="varSeq" value="${sequence}"/>
				</form>
		</div>
	</div>
<script type="text/javascript" src="resources/back_end/js/page.js"></script>
</body>
</html>