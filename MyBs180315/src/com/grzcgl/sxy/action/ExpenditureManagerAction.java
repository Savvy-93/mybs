package com.grzcgl.sxy.action;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.struts2.ServletActionContext;

import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.entity.User;
import com.grzcgl.sxy.service.ExpenditureService;
import com.opensymphony.xwork2.ActionSupport;

public class ExpenditureManagerAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Expenditure expenditure;
	private ExpenditureService expenditureService;

	HttpSession session ;// »ñµÃsession

	public String accounting() {
		session = ServletActionContext.getRequest().getSession(true);
		System.out.println(expenditure);
		Object loginuser = session.getAttribute("user");
		if (loginuser != null) {
			expenditureService.Accounting(expenditure);

			return "expendituresuccess";
		} else {

			return "expenditurefalse";
		}
	}


	public ExpenditureService getExpenditureService() {
		return expenditureService;
	}

	public void setExpenditureService(ExpenditureService expenditureService) {
		this.expenditureService = expenditureService;
	}

	public Expenditure getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(Expenditure expenditure) {
		this.expenditure = expenditure;
	}

}