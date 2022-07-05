package com.yedam.prj.dept;

import java.sql.ResultSet;
import java.util.ArrayList;
import com.yedam.prj.comm.DAO;


public class DeptDAO extends DAO {

	// 조회
	public ArrayList<DeptVO> selectAll() {
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		try {
			getConnect();
			String sql = "select * from departments";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				DeptVO vo = new DeptVO();
				vo.setDeptId(rs.getString("department_id"));
				vo.setDeptName(rs.getString("department_name"));
				vo.setManagerId(rs.getString("manager_id"));
				vo.setLocationId(rs.getString("location_id"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

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
