<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<title>Insert title here</title>
</head>
<body>

<% 
response.sendRedirect("https://www.google.com/search?q=" + request.getParameter("uname"));
%>
</body>
</html>