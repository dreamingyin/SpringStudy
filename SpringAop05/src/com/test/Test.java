package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yin.service.UserInfoService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserInfoService service = (UserInfoService) ac.getBean("proxyFactory");
		service.add();

	}
}
