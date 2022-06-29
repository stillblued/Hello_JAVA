package co.edu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.member.MemberVO;

public class EmpDAO extends DAO {

	// 입력기능
	public boolean insertSchedule(CalendarVO vo) {
		getConnect();
		String sql = "insert into full_calendar (title, start_date, end_date) values(?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getStartDate());
			psmt.setString(3, vo.getEndDate());
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

	// 삭제기능
	public boolean deleteSchedule(String title, String start, String end) {
		getConnect();
		String sql = "delete from full_calendar where title =? and start_date =? and end_date=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, start);
			psmt.setString(3, end);

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

	// 일정정보
	public List<CalendarVO> getSchedule() {
		getConnect();
		List<CalendarVO> list = new ArrayList<>();

		try {
			psmt = conn.prepareStatement("select * from full_calendar order by start_date");
			rs = psmt.executeQuery();

			while (rs.next()) {
				CalendarVO cal = new CalendarVO();
				cal.setTitle(rs.getString("title"));
				cal.setStartDate(rs.getString("start_date"));
				cal.setEndDate(rs.getString("end_date"));
				list.add(cal);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}
		;
		return list;
	}

	// 부서정보, 인원정보

	public Map<String, Integer> getDeptCnt() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		getConnect();
		String sql = "select department_name, count(1) "// 공백
				+ "from employees e, departments d " + "where e.department_id = d.department_id "
				+ "group by department_name";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return map;
	}

	public void insertEmp(Employees emp) {
		getConnect();
		String sql = "insert into employees (employee_id, last_name, email, job_id, hire_date) "
				+ "values(employees_seq.nextval,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getLastName());
			psmt.setString(2, emp.getEmail());
			psmt.setString(3, emp.getJobId());
			psmt.setString(4, emp.getHireDate());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	};

	public List<String> getNames() {
		getConnect();
		String sql = "select last_name from employees";
		List<String> list = new ArrayList<>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("last_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	};

	public List<Employees> empList() {
		getConnect();
		String sql = "select * from employees";
		List<Employees> list = new ArrayList<>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Employees emp = new Employees();
				emp.setEmail(rs.getString("email"));
				emp.setEmpId(rs.getInt("employee_id"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getNString("job_id"));
				emp.setLastName(rs.getNString("last_name"));

				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

}
