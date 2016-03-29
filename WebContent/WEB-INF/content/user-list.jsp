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
<title>用户列表</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<!--/sidebar-->
	<div class="main-wrap">
		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index!index">后台首页</a><span
					class="crumb-step">&gt;</span><span class="crumb-name">用户列表</span>
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
                            <th width="120"><a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i></a> </th>
                            <td>
                                <select name="order" id="orderBy">
                                    <option value="-1">选择</option>
                                    <option value="user_name">用户名称</option>
                                    <option value="role_name">用户角色</option>
                                    <option value="work_code">工号</option>
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
						<a href="user!addUser"><i class="icon-font"></i>添加用户</a>
					</div>
				</div>
				<div class="result-content">
					<table class="result-tab" width="100%" style="text-align: center;">
						<tr>
							<td class="tc"><input class="allChoose" name=""
								type="checkbox"></td>
							<td>用户名称</td>
							<td>用户密码</td>
							<td>用户角色</td>
							<td>工号</td>
							<td>操作</td>
						</tr>

						<s:iterator value="list" var="u">
							<tr>
								<td class="tc"></td>
								<td><s:property value="userName" /></td>
								<td><s:property value="password" /></td>
								<td><s:property value="roleName" /></td>
								<td><s:property value="workCode" /></td>
								<td><a class="link-update" href="user!editUser?userId=${u.userId}">修改</a>
									<a class="link-del" href="user!deleteUser?userId=${u.userId}">删除</a></td>
							</tr>
						</s:iterator>
					</table>
				<form name="user">
						<div class="page_ctrl">
								<c:if test="${curPage != 1}">
									<a href="user!list?curPage=1&pageSize=${pageSize}&order=${order}&sequence=${sequence}">首页</a>&nbsp;
									<a href="user!list?curPage=${curPage - 1}&pageSize=${pageSize}&order=${order}&sequence=${sequence}">上一页</a>&nbsp;
								</c:if> 
								<c:if test="${curPage == 1}">
									首页&nbsp;
								</c:if> 
								第${curPage}页&nbsp;&nbsp;共${lastPage}页								
								<c:if test="${curPage != lastPage}">
									<a href="user!list?curPage=${curPage+1}&pageSize=${pageSize}&order=${order}&sequence=${sequence}">下一页</a>&nbsp;
									<a href="user!list?curPage=${lastPage}&pageSize=${pageSize}&order=${order}&sequence=${sequence}">尾页</a>&nbsp;
								</c:if>
								<c:if test="${curPage == lastPage}">
									尾页
								</c:if>
								&nbsp;&nbsp;&nbsp;第&nbsp;<input type="text" id="toPage"/>&nbsp;页&nbsp;&nbsp;&nbsp;
								<input type="submit" id="btn_page" class="btn" value="确定"/>
						</div>
					<input type="hidden" id="lastPage" value="${lastPage}"/>
					<input type="hidden" id="curPage" value="${curPage}"/>
					<input type="hidden" id="varOrder" value="${order}"/>
					<input type="hidden" id="varSeq" value="${sequence}"/>
					</form>
				</div>
		</div>
	</div>
<script type="text/javascript" src="resources/back_end/js/page.js"></script>
</body>
</html>