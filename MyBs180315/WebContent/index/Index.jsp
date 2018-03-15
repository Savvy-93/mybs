<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>支出管理系统 后台大布局 - 宋晓宇</title>
<link rel="stylesheet" type="text/css" href=".././layui/css/layui.css">
<script type="text/javascript" src=".././layui/layui.js"></script>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<iframe src="IndexTop.jsp" frameBorder="0" width="100%" scrolling="no"></iframe>


		<div class="layui-side layui-bg-black">
			<iframe src="IndexLeft.jsp" frameBorder="0" height="100%"
				scrolling="no"></iframe>

		</div>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div style="padding: 1px;">
			
			<iframe frameborder="1" name="IndexRightIframe" scrolling="auto" src="IndexRightIframe.jsp" height="700px" width="1160px"></iframe>
			
			
			</div>
		</div>

		<div class="layui-footer">
			<!-- 底部固定区域 -->
			© 宋晓宇 - 底部固定区域
		</div>
	</div>
	<!-- <script src="../src/layui.js"></script> -->
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
	</script>
</body>
</html>


