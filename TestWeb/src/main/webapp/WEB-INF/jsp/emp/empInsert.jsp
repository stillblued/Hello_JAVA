<%@page import="com.yedam.prj.dept.DeptVO"%>
<%@page import="com.yedam.prj.emp.JobsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empInsert.jsp</title>

<script>
	function validateForm() {

		if (empFrm.empId.value == "") {
			alert("사번입력");
			empFrm.empId.focus();
			return false;
		}
		if (empFrm.lastName.value == "") {
			alert("이름입력");
			empFrm.lastName.focus();
			return false;
		}
		if (empFrm.email.value == "") {
			alert("이메일입력");
			empFrm.email.focus();
			return false;
		}
		if (empFrm.hireDate.value == "") {
			alert("입사일입력");
			empFrm.hireDate.focus();
			return false;
		}
		if (empFrm.jobId.value == "") {
			alert("직무입력");
			empFrm.jobId.focus();
			return false;
		}
		var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		if (regExp.test(empFrm.email.value) == false) {
			alert("이메일형식");
			empFrm.email.focus();
			return false;
		}

		return true;

	}
</script>

<style type="text/css">

#inputEmp > label {
width : 150px;
display: inline-block;
background-color: blue;
color: white;
text-align: center;

}


</style>


</head>
<body>
<%@include file="/WEB-INF/jsp/header.jsp" %>
	<h1>사원등록</h1>
	<form id="inputEmp" action="empInsert" onsubmit="return validateForm()"
		name="empFrm" method="post">
		<label for="empId">사원번호</label> <input type="number" name="empId"
			id="empId"><br> <label for="lastName">사원이름</label> <input
			type="text" name="lastName" id="lastName"><br> <label
			for="email">이메일</label> <input type="text" name="email" id="email"><br>
		<label for="hireDate">입사일</label> <input type="date" name="hireDate"
			id="hireDate"><br> <label for="jobId">직책</label> <select
			name="jobId" id="jobId">
			<%
			ArrayList<JobsVO> list = (ArrayList<JobsVO>) request.getAttribute("jobs");
			for (JobsVO jobs : list) {
			%>
			<option value="<%=jobs.getJobId()%>"><%=jobs.getJobTitle()%>
				<%
				}
				%>
			
		</select> <br>

		<div id="deptId">
			<label>부서번호</label>
			<%
			ArrayList<DeptVO> list2 = (ArrayList<DeptVO>) request.getAttribute("depts");
			for (DeptVO depts : list2) {
			%>
			<input type="radio" name="deptId" value="<%=depts.getDeptId()%>"><%=depts.getDeptName()%>
			<%
			}
			%>
		</div>
		<br> <input type="submit" value="등록">
	</form>
</body>
</html>