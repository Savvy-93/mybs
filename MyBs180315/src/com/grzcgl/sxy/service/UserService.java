package com.grzcgl.sxy.service;

import java.util.List;

import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.entity.User;
/**
 * @��Ŀ���ƣ�MyBs 
 * @�����ƣ�UserService 
 * @��������Service�ӿڣ� 
 * @����ʱ�䣺2018��2��23�� ����9:33:29 
 * @author ������
 * @version 1.0
 */
public interface UserService {

	public User login(User user);
	public List<Expenditure> table(int loginuid);
	

}
