package com.fg.Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteStudentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String ids=request.getParameter("id");
		int id=Integer.parseInt(ids);
		System.out.println("ID is"+id);
		boolean deleted=StudentInfoStore.list.removeIf(s->s.getId()==id);
		
		if(deleted) {	
			out.println("<h2>Student Deleted Successfully.</h2>");
		}else {
			out.println("<h2>Student Not Found.</h2>");
		}
		
		out.println("<a href='viewStudent'>View Student Details</a>");
	}
}
