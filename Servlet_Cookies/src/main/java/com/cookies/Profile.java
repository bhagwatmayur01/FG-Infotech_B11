package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Profile extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//String name=req.getParameter("name");
		//PrintWriter out=resp.getWriter();

		Cookie[] ck=req.getCookies();

		if (ck==null) {
			resp.sendRedirect("index.html");
		}else {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();

			out.println("<h1>name:= "+ck[0].getValue()+"</h1>");
			out.println("<a href='logout'>Logout</a>");
		}

		//resp.setContentType("text/html");
		//out.print("<h1>Welcome to servlet2, name="+ name +"</h1>");
		//ck[0].getValue()

	}
}
