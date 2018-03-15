package com.grzcgl.sxy.action;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.entity.User;

import com.grzcgl.sxy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserManagerAction extends ActionSupport {
	/**
	 * 因为ActionSupport类实现了一个什么什么序列化，所以要给他加一个序列化
	 */
	private static final long serialVersionUID = 1L;
	// 引入service接口
	public UserService userService = null;

	
	// 传递过来的参数
	public User user;
	String checkCode;
	HttpSession session;

	/* public Map<String, Object> session; */

	/*
	 * 用户登录
	 */
	public String login() {

		session = ServletActionContext.getRequest().getSession(true);// 获得session
		String checkCode2 = (String) session.getAttribute("checkCode");// 获得session对象里的checkCode键对应的值

		/* if (checkCode != null && checkCode.equals(checkCode2)) { */

		User resultus = userService.login(user);
		if (resultus != null) {
			System.out.println(resultus);
			// 将用户信息存到session中
			session.setAttribute("user", resultus);
			int loginuid = resultus.getUid();
			List<Expenditure> list = userService.table(loginuid);
			session.setAttribute("table", list);
			System.out.println(list);
			/* session.setAttribute("lgmessage", ""); */
			return "loginsuccess";
		} else {

			/* session.setAttribute("lgmessage", "用户名，密码或邮箱错误"); */
			// resuleMessage = "用户名，密码或邮箱错误！";

			return "loginfaile";
		}
	}
	/*
	 * //resuleMessage = "验证码输入错误，请重新输入"; session.setAttribute("lgmessage",
	 * "验证码错误，请重新输入"); return "loginfaile";
	 */

	// }
	/*
	 * 用户退出
	 */
	public String quit() {
		ServletActionContext.getRequest().getSession().invalidate();
		return "quitsuccess";

	}

	// 创建gs方法，避免被实现类实例化，让spring实例化
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}


}
