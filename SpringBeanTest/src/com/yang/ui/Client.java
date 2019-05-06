package com.yang.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yang.dao.InterCustomerDao;
import com.yang.service.InterCustomerService;

/**
 * 模拟表现层
 * @author yang
 *
 */
public class Client {
	public static void main(String[] args) {
		//1.获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.根据bean的id获取对象
		InterCustomerService customerService = (InterCustomerService) ac.getBean("customerService");
		InterCustomerDao customerDao = (InterCustomerDao) ac.getBean("customerDao");
		 customerService.saveCustomer();
	}
}
