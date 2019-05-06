package com.yang.service.impl;

import java.util.*;

import com.yang.dao.InterCustomerDao;
import com.yang.service.InterCustomerService;

/**
 * 模拟业务层实现类
 * @author yang
 *
 */
public class CustomerServiceImpl implements InterCustomerService {
	private String name;
	private Integer age;
	private Date date;
	private String[] myString;
	private List<String> myList;
	private Set<String> mySet;
	private Map<String,String> myMap;
	private Properties myProp;
	private InterCustomerDao customerDao;
	public CustomerServiceImpl() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setMyString(String[] myString) {
		this.myString = myString;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	public void setMyProp(Properties myProp) {
		this.myProp = myProp;
	}

	public void setCustomerDao(InterCustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		System.out.println("业务层调用持久层");
		customerDao.saveCustomer();
		System.out.println(Arrays.toString(myString));
		System.out.println(myList);
		System.out.println(mySet);
		System.out.println(myMap);
		System.out.println(myProp);
		
	}

}
