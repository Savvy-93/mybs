package com.grzcgl.sxy.entity;

import java.util.Date;

public class Expenditure {
	
	/*
	 
	 CREATE TABLE `expenditure` (
  `expenditureid` int(11) NOT NULL AUTO_INCREMENT COMMENT '֧��id',
  `expendituretime` date NOT NULL COMMENT '֧������',
  `expendituretype` int(20) NOT NULL COMMENT '֧������',
  `expendituremoney` decimal(6,4) NOT NULL COMMENT '֧�����',
  `expenditureremarks` varchar(20) NOT NULL COMMENT '֧����ע',
  `userid` int(11) NOT NULL COMMENT '�û�id',
  PRIMARY KEY (`expenditureid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	 
	 
	 
	 */
	private int expenditureid;//֧��id
	private Date expendituretime;//֧������
	private int expendituretype;//֧������
	private double expendituremoney;//֧�����
	private String expenditureremarks;//֧����ע
	private int userid;//�û�id

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public int getExpenditureid() {
		return expenditureid;
	}
	public void setExpenditureid(int expenditureid) {
		this.expenditureid = expenditureid;
	}
	public Date getExpendituretime() {
		return expendituretime;
	}
	public void setExpendituretime(Date expendituretime) {
		this.expendituretime = expendituretime;
	}
	public int getExpendituretype() {
		return expendituretype;
	}
	public void setExpendituretype(int expendituretype) {
		this.expendituretype = expendituretype;
	}
	public double getExpendituremoney() {
		return expendituremoney;
	}
	public void setExpendituremoney(double expendituremoney) {
		this.expendituremoney = expendituremoney;
	}
	public String getExpenditureremarks() {
		return expenditureremarks;
	}
	public void setExpenditureremarks(String expenditureremarks) {
		this.expenditureremarks = expenditureremarks;
	}
	@Override
	public String toString() {
		return "Expenditure [expenditureid=" + expenditureid + ", expendituretime=" + expendituretime
				+ ", expendituretype=" + expendituretype + ", expendituremoney=" + expendituremoney
				+ ", expenditureremarks=" + expenditureremarks + ", userid=" + userid + "]";
	}


}
