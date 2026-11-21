package com.example.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("setterInjectionApplicationContext.xml");
		
		Employee e=(Employee)context.getBean("obj");
		e.show();

	}

}
