package com.yedam.java.ch04_03;

public class E {

	// 필드
	// 인스턴스 필드
	F f = new F();
	G g = new G();
	// 정적 필드
	// static F f1 = new F();
	static G g1 = new G();

	// 생성자

	// 메소드
	// 인스턴스 메소드
	void method1() {
		F f1 = new F();
		G g1 = new G();
	}

	// 정적 메소드
	static void method2() {
		// F f2 = new F();
		G g2 = new G();
	}

	// 인스턴스 멤버 클래스
	class F {
	}

	// 정적 멤버 클래스
	static class G {
	}

}
