package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class TestService {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)factory.getBean("userService");
		userService.saveUser();
	}
}
