package co.edu.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class bookDAO extends DAO {

//리스트
	public List<bookVO> bookList() {
		getConnect();
		List<bookVO> list = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from book order by book_code");
			rs = psmt.executeQuery();
			while (rs.next()) {
				bookVO bk = new bookVO();
				bk.setBookCode(rs.getString("book_code"));
				bk.setBookName(rs.getString("book_name"));
				bk.setBookWriter(rs.getString("book_auth"));
				bk.setBookPublisher(rs.getString("book_pres"));
				bk.setBookPrice(rs.getInt("book_amt"));
				list.add(bk);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

//추가
	public bookVO insertBook(bookVO vo) {
		getConnect();
		String sql = "insert into book (book_code, book_name, book_auth, book_pres, book_amt) values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBookCode());
			psmt.setString(2, vo.getBookName());
			psmt.setString(3, vo.getBookWriter());
			psmt.setString(4, vo.getBookPublisher());
			psmt.setInt(5, vo.getBookPrice());
			int r = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}

// 삭제 
	public boolean deleteBook(String delCode) {
		getConnect();
		String sql = "delete from book where book_code =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, delCode);

			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
			;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

}
