package com.fg.Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddStudentServlet extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String ids=request.getParameter("id");
		int id=Integer.parseInt(ids);
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String qualification=request.getParameter("qualification");
		String ages=request.getParameter("age");
		int age=Integer.parseInt(ages);
		
		AddStudent s=new AddStudent(id, name, city, qualification, age);
		StudentInfoStore.list.add(s);
		
		out.println("<h2>Student Added Successfully!!!</h2>");
		out.println("<a href='viewStudent'>View Student Details</a>");
	}
	
}
