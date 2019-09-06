package com.luv2code.springdemo;

public class SoccerCoach implements Coach{
	
	RandomFortuneService fortune;
	
	public SoccerCoach(RandomFortuneService fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Drible the ball for 10 mins, then play a mini practice game!";
	}

	@Override
	public String getDailyFortune() {
		
		return "Today's fortune: " + fortune.getFortune();
	}

}
