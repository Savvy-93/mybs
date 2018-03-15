package com.grzcgl.sxy.dao;

import com.grzcgl.sxy.entity.Expenditure;

/**
 * 
 * @项目名称：MyBs
 * @类名称：ExpenditureDao
 * @类描述：ExpenditureDao的类
 * @创建时间：2018年3月10日 上午9:45:58
 * @author 宋晓宇
 * @version 1.0
 */
public interface ExpenditureDao {
	// 支出记账的抽象方法
	public void accounting(Expenditure expenditure);

}
