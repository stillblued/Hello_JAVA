<%@page import="com.yedam.prj.emp.EmpVO"%>
<%@page import="com.yedam.prj.dept.DeptVO"%>
<%@page import="com.yedam.prj.emp.JobsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empUpdate.jsp</title>

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
#inputEmp>label {
	width: 150px;
	display: inline-block;
	background-color: #04AA6D;
	color: white;
	text-align: center;
}
</style>


</head>
<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<h1>사원수정</h1>
	<%
	EmpVO vo = (EmpVO) request.getAttribute("emp");
	%>


	<form id="inputEmp" action="empInsert" onsubmit="return validateForm()"
		name="empFrm" method="post">


		<label for="empId">사원번호</label> <input type="number" name="empId"
			id="empId" readonly="readonly" value="<%=vo.getEmpId()%>"><br>

		<label for="lastName">사원이름</label> <input type="text" name="lastName"
			id="lastName" value="<%=vo.getLastName()%>"><br> <label
			for="email">이메일</label> <input type="text" name="email" id="email"
			value="<%=vo.getEmail()%>"><br> <label for="hireDate">입사일</label>
		<input type="date" name="hireDate" id="hireDate"
			value="<%=vo.getHireDate().substring(0, 10)%>"><br> <label
			for="jobId">직책</label> <select name="jobId" id="jobId">
			<%
			ArrayList<JobsVO> list = (ArrayList<JobsVO>) request.getAttribute("jobs");
			for (JobsVO jobs : list) {
			%>
			<option value="<%=jobs.getJobId()%>">
				<%=jobs.getJobTitle()%>
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
	<script>
		document.getElementsByName("jobId")[0].value  = "<%=vo.getJobId()%>";
		document.querySelector("[name=deptId][value='<%=vo.getDepartmentId()%>']").checked = true;
	</script>


</body>
</html>