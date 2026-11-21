package com.fg.Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewStudentServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>Student List<h2>");
		for(AddStudent s:StudentInfoStore.list) {
			out.println("ID: "+s.getId()+"<br/>");
			out.println("Name: "+s.getName()+"<br/>");
			out.println("City: "+s.getCity()+"<br/>");
			out.println("Qualification: "+s.getQualification()+"<br/>");
			out.println("Age: "+s.getAge()+"<br/>");
			
			out.println("<a href='update?id=" + s.getId() + "'>Update</a>");
			//out.print("<a href='delete?id'>Delete</a>");
			out.println("<a href='delete?id=" + s.getId() + "'>Delete</a>");
			out.println("<br/>");
			out.println("<br/>");
		}
	}
}
