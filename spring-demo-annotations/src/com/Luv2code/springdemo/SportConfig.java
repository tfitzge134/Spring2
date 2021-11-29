package com.Luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Luv2code.springdemo")
public class SportConfig {
	//define bean for sadfortuneservice
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	//define bean for swimer and inject depdence
	@Bean
	public Coach swimerCoach() {
		return new SwimerCoach(sadFortuneService());
	}

}
