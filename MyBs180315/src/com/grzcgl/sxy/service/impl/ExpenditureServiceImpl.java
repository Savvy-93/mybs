package com.grzcgl.sxy.service.impl;

import com.grzcgl.sxy.dao.ExpenditureDao;
import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.service.ExpenditureService;


/**
 * @��Ŀ���ƣ�MyBs
 * @�����ƣ�UserServiceImpl
 * @��������UserService�ӿڵ�ʵ���࣡ @����ʱ�䣺2018��2��23�� ����9:41:10
 * @author ������
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
