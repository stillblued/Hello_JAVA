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
<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<h3>사원목록</h3>

<form>
	<input name="departmentId">
	<button>부서 검색</button>
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
					<td><a href="empUpdate?employeeId=${vo.empId}">${vo.lastName}</a> </td>
					
					
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>