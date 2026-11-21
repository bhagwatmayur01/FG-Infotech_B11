package com.fg.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirectExample extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String website= request.getParameter("Web");
		
		response.sendRedirect(website);
		/*
		 * if(website.endsWith(".com")) {
		 * response.sendRedirect("https://"+website+".com"); }else
		 * if(website.endsWith(".in")) {
		 * response.sendRedirect("https://"+website+".in"); }else {
		 * response.sendRedirect("https://"+website+".com"); }
		 */
		
		
	}
}
