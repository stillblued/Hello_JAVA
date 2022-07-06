<%@page import="com.yedam.prj.dept.DeptVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="/WEB-INF/jsp/header.jsp" %>
	<h3>부서목록</h3>
	<a href="DeptInsert">부서등록</a>

	<table>

		<tr>
			<th>부서번호</th>
			<th>부서이름</th>

		</tr>

		<%
		ArrayList<DeptVO> list = (ArrayList<DeptVO>) request.getAttribute("list");
		for (DeptVO dept : list) {
		%>
		<tr>
			<td><%=dept.getDeptId()%></td>
			<td><a href ="DeptUpdate?deptId=<%=dept.getDeptId()%>"> <%=dept.getDeptName()%> </a></td>
		</tr>
		<%
		}
		%>
	</table>


</body>
</html>