package com.Luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean froom spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//call method
		System.out.println(theCoach.getDailyWorkout());
		//call the context
		BaskeballCouch theBaskeball = context.getBean("baskeballCouch", BaskeballCouch.class);
		System.out.println(theBaskeball.getNews());
		RandomNews news = context.getBean("randomNews", RandomNews.class);
		System.out.println(news.getNews());
		context.close();
		

	}

}
