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
	//确定用户密码验证
	function checkQRUserPassword() {
		var passspan = document.getElementById("userpasswordspan");
		//获取用户名文本框里的值
		var userpass1 = document.getElementById("userpassword").value;
		var userpass2 = document.getElementById("qruserpassword").value;
		if (userpass1 != userpass2) {
			passspan.innerHTML = "两次密码不一致！".fontcolor("red");
			return false;
		} else {
			
			passspan.innerHTML = "";
			return true;
		}
		
	}
	function checkUserMail() {
		var mailspan = document.getElementById("userpasswordspan");
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
	
	function checkUserForm() {
		
		if (checkUserName() && checkUserPassword()&&checkQRUserPassword()&&checkUserMail()) {
			return true;
			/*alert("提交成功，请等待后台数据验证！");*/

		} else {

			
			alert("登录失败，请检查仔细，正确后在提交！");
			return false;
			var checkboxnode = document.getElementById("checkpass").checked;
			/*alert("复选框的值是=" + checkboxnode);*/
			
		}
	}