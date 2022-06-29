package co.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/FullCalendarServ")
public class FullCalendarServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FullCalendarServ() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");

		EmpDAO dao = new EmpDAO();
		List<CalendarVO> schedules = dao.getSchedule();

		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(schedules));

		// [{title, startDate, endDate}, ...]

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		request.setCharacterEncoding("utf-8");

		String cmd = request.getParameter("cmd");
		String title = request.getParameter("title");
		String start = request.getParameter("start");
		String end = request.getParameter("end");

		EmpDAO dao = new EmpDAO();

		if (cmd.equals("insert")) {
			CalendarVO vo = new CalendarVO();
			vo.setTitle(title);
			vo.setStartDate(start);
			vo.setEndDate(end);
			if (dao.insertSchedule(vo)) {
				response.getWriter().print("{\"retCode\": \"Success\"}");
			} else {
				response.getWriter().print("{\"retCode\": \"Fail\"}");
			}

		} else if (cmd.equals("delete")) {
			String delTitle = request.getParameter("title");

			if (dao.deleteSchedule(delTitle)) {
				response.getWriter().print("{\"retCode\": \"Success\"}");
			} else {
				response.getWriter().print("{\"retCode\": \"Fail\"}");
			}
		}

	}

}
