package com.example.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDaily() {
		return "Shoot for 10 balls";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Shoot for 5 mins";
	}

}
