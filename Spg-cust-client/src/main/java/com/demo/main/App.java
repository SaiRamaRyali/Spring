package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Customer bean = (Customer)context.getBean("customer");

		System.out.println(bean.findRewardsAmount());
		
		//ApplicationContext conetxt  = new FileSystemXmlApplicationContext
	}

}
