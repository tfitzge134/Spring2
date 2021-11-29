package com.Luv2code.springdemo;

import java.util.Random;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class FileFortuneService implements FortuneService{
//get the file
	private String fileName ="/Users/teresa/springAnnotation/spring-demo-annotations/src/fortune-data.txt";
	private List<String> theFortunes;
	//create random number generator
	Random random = new Random();
	//create constructor
	public FileFortuneService() {
		File theFile = new File(fileName);
		System.out.println("reading fortune from file" + theFile);
		System.out.println("if file exists" + theFile.exists());
		//initialize array list
		theFortunes = new ArrayList<String> ();
		//read fortune from file
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String getFortune() {
//PICK RANDON STRING FROM ARRAYS
		int index = random.nextInt(theFortunes.size());
		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}

}
//import org.springframework.stereotype.Component;

//@Component
//public class FileFortuneService implements FortuneService {
//
//	private String fileName = "C:/foobar/fortune-data.txt";
//	private List<String> theFortunes;
//
//	// create a random number generator
//	private Random myRandom = new Random();
//
//	public FileFortuneService() {
//
//		File theFile = new File(fileName);
//		
//		System.out.println("Reading fortunes from file: " + theFile);
//		System.out.println("File exists: " + theFile.exists());
//		
//		// initialize array list
//		theFortunes = new ArrayList<String>();
//		
//		// read fortunes from file
//		try (BufferedReader br = new BufferedReader(
//				new FileReader(theFile))) {
//
//			String tempLine;
//
//			while ((tempLine = br.readLine()) != null) {
//				theFortunes.add(tempLine);
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public String getFortune() {
//		// pick a random string from the array
//		int index = myRandom.nextInt(theFortunes.size());
//
//		String tempFortune = theFortunes.get(index);
//
//		return tempFortune;
//	}
//
//}
