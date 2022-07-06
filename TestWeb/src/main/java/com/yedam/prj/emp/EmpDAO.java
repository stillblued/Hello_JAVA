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
				vo.setLastName(rs.getString("last_name"));

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
	public EmpVO selectOne(String empId) {
		EmpVO vo = new EmpVO();

		try {
			getConnect();
			String sql = "select * from employees where employee_id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, empId);
			rs = psmt.executeQuery();

			if (rs.next()) {

				vo.setEmpId(rs.getString("employee_id"));
				vo.setLastName(rs.getString("last_name"));
				vo.setDepartmentId(rs.getString("department_id"));
				vo.setEmail(rs.getString("email"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setManagerId(rs.getString("manager_id"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
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

		return cnt;
	}

	// 삭제

}
