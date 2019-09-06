package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the Spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// retrieve beans from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Singleton they should point to the same reference
		// Check to see if they are the same beans?
		boolean result = (theCoach == alphaCoach);
		
		// print the results
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach.toString());
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach.toString());
		
		// close Context
		context.close();
		
	}

}
