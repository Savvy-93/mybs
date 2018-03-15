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
<title>支出页面</title>
<link rel="stylesheet" type="text/css" href="layui/css/layui.css">
<script type="text/javascript" src="layui/layui.js"></script>
</head>
<body>
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>
			记一笔支出 用户名：
			<s:property value="#session.user.username" />
			                    
		</legend>
	</fieldset>
	<form class="layui-form"
		action="expenditure/expenditureManagerAction!accounting" method="post"
		target="_top">
		<input type="hidden" name="expenditure.userid" value="<s:property value="#session.user.uid" />"
			 />
		<div class="layui-inline">
			<label class="layui-form-label">消费日期</label>
			<div class="layui-input-inline">
				<input type="text" name="expenditure.expendituretime" id="date"
					lay-verify="date" placeholder="yyyy-MM-dd" 
					class="layui-input">
			</div>
		</div>


		<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">消费金额</label>
				<div class="layui-input-inline" style="width: 181px;">
					<input type="text" name="expenditure.expendituremoney"
						placeholder="￥" class="layui-input">
				</div>

			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">消费类型</label>
			<div class="layui-input-block" style="width: 181px;">
				<select name="expenditure.expendituretype">
					<option value="0">无消费类型</option>
					<option value="1">饮食</option>
					<option value="2">交通</option>
					<option value="3">学习</option>
					<option value="4">交友</option>
					<option value="5">娱乐</option>
				</select>
			</div>
		</div>



		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">备注</label>
			<div class="layui-input-block" style="width: 181px;">
			<!-- <div class="layui-input-block">
				<textarea name="expenditure.expendituremarks" placeholder="请输入内容" class="layui-textarea"></textarea>
			</div> -->
			<input name="expenditure.expenditureremarks" type="text"
				class="layui-input">
		</div>
		</div>

		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
	</form>
	<script>
		layui
				.use(
						[ 'form', 'layedit', 'laydate' ],
						function() {
							var form = layui.form, layer = layui.layer, layedit = layui.layedit, laydate = layui.laydate;

							//日期
							laydate.render({
								elem : '#date'
							});
							laydate.render({
								elem : '#date1'
							});

							//创建一个编辑器
							var editIndex = layedit.build('LAY_demo_editor');

							//自定义验证规则
							/* 	form.verify({

									pass : [ /(.+){6,12}$/, '密码必须6到12位' ],
									content : function(value) {
										layedit.sync(editIndex);
									}
								}); */

							form.on('submit(demo1)', function(data) {
								layer.alert(JSON.stringify(data.field), {
									title : '最终的提交信息'
								})
								return true;
							});

						});
	</script>

</body>
</html>