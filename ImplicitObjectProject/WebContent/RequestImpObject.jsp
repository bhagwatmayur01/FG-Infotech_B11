<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<title>Insert title here</title>
</head>
<body>

<% 
String name = request.getParameter("uname");
out.print( "Welcome" + name);
%>
</body>
</html>