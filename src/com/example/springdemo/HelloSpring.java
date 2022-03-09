package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//retrieve bean from spring container 根據xml註冊檔 去叫所需要Bean物件
		Coach c1 = context.getBean("myCoach2",Coach.class);
		
		//call mothods on the bean
		System.out.println(c1.getDaily());
		
		//close the context 使用完關閉保持系統乾淨
		context.close();
	}

}
