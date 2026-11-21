package com.fg.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServletForHiden extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		out.println("<h2>FirstServletForHiden--->Welcome: "+name+"</h2>");
		
		//Hidden textfield
		out.println("<form action='SecondServletForHiden' method='post'>");
		out.println("<input type='hidden' name='username1' value='"+name+"'/>");
		out.println("<input type='submit' value='Goto Second Servlet'/>");
		out.println("<form/>");
		out.close();
	}
}
