package com.example.setterInjection.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=
		new ClassPathXmlApplicationContext("setterCollectionApplicationContext.xml");
		
		Question q=(Question) context.getBean("q");
		q.displayInfo();
		
	}

}
