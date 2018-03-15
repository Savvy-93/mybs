<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>登录测试</title>
<link rel="stylesheet" href="myassets/mycss/login.css">
<script type="text/javascript" src="myassets/myjs/register.js"></script>
</head>
<body>
	<div class="am-g myapp-login">
		<div class="myapp-login-logo-block  tpl-login-max">
			<div class="myapp-login-logo-text">
				<div class="myapp-login-logo-text">
					学生支出管理系统<span> Register</span> <i class="am-icon-skyatlas"></i>

				</div>
			</div>

			<div class="login-font">
				<i>Log In </i> or <span> Sign Up</span>
			</div>
			<div class="am-u-sm-10 login-am-center">
				<form class="am-form" action="user/loginAction!register" method="post" onsubmit="return checkUserForm()">
					<div class="form-back">
						<!-- 中间的表单 -->
						<div class="am-form-group">
							<input type="text" class="" placeholder="输入账号"
								name="user.username" id="username" onblur="checkUserName()">
						</div>
						<div class="am-form-group">
							<input type="password" class="" placeholder="输入密码"
								name="user.userpassword" id="userpassword"
								onblur="checkUserPassword()">
						</div>
						 <div class="am-form-group">
							<input type="password" class="" placeholder="确认密码"
								 id="qruserpassword"
								onblur="checkQRUserPassword()">
						</div>
						 <div class="am-form-group">
							<input type="text" class="" placeholder="输入邮箱"
								name="user.usermail" id="usermail"
								onblur="checkUserMail()">
						</div>
						
						<p>
							<input type="submit" id="login-input-submit-button" value="注册" />

						</p>
						<span id="usernamespan"></span> <span id="userpasswordspan"></span><br/>
						<a href="UserLogin.jsp">直接登录</a>
						<a href="javascript:void(0)">忘记密码？</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>