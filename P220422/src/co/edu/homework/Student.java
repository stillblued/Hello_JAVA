package co.edu.homework;

public class Student {

	// 학생 관리 프로그램 구현.
	// 관리 해야 할 학생 수 입력 후 학생 수만큼 정보 입력.
	// 학생 정보 : 학번, 이름, 국어, 수학, 영어.
	// 학번 입력시, 학생의 기본 정보 및 평균 출력.
	// getter, setter 사용.

	// 추가 문제, 학번 입력시 추가적으로 평균으로 등수 출력 가능.
	// 조건1) 클래스 이용하여 등록.
	// 조건2) 클래스 학생 기본 정보 및 평균을 출력하는 메소드 사용.

	private int number;
	private String name;
	private int kor;
	private int math;
	private int eng;

	public Student() {

	}

	public Student(int number, String name, int kor, int math, int eng) {
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public int getNumber() {
		if (number < 0) {
			number = 0;
		}
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		if (kor < 0) {
			kor = 0;
		}
		if (kor > 100) {
			kor = 100;
		}
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		if (math < 0) {
			math = 0;
		}
		if (math > 100) {
			math = 100;
		}
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		if (eng < 0) {
			eng = 0;
		}
		if (eng > 100) {
			eng = 100;
		}
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public double avg() {
		return (kor + math + eng) / 3;
	}

	public void getInfo() {
		System.out.println("학번 : " + getNumber());
		System.out.println("이름 : " + getName());
		System.out.println("국어 : " + getKor());
		System.out.println("수학 : " + getMath());
		System.out.println("영어 : " + getEng());
		System.out.println("평균 : " + avg());

	}

}