package com.Luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
//create private file
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	//create consructor
	
	
	public SwimCoach(FortuneService fortuneService, String email, String team) {
		super();
		this.fortuneService = fortuneService;
		this.email = email;
		this.team = team;
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
public SwimCoach() {
		
	}


}

