package com.Luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	//setup private fiels x fortuneService to be injected
	private FortuneService fortuneService;
//create a constructor to pass fortuneservice
	public TennisCoach(FortuneService theFortuneService) {
		//assign to the constructor the field parameter fortuneserive
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Tennis! ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


}
