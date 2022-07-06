package com.yedam.prj.emp;

import java.sql.ResultSet;
import java.util.ArrayList;
import com.yedam.prj.comm.DAO;

public class EmpDAO extends DAO {

	// job 조회
	public ArrayList<JobsVO> selectJobs() {
		ArrayList<JobsVO> list = new ArrayList<JobsVO>();
		try {
			getConnect();
			String sql = "select * from jobs order by job_id";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {

				JobsVO vo = new JobsVO();
				vo.setJobId(rs.getString("job_id"));
				vo.setJobTitle(rs.getString("job_title"));
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 전체 조회
	public ArrayList<EmpVO> selectAll(String deptId) {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		try {
			getConnect();
			String sql = "select * from employees ";

			if (deptId != null && !deptId.isEmpty()) {
				sql += " where department_id = ?";
			}
			sql += " order by employee_id";

			psmt = conn.prepareStatement(sql);

			if (deptId != null && !deptId.isEmpty()) {
				psmt.setString(1, deptId);
			}

			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpId(rs.getString("employee_id"));
				vo.setLastName(rs.getString("first_name"));

				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 단건 조회
	public EmpVO selectOne(String id) {
		EmpVO vo = new EmpVO();
		return vo;
	}

	// 등록
	public int insert(EmpVO vo) {
		int cnt = 0;
		try {
			getConnect();
			String sql = "insert into employees (employee_id, last_name, email, hire_date, job_id) values (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getEmpId());
			psmt.setString(2, vo.getLastName());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getHireDate());
			psmt.setString(5, vo.getJobId());
			cnt = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return cnt;
	}

	// 수정
	public int update(EmpVO vo) {
		int cnt = 0;
		try {
			getConnect();
			String sql = "update employees set (employee_id =? , last_name=?, email= ?, hire_date=?, job_id=?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getEmpId());
			psmt.setString(2, vo.getLastName());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getHireDate());
			psmt.setString(5, vo.getJobId());
			cnt = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return cnt;
	}
	
	

	// 삭제

}
