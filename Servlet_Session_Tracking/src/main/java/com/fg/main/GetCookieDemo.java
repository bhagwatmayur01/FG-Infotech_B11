package com.fg.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookieDemo extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Cookie ck[]=request.getCookies();
		
		//Iterating the elements
		for(int i=0;i<ck.length;i++) {
			String name=ck[i].getName();
			String city=ck[i].getValue();
			out.println("name an city: "+name+" "+city);
			out.println("<p>We have succesfully get the vslue using cookies</p>");
		}
	}
}
