package com.yang.factory;

import com.yang.service.InterCustomerService;
import com.yang.service.impl.CustomerServiceImpl;

/**
 * ͨ��factory������bean�Ķ���ʵ��
 * @author yang
 *
 */
public class StaticFactory {
	public static InterCustomerService getCustomerService() {
		return new CustomerServiceImpl();
	}
}
