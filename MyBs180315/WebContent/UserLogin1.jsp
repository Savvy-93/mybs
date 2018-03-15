<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UserLogin</title>
<script type="text/javascript">
	//用户名验证
	function checkUserName() {
		var namespan = document.getElementById("usernamespan");
		//获取用户名文本框里的值
		var username = document.getElementById("username").value;
		if (username.length == 0 || username == "" || username == null) {
			namespan.innerHTML = "用户名不能为空！".fontcolor("red");
			return false;
		} else {
			if (username.length >= 7) {
				namespan.innerHTML = "用户名的长度不可以超过6个字符！".fontcolor("red");
				return false;
			} else {

				var namespan = document.getElementById("usernamespan");
				namespan.innerHTML = "用户名填写成功！".fontcolor("green");
				return true;
			}

		}
	}

	//用户密码验证
	function checkUserPassword() {
		var passspan = document.getElementById("userpasswordspan");
		//获取用户名文本框里的值
		var userpass = document.getElementById("userpassword").value;
		if (userpass.length == 0 || userpass == "" || userpass == null) {
			passspan.innerHTML = "密码不能为空！".fontcolor("red");
			return false;
		} else {

			passspan.innerHTML = "";
			return true;
		}

	}

	//用户登录邮箱验证
	function checkUserMail() {
		var mailspan = document.getElementById("usermailspan");
		//获取用户名文本框里的值
		var usermail = document.getElementById("usermail").value;
		if (usermail.length == 0 || usermail == "" || usermail == null) {
			mailspan.innerHTML = "邮箱不能为空！".fontcolor("red");
			return false;
		} else {

			mailspan.innerHTML = "";
			return true;
		}
	}

	/* 
	//自定义提交表单
	function mySubmit() {
		var mysubmit = document.getElementById("userinfo");
		mysubmit.submit();
	} */

	function checkUserForm() {
		//var zt=document.getElementById("ztspan");
		if (checkUserName() && checkUserPassword() && checkUserMail()) {
			//两秒后自动关闭窗口
			//zt.innerHTML="提交成功，请等待后台数据验证！".fontcolor("green");
			/* alert("提交成功，请等待后台数据验证！"); */

		} else {

			//zt.innerHTML="提交成功，请等待后台数据验证！".fontcolor("red");
			alert("登录失败，请检查仔细，正确后在提交！");
			var checkboxnode = document.getElementById("checkpass").checked;
			alert("复选框的值是=" + checkboxnode);
			/* 利用这个值搞一些事情 */
		}
	}
	//验证码刷新
	function refresh() {
		//IE存在缓存,需要new Date()实现更换路径的作用    
		document.getElementById("image").src = "user/createImageAction.action?+ Math.random()"
				+ new Date();
	}
</script>
</head>
<body>
	<form action="user/loginAction!login" method="post" id="userinfo"
		onsubmit="return checkUserForm()">
		用户名称: <input type="text" name="user.username" id="username"
			onblur="checkUserName()"> <span id="usernamespan"></span> <br />
		输入密码: <input type="password" name="user.userpassword"
			id="userpassword" onblur="checkUserPassword()"> <span
			id="userpasswordspan"></span> <br /> 邮箱地址: <input type="text"
			name="user.usermail" id="usermail" onblur="checkUserMail()">
		<span id="usermailspan"></span><br /> 验证码哈:
		<div>
			看不清，点击换图 <img id="image" border="0" onclick="refresh()"
				src="user/createImageAction" /><br>
			<s:textfield name="checkCode" maxlength="4" label="请输入验证码" />
			<!-- 验证验证码是否正确 -->
			${resuleMessage}
			<!-- 重定向之后值不在了 此句代码无用了 -->


		</div>
		<!--
			//自定义提交按钮
			 <input type="button" value="我的提交" onclick="mySubmit()" />
			  -->
		<input type="checkbox" id="checkpass">记住密码 <span id="ztspan"></span>
		<input type="submit" value="确定登录"> <span><font
			color="red"><s:property value="#session.lgmessage" /></font></span> <br />
		<a href="javascript:void(0)">注册账号</a> <a href="javascript:void(0)">忘记密码？</a>
	</form>
</body>
</html>