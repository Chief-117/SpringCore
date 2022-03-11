package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
									
		Coach c1 = context.getBean("myCoach", Coach.class);
		System.out.println(c1.getDaily());
		context.close();
	}
}
