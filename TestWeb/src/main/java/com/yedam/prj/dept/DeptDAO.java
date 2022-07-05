package com.yedam.prj.dept;

import com.yedam.prj.comm.DAO;

public class DeptDAO extends DAO {

	// 조회

	// 단건조회

	// 등록
	public int deptInsert(DeptVO vo) {
		int cnt = 0;
		try {
			getConnect();
			String sql = "insert into departments (department_id, department_name) values (?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getDeptId());
			psmt.setString(2, vo.getDeptName());
			cnt = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return cnt;
	}

	// 수정

	// 삭제

}
