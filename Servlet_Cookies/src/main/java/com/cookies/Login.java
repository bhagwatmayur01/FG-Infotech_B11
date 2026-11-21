package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ulogin")  //name of action attribute
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("name");
		PrintWriter out=resp.getWriter();

		Cookie ck=new Cookie("name", name);
		resp.addCookie(ck);

		resp.sendRedirect("profile");
//		resp.setContentType("text/html");
//		out.print("<h1>welcome to servlet1, name="+ name+"</h1>");
//
//		out.print("<br> <a href='servlet2'>servlet2</a>");
	}
}
