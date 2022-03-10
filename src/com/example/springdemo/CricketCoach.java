package com.example.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	//create a no-arg constructor to know where we are now
	private String email;
	private String team;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("CricketCoach:inside setter method - setEmail");
		this.email = email;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach:inside setter method - setTeam");
		this.team = team;
	}
	public CricketCoach() {
		System.out.println("CricketCoach:inside no-arg constructor");
	}
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach:inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDaily() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
