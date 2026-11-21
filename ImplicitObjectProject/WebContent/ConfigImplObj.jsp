<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<title>Insert title here</title>
</head>
<body>

<% 

out.print("Welcome " + request.getParameter("uname"));

String drive = config.getInitParameter("dname");
out.print("drive name" + drive);


%>
</body>
</html>