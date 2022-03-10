package com.example.springdemo;

public class BaseballCoach implements Coach{
	//定義依賴屬性
	private FortuneService fortuneService;
	//並帶入service 屬性 使這裡的變數theFortuneService 等於所建構的fortuneService
	//定義依賴建構子
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDaily() {
		return "花30分鐘練習打擊";
	}
	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
