package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleScopeDemoApp {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
									
		Coach c1 = context.getBean("myFootballCoach", Coach.class);
		Coach c2 = context.getBean("myFootballCoach", Coach.class);
		//check if they are the same (singleton) and print the result
		boolean check = (c1 == c2);
		System.out.println("\nPointing to same object:"+check);
		System.out.println("\nMemory location c1:"+c1);
		System.out.println("\nMemory location c2:"+c2);
		context.close();
	}
}
