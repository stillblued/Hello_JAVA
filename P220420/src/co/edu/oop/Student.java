package co.edu.oop;

public class Student {
	
	// 필드 : 상관X -> 학생들의 정보 구성요소
	String name;
	int age;
	int kor;
	int eng;
	int math;

	// 생성자 : 필수 -> 클래스 명과 같아야함. 객체를 만들기 위해 필요한 구문
	public Student() {

	}

	// 메소드 : 상관X -> 함수, 기능
	void getInFo() {
		System.out.println("학생의 이름 : " + name + "\n나이 : " + age);
	}
}
