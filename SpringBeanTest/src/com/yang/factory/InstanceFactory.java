package com.yang.factory;

import com.yang.service.InterCustomerService;
import com.yang.service.impl.CustomerServiceImpl;

/**
 * 模拟实例工厂来创建bean的实例
 * @author yang
 *
 */
public class InstanceFactory {
	public InterCustomerService getCustomerService() {
		System.out.println("实例工厂创建bean对象");
		return new CustomerServiceImpl();
	} 
}
