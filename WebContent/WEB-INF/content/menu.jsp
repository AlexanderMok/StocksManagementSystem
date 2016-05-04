<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="topbar-wrap white">
		<div class="topbar-inner clearfix">
			<div class="topbar-logo-wrap clearfix">
				<h1 class="topbar-logo none">
					<a href="#" class="navbar-brand">后台管理</a>
				</h1>
				<ul class="navbar-list clearfix">
					<li></li>
					<li><a href="index!index">后台首页</a></li>
				</ul>
			</div>
			<div class="top-info-wrap">
				<ul class="top-info-list clearfix">
					<li><a href="user!logout">退出</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="sidebar-wrap">
		<div class="sidebar-title">
			<h1>菜单</h1>
		</div>
		<div class="sidebar-content">
			<ul class="sidebar-list">
				<c:if test="${sessionScope.user.roleId==1 }">
					<li><a href="javascript:;" class="menue"><i
							class="icon-font">&#xe018;</i>用户管理</a>
						<ul class="sub-menu">
							<li><a href="user!list"><i class="icon-font">&#xe017;</i>用户列表</a></li>
							<li><a href="user!addUser"><i class="icon-font">&#xe005;</i>增加用户</a></li>
						</ul>
					</li>
					<li><a href="javascript:;" class="menue"><i
							class="icon-font">&#xe018;</i>供应商管理</a>
						<ul class="sub-menu">
							<li><a href="supplyer!list"><i class="icon-font">&#xe017;</i>供应商列表</a></li>
							<li><a href="supplyer!add"><i class="icon-font">&#xe005;</i>增加供应商</a></li>
						</ul>
					</li>
				</c:if>
				
				<li><a href="javascript:;" class="menue"><i
						class="icon-font">&#xe003;</i>商品管理</a>
					<ul class="sub-menu">
						<li><a href="item!list"><i class="icon-font">&#xe008;</i>商品列表</a></li>
						<li><a href="item!add"><i class="icon-font">&#xe008;</i>增加新商品</a></li>
					<c:if test="${sessionScope.user.roleId==1 }">	
						<li><a href="catagorgy!list"><i class="icon-font">&#xe008;</i>商品类别列表</a></li>
						<li><a href="catagorgy!add"><i class="icon-font">&#xe008;</i>增加商品类别</a></li>
						<li><a href="unit!list"><i class="icon-font">&#xe008;</i>商品单位列表</a></li>
						<li><a href="unit!add"><i class="icon-font">&#xe008;</i>增加商品单位</a></li>
					</c:if>
					</ul>
				</li>
				
				<li><a href="javascript:;" class="menue"><i
						class="icon-font">&#xe003;</i>库存管理</a>
					<ul class="sub-menu">
						<li><a href="item!list"><i class="icon-font">&#xe008;</i>库存信息</a></li>
						<li><a href="item!inItem"><i class="icon-font">&#xe008;</i>商品进货录入</a></li>
						<li><a href="item!outItem"><i class="icon-font">&#xe008;</i>商品出货录入</a></li>
						<li><a href="stocks!list"><i class="icon-font">&#xe008;</i>流水记录(视图)</a></li>
<!-- 						<li><a href="stocks!billList"><i class="icon-font">&#xe008;</i>流水记录(非视图)</a></li> -->
					</ul>
				</li>
			</ul>
		</div>
	</div>