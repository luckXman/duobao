package com.lucky.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
	public static ApplicationContext ctx = null;
	
	@Before
	public void init(){
		System.out.println("init");
		ctx = new ClassPathXmlApplicationContext("springConfig.xml");
	}
	@Test
	public void springTest() {
		System.out.println("Test");
	}
 
	@After
	public void after(){
		System.out.println("success");
	}
}
