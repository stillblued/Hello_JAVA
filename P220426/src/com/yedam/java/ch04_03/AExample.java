package com.yedam.java.ch04_03;

public class AExample {

	public static void main(String[] args) {

		A a = new A();
		A tempA = new A();

		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		A.B tempB = tempA.new B();

		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		A.C.field2 = 0;

		// 로컬 클래스 객체 생성
		a.method();
	}

}
