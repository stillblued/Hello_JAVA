package co.edu.member;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.DAO;

public class MemberDAO extends DAO {

	// 전체조회
	public List<MemberVO> memberList() {
		getConnect();
		List<MemberVO> list = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from member order by memb_no");
			rs = psmt.executeQuery(); // 조회:executeQuery, 추가수정삭제: execteUpdate
			while (rs.next()) {
				MemberVO mem = new MemberVO();
				mem.setMembNo(rs.getInt("memb_no"));
				mem.setMembName(rs.getString("memb_name"));
				mem.setMembPhone(rs.getString("memb_phone"));
				mem.setMembAddr(rs.getString("memb_addr"));
				mem.setMembBirth(rs.getString("memb_birth"));
				mem.setMembImage(rs.getString("memb_image"));
				list.add(mem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 입력 (MemberVO) 셋인덱스는 1부터 시작 쿼리 안에는 세미콜론X
	public MemberVO insertMember(MemberVO vo) {
		getConnect();
		String sql = "insert into member (memb_no, memb_name, memb_phone, memb_addr, memb_birth, memb_image) values(?,?,?,?,?,?)";
		String seqSql = "select memb_seq.nextval from dual";
		try {
			// 시퀀스
			int nextSeq = 0;
			psmt = conn.prepareStatement(seqSql);
			rs = psmt.executeQuery();
			if (rs.next()) {
				nextSeq = rs.getInt(1);
			}

			// 입력 처리
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, nextSeq);
			psmt.setString(2, vo.getMembName());
			psmt.setString(3, vo.getMembPhone());
			psmt.setString(4, vo.getMembAddr());
			psmt.setString(5, vo.getMembBirth());
			psmt.setString(6, vo.getMembImage());

			vo.setMembNo(nextSeq);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return vo;
	}

	// 수정 (MemberVO)
	public boolean updateMember(MemberVO vo) {
		getConnect();
		String sql = "update member set memb_name= ?, memb_phone =? , memb_addr =?, memb_birth = ? , memb_image =? where memb_no =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getMembName());
			psmt.setString(2, vo.getMembPhone());
			psmt.setString(3, vo.getMembAddr());
			psmt.setString(4, vo.getMembBirth());
			psmt.setString(5, vo.getMembImage());
			psmt.setInt(6, vo.getMembNo());

			int r = psmt.executeUpdate(); // 수정된건수
			if (r > 0) {
				return true; // 정상적 변경
			}
			;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		;
		return false;
	}

	// 삭제 (memb_no)
	public boolean deleteMember(int membNo) {
		getConnect();
		String sql = "delete from member where memb_no =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, membNo);

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

	// 조건조회 (memb_no)
	public MemberVO searchMember(int membNo) {
		getConnect();
		MemberVO mem = null;
		try {
			psmt = conn.prepareStatement("select * from member where memb_no =? order by memb_no");
			psmt.setInt(1, membNo);
			rs = psmt.executeQuery();

			while (rs.next()) {
				mem = new MemberVO();
				mem.setMembNo(rs.getInt("memb_no"));
				mem.setMembName(rs.getString("memb_name"));
				mem.setMembPhone(rs.getNString("memb_phone"));
				mem.setMembAddr(rs.getString("memb_addr"));
				mem.setMembBirth(rs.getNString("memb_birth"));
				mem.setMembImage(rs.getNString("memb_image"));
			}
			;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return mem;
	}

}
