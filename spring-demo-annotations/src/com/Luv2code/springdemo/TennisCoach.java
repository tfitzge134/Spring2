package com.Luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	//setup private fiels x fortuneService to be injected
	//AUTOWIRED APPLY INJECTION TO THE FIELD
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	//define a default constructor to show what spring is doing behind scene
	public TennisCoach() {
		System.out.println("tenniscoach:>>>> inside the constructor");
	}
//define a setter method
	//autowired find any depedencies for the fortuneserive
//	@Autowired
//	public void doSomeCrazystuff(FortuneService theFortuneService) {
//		System.out.println("tenniscoach:>>>> inside the doSOMECRAZYSTUFF");
//		fortuneService=theFortuneService;
//		
//	}
//	@Autowired
////create a constructor to pass fortuneservice
//	public TennisCoach(FortuneService theFortuneService) {
//		//assign to the constructor the field parameter fortuneserive
//		fortuneService = theFortuneService;
//	}
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
