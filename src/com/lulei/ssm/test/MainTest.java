package com.lulei.ssm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lulei.ssm.dao.UserMapper;
import com.lulei.ssm.service.BookService;
import com.lulei.ssm.service.UserService;

public class MainTest {

	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService bean = ac.getBean("bookservice",BookService.class);
		System.out.println(bean.findAll());
	}
}
