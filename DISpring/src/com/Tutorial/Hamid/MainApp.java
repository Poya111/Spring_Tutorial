package com.Tutorial.Hamid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Tutorial.Hamid.Employee;

public class MainApp {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("resources/employeeBeans.xml");
		 Employee e1 = (Employee) context.getBean("emp1");
		 System.out.println(" Employee Details:  " + e1);

	}

}
