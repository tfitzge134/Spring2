package com.Luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean froom spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		//call method
		System.out.println(theCoach.getDailyWorkout());
		//call the context
		context.close();
		

	}

}
