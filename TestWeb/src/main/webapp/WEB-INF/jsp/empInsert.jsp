<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empInsert.jsp</title>
</head>
<body>
	<h1>사원등록</h1>
	<form action="empServ" name="empFrm" method="get">
		<label for="empId">사원번호</label>
		<input type="number" name="empId" id="empId"><br>
		<label for="lastName">사원이름</label>
		<input type="text" name="lastName" id="lastName"><br>
		<label for="email">이메일</label>
		<input type="text" name="email" id="email"><br>
		<label for="hireDate">입사일</label>
		<input type="date" name="hireDate" id="hireDate"><br>
		<label for="jobId">직책번호</label>
		<input type="text" name="jobId" id="jobId"><br>
		<input type="submit" value="저장">
		<input type="button" value="선택삭제" id="deleteSel">
	</form>
</body>
</html>