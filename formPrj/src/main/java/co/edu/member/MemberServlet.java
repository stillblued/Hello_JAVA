package co.edu.member;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 응답 정보 한글처리
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");

		String cmd = request.getParameter("cmd");
		Gson gson = new GsonBuilder().create(); // JSON 데이터 생성
		MemberDAO dao = new MemberDAO();

		if (cmd.equals("list")) {
			// 전체 리스트 => JSON 화면 보여주기
			List<MemberVO> list = dao.memberList();
			response.getWriter().print(gson.toJson(list));

		} else if (cmd.equals("insert")) {
			String name = request.getParameter("name");
			String addr = request.getParameter("addr");
			String phone = request.getParameter("phone");
			String birth = request.getParameter("birth");
			String image = request.getParameter("image");

			MemberVO vo = new MemberVO();
			vo.setMembName(name);
			vo.setMembAddr(addr);
			vo.setMembPhone(phone);
			vo.setMembBirth(birth);
			vo.setMembImage(image);

			dao.insertMember(vo);
			// {"retCode":"Success"}
			response.getWriter().print(gson.toJson(vo));

		} else if (cmd.equals("update")) {
			// 19 - 전화번호

			String numb = request.getParameter("no");
			String name = request.getParameter("nm");
			String phone = request.getParameter("ph");
			String addr = request.getParameter("ad");
			String birth = request.getParameter("bt");
			String image = request.getParameter("ig");

			MemberVO vo = new MemberVO();
			vo.setMembNo(Integer.parseInt(numb));
			vo.setMembName(name);
			vo.setMembPhone(phone);
			vo.setMembAddr(addr);
			vo.setMembBirth(birth);
			vo.setMembImage(image);

			if (dao.updateMember(vo)) {
				// {"retCode":"Success"}
				response.getWriter().print("{\"retCode\": \"Success\"}");
			} else {
				// {"retCode":"Fail"}
				response.getWriter().print("{\"retCode\":\"Fail\"}");
			}

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
