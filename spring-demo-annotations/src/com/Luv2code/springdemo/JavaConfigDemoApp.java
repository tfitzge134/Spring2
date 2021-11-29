package com.Luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);

		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//call method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//call the context
		BaskeballCouch theBaskeball = context.getBean("baskeballCouch", BaskeballCouch.class);
		System.out.println(theBaskeball.getNews());
		RandomNews news = context.getBean("randomNews", RandomNews.class);
		System.out.println(news.getNews());
		context.close();
		

	}

}
