package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	// Setter Injection Method
	private FortuneService fortuneService;
	
	// create a no-arg constructor
	public CricketCoach() {
		// Just a test message --
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// our setter method -- called by spring when doing injection
	public void setFortuneService(FortuneService fortuneService) {
		// Just a test message --
		System.out.println("CricketCoach: insde setter methiod - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
