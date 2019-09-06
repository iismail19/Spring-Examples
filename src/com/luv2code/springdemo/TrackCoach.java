package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	// Constructor injection Method
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	// define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add initialization method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}

}
