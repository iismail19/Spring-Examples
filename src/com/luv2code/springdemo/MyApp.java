package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// Create the object
		Coach theCoach = new BaseballCoach();
		Coach anotherCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(anotherCoach.getDailyWorkout());
	}

}
