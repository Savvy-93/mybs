<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
<title>表格统计</title>
<link rel="stylesheet" type="text/css" href="layui/css/layui.css">
<script type="text/javascript" src="layui/layui.js"></script>
</head>
<body>
<form action="table/tableManagerAction!table" method="post">

<input name="expenditure.userid" type="hidden" value="<s:property value="#session.user.uid" />">
<s:property value="#session.user.uid" />${user.uid}
<input type="submit" value="查询">
</form>
<%-- <form action="" >
<input type="hidden" value="<s:property value="#session.user.uid" />"/>
<div class="layui-form">
		<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">起始日期</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" id="test1"
						placeholder="yyyy-MM-dd">
				</div>
			</div>

			<div class="layui-inline">
				<label class="layui-form-label">结束日期</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" id="test2"
						placeholder="yyyy-MM-dd">
				</div>
			</div>
		</div>
	</div>
	<input type="submit" value="搜索">
	</form>
	<script>
	layui.use('laydate', function(){
	  var laydate = layui.laydate;
	  
	  //常规用法
	  laydate.render({
	    elem: '#test1'
	  });
	  laydate.render({
	    elem: '#test2'
	  });
	  });
	
	</script> --%>
</body>
</html>