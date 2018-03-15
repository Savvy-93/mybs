package com.grzcgl.sxy.service.impl;

import java.util.List;

import com.grzcgl.sxy.dao.UserDao;
import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.entity.User;
import com.grzcgl.sxy.service.UserService;

/**
 * @��Ŀ���ƣ�MyBs
 * @�����ƣ�UserServiceImpl
 * @��������UserService�ӿڵ�ʵ���࣡ @����ʱ�䣺2018��2��23�� ����9:41:10
 * @author ������
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
	public UserDao userDao = null;

	@Override
	public User login(User user) {
		//ʵ���෵��userDao ʵ����service ��������ظ�service
		//��userDao���login��user�������Ľ�����ظ�service
		return userDao.login(user);

	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<Expenditure> table(int loginuid) {
		
		return userDao.table(loginuid);
	}
}
