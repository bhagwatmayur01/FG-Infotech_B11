package com.fg.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		System.out.println("SERVLET1---->Your Name is a : " + name);

		// We are calling Servlet2 class from Servlet1 class using RequestDispatcher
		// interface

		RequestDispatcher rd = request.getRequestDispatcher("servlet2");
		rd.include(request, response);
		out.println("<h2>Your Name is a: " + name + "</h2>");

	}

}
