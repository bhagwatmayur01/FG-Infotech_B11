package backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
 
   @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
	   
	   String myemail = req.getParameter("email1");
	   String mypass = req.getParameter("pass1");
	   
	   PrintWriter out=resp.getWriter();
	   
	   
	   if(myemail.equals("xyz@gmail.com") && mypass.equals("123")) 
	   {
		  // req.setAttribute("name_key", "Mayur");
		   
		   HttpSession session =req.getSession();
		   session.setAttribute("name_key", "Mayur");
		   RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
		   rd.forward(req, resp);
		   
	   }
	   else {
		   resp.setContentType("text/html");
		   out.print("<h3 style='color:red'>Email id and password didn't matched</h3>");
		   RequestDispatcher rd=req.getRequestDispatcher("/index.html");
		   //rd.forward(req, resp);
		   rd.include(req, resp);
	   }
	   
	
}
}
