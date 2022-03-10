package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load xml
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get Bean
		CricketCoach myCricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//the console will print something because we write something in constructor
		//so that we can know the spring call the method behind the scenes 
		
		System.out.println(myCricketCoach.getDaily());
		System.out.println(myCricketCoach.getDailyFortune());
		System.out.println(myCricketCoach.getEmail());
		System.out.println(myCricketCoach.getTeam());
		//close the context
		context.close();
	}

}
