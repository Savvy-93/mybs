<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IndexTop</title>
<link rel="stylesheet" type="text/css" href="layui/css/layui.css">
<script type="text/javascript" src="layui/layui.js"></script>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">学生个人支出管理系统</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a href="javascript:;">日常记账</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="javascript:void(0)">记一笔支出</a>
						</dd>
						<dd>
							<a href="javascript:;">记一笔收入</a>
						</dd>
						<dd>
							<a href="javascript:;">记一笔意外收获</a>
						</dd>
					</dl>
				</li>
				<li class="layui-nav-item"><a href="javascript:;">统计报表</a></li>
				<li class="layui-nav-item"><a href="javascript:;">用户</a></li>
				<li class="layui-nav-item"><a href="javascript:;">其它系统</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">邮件管理</a>
						</dd>
						<dd>
							<a href="">消息管理</a>
						</dd>
						<dd>
							<a href="">授权管理</a>
						</dd>
					</dl></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
			<s:if test="#session.user.username!=null">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img"> <s:property
							value="#session.user.username" /> <!-- 获得session的用户姓名 -->
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
						<dd>
							<a href="">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="user/loginAction!quit" target="_top">退了</a></li>
				</s:if>
				<s:else>
				<li class="layui-nav-item">
				<a href="javascript:void(0)">注册</a>
				</li>
				<li class="layui-nav-item">
				<a href="UserLogin.jsp" target="_top">登录</a>
				</li>
				</s:else>
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