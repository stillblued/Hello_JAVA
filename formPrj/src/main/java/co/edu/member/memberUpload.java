package co.edu.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet({ "/memberUpload", "/fileUpload" })
public class memberUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public memberUpload() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// new MultipartRequest(request 요청정보, 파일이름, 파일사이즈, 인코딩타입, 리네임정책 );
		String file = request.getServletContext().getRealPath("images");
		int fileSize = 5 * 1023 * 1024; // 5메가
		new MultipartRequest(request, file, fileSize, "utf-8", new DefaultFileRenamePolicy());
	}

}
