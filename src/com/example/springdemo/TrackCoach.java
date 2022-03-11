package com.example.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDaily() {
		return "跑步練習";
	}

	@Override
	public String getDailyFortune() { 
		return "Just Do it "+fortuneService.getFortune();
	}
	//init
	public void init() {
		System.out.println("TrackCoach: inside method inint");
	}
	//destroy
	public void destroy() {
		System.out.println("TrackCoach: inside method destroy");
	}
}
