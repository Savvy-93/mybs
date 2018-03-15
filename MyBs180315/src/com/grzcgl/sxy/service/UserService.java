package com.grzcgl.sxy.service;

import java.util.List;

import com.grzcgl.sxy.entity.Expenditure;
import com.grzcgl.sxy.entity.User;
/**
 * @项目名称：MyBs 
 * @类名称：UserService 
 * @类描述：Service接口！ 
 * @创建时间：2018年2月23日 上午9:33:29 
 * @author 宋晓宇
 * @version 1.0
 */
public interface UserService {

	public User login(User user);
	public List<Expenditure> table(int loginuid);
	

}
