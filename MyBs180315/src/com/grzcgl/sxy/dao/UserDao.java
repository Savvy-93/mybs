package com.grzcgl.sxy.dao;

import java.util.List;

import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.entity.User;
/**
 * 
 * @��Ŀ���ƣ�MyBs 
 * @�����ƣ�UserDao 
 * @��������dao�ӿڣ� 
 * @����ʱ�䣺2018��2��23�� ����9:37:51 
 * @author ������
 * @version 1.0
 */
public interface UserDao {
	//login�ĳ��󷽷�
	public /*abstract*/ User login(User user);
	//��ͳ��
	public List<Expenditure> table(int loginuid);
}
