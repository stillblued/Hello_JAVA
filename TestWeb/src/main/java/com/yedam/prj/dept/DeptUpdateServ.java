package com.yedam.prj.dept;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeptUpdate")
public class DeptUpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeptUpdateServ() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String deptId = request.getParameter("deptId");
		DeptDAO deptDao = new DeptDAO();
		request.setAttribute("dept", deptDao.selectOne(deptId));
		request.getRequestDispatcher("/WEB-INF/jsp/dept/deptUpdate.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String id = request.getParameter("deptId");
		String name = request.getParameter("deptName");
		DeptVO vo = new DeptVO();
		vo.setDeptId(id);
		vo.setDeptName(name);

		DeptDAO dao = new DeptDAO();
		int cnt = dao.deptUpdate(vo);

		response.getWriter().append(cnt + "건이 등록됨");

	}

}
