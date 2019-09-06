package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {
			"You get a milkshake after practice",
			"Win the lottery today",
			"Find a rare soccer ball"
	};
	
	Random rand = new Random();
	
	@Override
	public String getFortune() {
		
		String fortune = fortunes[rand.nextInt(fortunes.length)];
		
		return fortune;
	}

}
