<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DeclarationTag</title>
</head>
<body>
<h3>JSP Declaration Tag</h3>
<p>Using JSP Declaration tag we can write varibles methods in our JSP file.</p>
<p>Example of Declaration tag: varible</p><br/>
<%!
int age=25;
%>

<% 
out.println("The age is a :"+age);
%>

<p>Example of Declaration tag: Square method</p><br/>

<%! 
int square(int number){
	return number*number;
}
%>

<%
out.println("The square is a: "+square(2));
%>
</body>
</html>