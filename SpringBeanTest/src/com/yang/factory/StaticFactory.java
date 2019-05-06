package com.yang.factory;

import com.yang.service.InterCustomerService;
import com.yang.service.impl.CustomerServiceImpl;

/**
 * 通过factory来创建bean的对象实例
 * @author yang
 *
 */
public class StaticFactory {
	public static InterCustomerService getCustomerService() {
		return new CustomerServiceImpl();
	}
}
