<%@page import="co.edu.Employees"%>
<%@page import="java.util.List"%>
<%@page import="co.edu.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-16">
<title>Insert title here</title>
</head>
<body>

	<%
	String ln = request.getParameter("last_name");
	String em = request.getParameter("email");
	String ji = request.getParameter("job_id");
	String hd = request.getParameter("hire_date");
	String[] hobbies = request.getParameterValues("hobby");
	
	
	Employees emp = new Employees();
	emp.setLastName(ln);
	emp.setEmail(em);
	emp.setJobId(ji);
	emp.setHireDate(hd);
	
	EmpDAO dao = new EmpDAO();
	dao.insertEmp(emp);
	
	List<String> list = dao.getNames();
	for (String str : list) {
		out.print("<h3>" + str + "</h3>");
	}
	%>


	
	

</body>
</html>