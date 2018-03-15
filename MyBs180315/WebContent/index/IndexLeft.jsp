<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IndexLeft</title>
<link rel="stylesheet" type="text/css" href=".././layui/css/layui.css">
<script type="text/javascript" src=".././layui/layui.js"></script>
</head>
<body>
 <div class="layui-layout layui-layout-admin">

<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
<div class="layui-side-scroll">
	<ul class="layui-nav layui-nav-tree" lay-filter="test">
		<li class="layui-nav-item layui-nav-itemed"><a class=""
			href="javascript:;">日常记账</a>
			<dl class="layui-nav-child">
				<dd>
					<a href="PaymentInfo.jsp" target="IndexRightIframe">记一笔支出</a>
				</dd>
				<dd>
					<a href="javascript:;">记一笔收入</a>
				</dd>
				
			</dl></li>
		<li class="layui-nav-item"><a href="javascript:;">统计报表</a>
			<dl class="layui-nav-child">
				<dd>
					<a href="javascript:;">柱状图统计</a>
				</dd>
				<dd>
					<a href="javascript:;">扇形图统计</a>
				</dd>
				<dd>
					<a href="../tables/TableRight.jsp" target="IndexRightIframe">表格统计</a>
				</dd>
			</dl></li>
		<li class="layui-nav-item"><a href="">哈尔滨学院教务管理系统</a></li>
		<li class="layui-nav-item"><a href="">发布商品</a></li>
	</ul>
</div>
</div>

<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
	</script>
</body>
</html>