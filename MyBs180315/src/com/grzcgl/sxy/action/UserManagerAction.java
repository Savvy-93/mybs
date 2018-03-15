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
	 * ��ΪActionSupport��ʵ����һ��ʲôʲô���л�������Ҫ������һ�����л�
	 */
	private static final long serialVersionUID = 1L;
	// ����service�ӿ�
	public UserService userService = null;

	
	// ���ݹ����Ĳ���
	public User user;
	String checkCode;
	HttpSession session;

	/* public Map<String, Object> session; */

	/*
	 * �û���¼
	 */
	public String login() {

		session = ServletActionContext.getRequest().getSession(true);// ���session
		String checkCode2 = (String) session.getAttribute("checkCode");// ���session�������checkCode����Ӧ��ֵ

		/* if (checkCode != null && checkCode.equals(checkCode2)) { */

		User resultus = userService.login(user);
		if (resultus != null) {
			System.out.println(resultus);
			// ���û���Ϣ�浽session��
			session.setAttribute("user", resultus);
			int loginuid = resultus.getUid();
			List<Expenditure> list = userService.table(loginuid);
			session.setAttribute("table", list);
			System.out.println(list);
			/* session.setAttribute("lgmessage", ""); */
			return "loginsuccess";
		} else {

			/* session.setAttribute("lgmessage", "�û�����������������"); */
			// resuleMessage = "�û�����������������";

			return "loginfaile";
		}
	}
	/*
	 * //resuleMessage = "��֤�������������������"; session.setAttribute("lgmessage",
	 * "��֤���������������"); return "loginfaile";
	 */

	// }
	/*
	 * �û��˳�
	 */
	public String quit() {
		ServletActionContext.getRequest().getSession().invalidate();
		return "quitsuccess";

	}

	// ����gs���������ⱻʵ����ʵ��������springʵ����
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
