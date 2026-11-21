package com.fg.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Hey");
		String name=request.getParameter("username");
		out.println("<h2>FiurstWelcome:"+name+"</h2>");
		
		//passing these data from URL
		out.println("<a href='SecondServlet?username="+name+"'>Goto Next Step</a>");
	}
}
