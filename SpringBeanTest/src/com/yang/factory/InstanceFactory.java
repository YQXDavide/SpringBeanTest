package com.yang.factory;

import com.yang.service.InterCustomerService;
import com.yang.service.impl.CustomerServiceImpl;

/**
 * ģ��ʵ������������bean��ʵ��
 * @author yang
 *
 */
public class InstanceFactory {
	public InterCustomerService getCustomerService() {
		System.out.println("ʵ����������bean����");
		return new CustomerServiceImpl();
	} 
}
