package com.yang.dao.impl;

import com.yang.dao.InterCustomerDao;

/**模拟持久层实现类
 * @author yang
 *
 */
public class CustomerDaoImpl implements InterCustomerDao {
	
	public CustomerDaoImpl() {
		System.out.println("通过无参构造函数创建 bean-dao的实例");
	}
	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		System.out.println("持久层保存客户");
	}

}
