package com.Luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
//create private file
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	//create consructor
	public SwimCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return " swim for 2 hours ";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getTeam() {
		// TODO Auto-generated method stub
		return team;
	}

}
