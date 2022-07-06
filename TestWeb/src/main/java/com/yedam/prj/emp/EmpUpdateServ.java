package com.yedam.prj.emp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.prj.dept.DeptDAO;
import com.yedam.prj.dept.DeptVO;



@WebServlet("/empUpdate")
public class EmpUpdateServ extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpDAO empDao = new EmpDAO();
		DeptDAO deptDao =new DeptDAO();
		req.setAttribute("jobs", empDao.selectJobs()); //여러번 쓰이면 변수선언 할것
		req.setAttribute("depts", deptDao.selectAll());
		
		//사번 받아서 단건 조회
		String id = req.getParameter("employeeId");
		req.setAttribute("emp", empDao.selectOne(id));
		
		req.getRequestDispatcher("/WEB-INF/jsp/emp/empUpdate.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		
		String id = req.getParameter("empId");
		String name = req.getParameter("lastName");
		String email = req.getParameter("email");
		String hire = req.getParameter("hireDate");
		String job = req.getParameter("jobId");
		
		
		EmpVO vo = new EmpVO();
		vo.setEmpId(id);
		vo.setLastName(name);
		vo.setEmail(email);
		vo.setHireDate(hire);
		vo.setJobId(job);
		
		EmpDAO dao = new EmpDAO();
		int cnt = dao.update(vo);
		
		resp.getWriter().append(cnt + "건이 등록됨");

	}
	
	
	
	
	

}
