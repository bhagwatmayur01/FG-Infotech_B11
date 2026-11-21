
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Addition extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse Response) throws IOException{
		
		Response.setContentType("text/html");
		String number1=request.getParameter("num1");
		String number2=request.getParameter("num2");
		int n1=Integer.parseInt(number1);
		int n2=Integer.parseInt(number2);
		
		int result=n1+n2;
		
		PrintWriter out=Response.getWriter();
		out.println("Adition: "+result);
	}
}
