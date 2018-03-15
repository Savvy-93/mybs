package com.grzcgl.sxy.dao;

import java.util.List;

import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.entity.User;
/**
 * 
 * @项目名称：MyBs 
 * @类名称：UserDao 
 * @类描述：dao接口！ 
 * @创建时间：2018年2月23日 上午9:37:51 
 * @author 宋晓宇
 * @version 1.0
 */
public interface UserDao {
	//login的抽象方法
	public /*abstract*/ User login(User user);
	//表单统计
	public List<Expenditure> table(int loginuid);
}
