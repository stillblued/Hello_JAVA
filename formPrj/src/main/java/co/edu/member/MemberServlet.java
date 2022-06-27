package co.edu.member;

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

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 응답정보에 한글처리.
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");

		String cmd = request.getParameter("cmd");
		Gson gson = new GsonBuilder().create(); // json 데이터 생성.
		MemberDAO dao = new MemberDAO();

		if (cmd.equals("list")) {
			// 전체 리스트 => json 화면 보여주기.
			List<MemberVO> list = dao.memberList();
			response.getWriter().print(gson.toJson(list));

		} else if (cmd.equals("insert")) {
			String name = request.getParameter("name");
			String addr = request.getParameter("addr");

			MemberVO vo = new MemberVO();
			vo.setMembName(name);
			vo.setMembAddr(addr);
			dao.insertMember(vo);
			response.getWriter().print(gson.toJson(vo));

		} else if (cmd.equals("update")) {
			// 19 - 전화번호.
			String numb = request.getParameter("no");
			String phone = request.getParameter("ph");

			MemberVO vo = new MemberVO();
			vo.setMembNo(Integer.parseInt(numb)); // "19"
			vo.setMembPhone(phone);

			if (dao.updateMember(vo)) {
				// {"retCode": "Success"}
				response.getWriter().print("{\"retCode\": \"Success\"}");
			} else {
				// {"retCode": "Fail"}
				response.getWriter().print("{\"retCode\": \"Fail\"}");
			}

		} else if (cmd.equals("delete")) {
			String delNo = request.getParameter("delNo");

			if (dao.deleteMember(Integer.parseInt(delNo))) {
				response.getWriter().print("{\"retCode\": \"Success\"}");
			} else {
				// {"retCode": "Fail"}
				response.getWriter().print("{\"retCode\": \"Fail\"}");
			}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		request.setCharacterEncoding("utf-8");

		// 입력 수정 삭제
		String cmd = request.getParameter("cmd");

		String membName = request.getParameter("name");
		String membAddr = request.getParameter("address");
		String membPhone = request.getParameter("phone");
		String membBirth = request.getParameter("birth");
		String membImg = request.getParameter("image");
		MemberVO vo = new MemberVO();
		vo.setMembBirth(membBirth);
		vo.setMembAddr(membAddr);
		vo.setMembImage(membImg);
		vo.setMembName(membName);
		vo.setMembPhone(membPhone);
		MemberDAO dao = new MemberDAO();
		Gson gson = new GsonBuilder().create();
		PrintWriter out = response.getWriter();

		if (cmd.equals("add")) {
			dao.insertMember(vo);
			out.print(gson.toJson(vo));

		} else if (cmd.equals("modify")) {
			String mNo = request.getParameter("memNo");
			vo.setMembNo(Integer.parseInt(mNo));

			if (dao.updateMember(vo)) {
				// out.print("{\"retCode\": \"Success\"}");
				out.print("{\"membNo\": \"" + mNo + "\", \"membName\":\"" + membName + "\", \"membAddr\": \"" + membAddr
						+ "\", \"membPhone\": \"" + membPhone + "\", \"membBirth\" : \"" + membBirth
						+ "\", \"retCode\":\"Success\"}");
			} else {
				out.print("{\"retCode\": \"Fail\"}");
			}
			;

		} else if (cmd.equals("remove")) {
			String delNo = request.getParameter("delNo");
			if (dao.deleteMember(Integer.parseInt(delNo))) {
				out.print("{\"retCode\": \"Success\"}");
			} else {
				out.print("{\"retCode\": \"Fail\"}");
			}
			;

		}
		;

	}

}