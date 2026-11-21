package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		
		response.setContentType("text/html");
		//Servlet means we can write our HTML 
		//code inside java program it known as a servlet.
		
		PrintWriter out=response.getWriter();
		out.println("<h1>HTML code inside java program means servlet technology.</h1>");

	}

}
