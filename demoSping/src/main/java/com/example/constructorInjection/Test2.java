package com.example.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test2 {

	public static void main(String[] args) {
	
	//Resource r=new ClassPathResource("applicationContext.xml");
	//BeanFactory f=new XmlBeanFactory(r);
		
	ApplicationContext context=
	new ClassPathXmlApplicationContext("constructorInjectionApplicationContext.xml");

		Employee s=(Employee) context.getBean("e");
		s.show();
	}

}
