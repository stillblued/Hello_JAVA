package com.yedam.prj220504.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.yedam.prj220504.dto.StudentVO;

public class StudentService {
	private StudentVO student;
	private List<StudentVO> students = new ArrayList<StudentVO>();

	private void dataSet() {
		student = new StudentVO("lee", "이기자", "컴퓨터공학", "대구광역시", "010-1111-1111", Date.valueOf("2000-01-01"));
		students.add(student);
		student = new StudentVO("park", "박승리", "컴퓨터공학", "대구광역시", "010-2222-1111", Date.valueOf("2000-02-01"));
		students.add(student);
		student = new StudentVO("kim", "김치국", "컴퓨터공학", "대구광역시", "010-3333-1111", Date.valueOf("2000-03-01"));
		students.add(student);
		student = new StudentVO("hong", "홍길동", "컴퓨터공학", "대구광역시", "010-4444-1111", Date.valueOf("2000-04-01"));
		students.add(student);
	}

	public void selectList() { // 학생목록 보기
		dataSet();
		for (StudentVO vo : students) {
			vo.toString();
		}
	}

	public void selectStudent(String id) {
		dataSet();
		for (StudentVO vo : students) {
			if (vo.getId().equals(id)) {
				System.out.println("검색한 학생 ===");
				vo.toString();
				break;
			}
		}
	}

	public void insertStudent(StudentVO vo) {
		dataSet();
		students.add(vo);
		for (StudentVO s : students) {
			s.toString();
		}
	}
}
