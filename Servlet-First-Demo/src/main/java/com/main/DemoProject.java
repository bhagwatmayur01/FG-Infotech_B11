package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoProject
 */
@WebServlet("/DemoProject")
public class DemoProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html"); //setting the content type
		PrintWriter pw=response.getWriter();//get the stream to write the data
		
		//writing html in the stream
		pw.println("<html><body>");
		pw.println("Welcome to servlet FG Infotech<br>");
		pw.println("Welcome to Mayur<br>");
		pw.println("Welcome to Ganesh<br>");
		pw.println("Welcome to Vishal<br>");
		pw.println("</body></html>");
		
		pw.close();//closing the stream
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
