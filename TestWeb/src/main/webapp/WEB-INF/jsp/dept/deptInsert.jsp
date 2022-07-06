<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
function validationform() {
	if(frm.deptId.value == ""){
		alert("부서번호 입력");
		return;
	}
	frm.submit(); //폼전송
}

</script>

</head>
<body>
<%@include file="/WEB-INF/jsp/header.jsp" %>
<form name = "frm" action = "DeptInsert" method = "get">
	<label for="deptId">부서번호</label>
	<input type = "number" name="deptId" id="deptId"><br>
	<label for="deptName">부서이름</label>
	<input type = "text" name="deptName" id="deptName"><br>
	<button type ="button" onclick = "validationform()">부서등록</button>

</form>


</body>
</html>