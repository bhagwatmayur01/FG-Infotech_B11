package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("n");
		PrintWriter out=resp.getWriter();
		
		resp.setContentType("text/html");
		out.print("<h1>welcome to servlet1, name="+ name+"</h1>");
		
		out.print("<br> <a href='servlet2'>servlet2</a>");
	}
}
