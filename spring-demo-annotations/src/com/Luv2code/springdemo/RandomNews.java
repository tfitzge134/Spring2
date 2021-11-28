package com.Luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomNews implements Baskeball{
	//declare arrays of news
	 String[] data = {" Team A defeated team B by 50 point",
		"Team B is half way winning", "Team B is the winner"
	};

	@Override
	public String getNews() {

		 //create an Ramdon number for data
		 Random random = new Random();
		 //assign random to ramdomize data
		 int index = random.nextInt(data.length);
		 String theNews=data[index];
		return theNews;
	}

}
