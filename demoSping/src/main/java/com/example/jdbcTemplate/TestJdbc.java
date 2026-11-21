package com.example.jdbcTemplate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:jdbcTemplateApplicationContext.xml")
public class TestJdbc {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("jdbcTemplateApplicationContext.xml");
		
		EmployeeDao dao=context.getBean("edao",EmployeeDao.class);
		int status=dao.saveEmployee(new Employee(102,"Mayur",75000));
		System.out.println("Rows affected:"+status);
		
		((ClassPathXmlApplicationContext)context).close();
		
	    /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
	    System.out.println(status); 
	    */  
			          
	    /*Employee e=new Employee(); 
	    e.setId(102); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);*/  

	}

}
