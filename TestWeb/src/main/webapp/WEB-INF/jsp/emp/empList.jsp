<%@page import="com.yedam.prj.emp.EmpVO"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<h3>사원목록</h3>
	<a href="TestWeb/empInsert">사원등록</a>
<form>
	<input name="departmentId">
	<button>검색</button>
</form>


	
	<table>
		<thead>
			<tr>
				<th>사번</th>
				<th>이름</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="vo" items="${list}">
				<tr>
					<td>${vo.empId}</td>
					<td>${vo.lastName}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>