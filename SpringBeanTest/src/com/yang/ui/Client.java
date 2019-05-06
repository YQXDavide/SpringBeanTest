package com.yang.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yang.dao.InterCustomerDao;
import com.yang.service.InterCustomerService;

/**
 * ģ����ֲ�
 * @author yang
 *
 */
public class Client {
	public static void main(String[] args) {
		//1.��ȡ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.����bean��id��ȡ����
		InterCustomerService customerService = (InterCustomerService) ac.getBean("customerService");
		InterCustomerDao customerDao = (InterCustomerDao) ac.getBean("customerDao");
		 customerService.saveCustomer();
	}
}
