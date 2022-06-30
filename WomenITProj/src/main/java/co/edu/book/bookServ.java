package co.edu.book;

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

@WebServlet("/bookServ")
public class bookServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public bookServ() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		// 조회
		String cmd = request.getParameter("cmd");
		Gson gson = new GsonBuilder().create();
		bookDAO dao = new bookDAO();
		if (cmd.equals("list")) {
			List<bookVO> list = dao.bookList();
			response.getWriter().print(gson.toJson(list));
		} 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		// 입력 삭제
		String cmd = request.getParameter("cmd");
		String bookCode = request.getParameter("code");
		String bookName = request.getParameter("name");
		String bookAuth = request.getParameter("auth");
		String bookPres = request.getParameter("pres");
		String bookAmt = request.getParameter("amt");
		bookVO vo = new bookVO();
		vo.setBookCode(bookCode);
		vo.setBookName(bookName);
		vo.setBookWriter(bookAuth);
		vo.setBookPublisher(bookPres);
		vo.setBookPrice(bookAmt != null ? Integer.parseInt(bookAmt) : 0);

		bookDAO dao = new bookDAO();
		Gson gson = new GsonBuilder().create();
		PrintWriter out = response.getWriter();

		if (cmd.equals("insert")) {
			dao.insertBook(vo);
			out.print(gson.toJson(vo));

		} else if (cmd.equals("delete")) {
			String delCode = request.getParameter("delCode");
			System.out.println(delCode);
			if (dao.deleteBook(delCode)) {
				out.print("{\"retCode\": \"Success\"}");
			} else {
				out.print("{\"retCode\": \"Fail\"}");
			}
			;
		}
		;
	}
}
