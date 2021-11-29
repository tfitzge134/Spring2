package com.Luv2code.springdemo;

public class SwimerCoach implements Coach {
private FortuneService fortuneService;
public SwimerCoach(FortuneService theFortuneService) {
	fortuneService = theFortuneService;
}
	@Override
	public String getDailyWorkout() {

		return "Swim 1000 meters";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
