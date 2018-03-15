package com.grzcgl.sxy.service.impl;

import java.util.List;

import com.grzcgl.sxy.dao.UserDao;
import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.entity.User;
import com.grzcgl.sxy.service.UserService;

/**
 * @项目名称：MyBs
 * @类名称：UserServiceImpl
 * @类描述：UserService接口的实现类！ @创建时间：2018年2月23日 上午9:41:10
 * @author 宋晓宇
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
	public UserDao userDao = null;

	@Override
	public User login(User user) {
		//实现类返回userDao 实现了service 将结果返回给service
		//将userDao里的login（user）方法的结果返回给service
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
