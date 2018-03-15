package com.grzcgl.sxy.entity;

import java.util.Date;

public class Expenditure {
	
	/*
	 
	 CREATE TABLE `expenditure` (
  `expenditureid` int(11) NOT NULL AUTO_INCREMENT COMMENT '支出id',
  `expendituretime` date NOT NULL COMMENT '支出日期',
  `expendituretype` int(20) NOT NULL COMMENT '支出类型',
  `expendituremoney` decimal(6,4) NOT NULL COMMENT '支出金额',
  `expenditureremarks` varchar(20) NOT NULL COMMENT '支出备注',
  `userid` int(11) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`expenditureid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	 
	 
	 
	 */
	private int expenditureid;//支出id
	private Date expendituretime;//支出日期
	private int expendituretype;//支出类型
	private double expendituremoney;//支出金额
	private String expenditureremarks;//支出备注
	private int userid;//用户id

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
