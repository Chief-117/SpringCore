package com.example.springdemo;

public class BaseBallCoach implements Coach{
	@Override
	public String getDaily() {
		return "花30分鐘練習打擊";
	}
}
