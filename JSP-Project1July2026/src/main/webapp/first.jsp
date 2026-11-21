<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>firstjspFile</title>
</head>
<body>
<%
String name=request.getParameter("username");
out.println("First.Jsp-->Welcome: "+name);
%>
</body>
</html>