<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<title>Insert title here</title>
</head>
<body>

<% 

out.print(" welcome " + request.getParameter("uname"));

String drive  = application.getInitParameter("dname");

out.print(" drive name is " + drive);
%>
</body>
</html>