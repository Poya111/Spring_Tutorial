package com.Tutorial.Hamid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext ap = new  ClassPathXmlApplicationContext("resources/spring.xml");
		Triangle tr =(Triangle)ap.getBean("triAngle");
		System.out.println("Triangle: " + tr);

	}

}
