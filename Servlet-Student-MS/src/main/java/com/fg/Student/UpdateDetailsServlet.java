package com.fg.Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateDetailsServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		int id=Integer.parseInt( request.getParameter("id"));
		System.out.println("Id is a:"+id);
		PrintWriter out=response.getWriter();
		
		for(AddStudent s:StudentInfoStore.list) {
			if(s.getId()==id) {
				out.println("<html><body>");
				out.println("<form action='update' method='post'>");
				out.println("ID:");
				out.println("<input type='hidden' name='id' value='"+s.getId()+"'><br/><br/>");
				out.println("Name:");
				out.println("<input type='text' name='name' value='"+s.getName()+"'><br/><br/>");
				out.println("City:");
				out.println("<input type='text' name='city' value='"+s.getCity()+"'><br/><br/>");
				out.println("Qualification:");
				out.println("<input type='text' name='qualification' value='"+s.getQualification()+"'><br/><br/>");
				out.println("Age:");
				out.println("<input type='text' name='age' value='"+s.getAge()+"'><br/><br/>");
				out.println("<input type='Submit' value='Update'>");
				out.println("</form>");
				out.println("</body></html>");
				
			}
		}
	}
	
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	int id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	String city=request.getParameter("city");
	String qualification=request.getParameter("qualification");
	int age=Integer.parseInt(request.getParameter("age"));
	
	for(AddStudent s:StudentInfoStore.list) {
		if(s.getId()==id) {
			s.setName(name);
			s.setCity(city);
			s.setQualification(qualification);
			s.setAge(age);
		}
	}
	PrintWriter out=response.getWriter();
	out.println("<html><body>");
	out.println("<h2>Student Updated Successfully.");
	out.println("<br/>");
	out.println("<a href='home.html'>Goto Homapage</a>");
	out.println("<br/><br/>");
	out.println("<a href='viewStudent'>View Updated Student list</a>");
	out.println("</body></html>");
}
}
