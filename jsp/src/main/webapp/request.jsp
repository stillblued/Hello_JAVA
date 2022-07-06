<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
<li /> method 		: <%=request.getMethod() %>
<li /> uri 			: <%=request.getRequestURI() %>
<li /> url 			: <%=request.getRequestURL() %>
<li /> protocol 	: <%=request.getProtocol() %>
<li /> query str	: <%=request.getQueryString() %>
<li /> ip addr		: <%=request.getRemoteAddr() %>

</ul>

</body>
</html>