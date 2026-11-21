package com.fg.main;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookieDemo extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		
		PrintWriter out=response.getWriter();
		System.out.println("Out Object Created Successfully.!");
		
		//Implementation of Cookies class
		Cookie ck=new Cookie("name",name);
		response.addCookie(ck);
		out.println("<br/>");
	}
}
