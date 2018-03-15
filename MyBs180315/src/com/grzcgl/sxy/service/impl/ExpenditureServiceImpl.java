package com.grzcgl.sxy.service.impl;

import com.grzcgl.sxy.dao.ExpenditureDao;
import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.service.ExpenditureService;


/**
 * @项目名称：MyBs
 * @类名称：UserServiceImpl
 * @类描述：UserService接口的实现类！ @创建时间：2018年2月23日 上午9:41:10
 * @author 宋晓宇
 * @version 1.0
 */
public class ExpenditureServiceImpl implements ExpenditureService {
	public ExpenditureDao expenditureDao = null;

	@Override
	public int Accounting(Expenditure expenditure) {
			expenditureDao.accounting(expenditure);
		return 1;
	}

	public ExpenditureDao getExpenditureDao() {
		return expenditureDao;
	}

	public void setExpenditureDao(ExpenditureDao expenditureDao) {
		this.expenditureDao = expenditureDao;
	}


	

}
