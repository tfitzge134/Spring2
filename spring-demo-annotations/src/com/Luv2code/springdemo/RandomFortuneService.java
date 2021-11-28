package com.Luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
//create array of striing
	private String[] data ={"Todays is Friday the 13th", "13 is my lucky number",
		"Karma is better than luck"
		};
//create a random generator
	private Random random = new Random();
	@Override
	public String getFortune() {
//get random based on size of array
		int index = random.nextInt(data.length);
		//get the fortune
		String myFortune = data[index];
		return myFortune;
	}

}
