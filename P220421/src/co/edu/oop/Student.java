package co.edu.oop;

public class Student {
	
	int stuNo;
	String name;
	int kor;
	int math;
	int eng;

	public Student() {

	}

	void info() {
		System.out.println(
				"학번 : " + stuNo + "|이름 : " + name + "|국어 점수 : " + kor + "|수학 점수 : " + math + "|영어 점수 : " + eng);
	}

	void avg() {
		int result = (kor + math + eng) / 3;
		System.out.println("평균 점수 : " + result);
		return;
	}

}
