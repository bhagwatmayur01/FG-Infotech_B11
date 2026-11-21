package com.fg.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTrackingExample extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fName=request.getParameter("firstname");
		String lName=request.getParameter("lastname");
		System.out.println(fName+" "+lName);
		out.println(fName+" "+lName);
		
		//Session
		HttpSession session=request.getSession();
		session.setAttribute("firstName", fName);
		session.setAttribute("lastName", lName);
		
		out.println("<a href='servlet2'>Visit Us</a>");
		out.close();
		
	}
	
}
