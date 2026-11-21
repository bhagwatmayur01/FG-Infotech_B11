<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PageContext</title>
</head>
<body>
<h2>pageContext JSP implicit object</h2>
<%
pageContext.setAttribute("name", "Mayur");
%>

<%=
pageContext.getAttribute("name")
%>
</body>
</html>