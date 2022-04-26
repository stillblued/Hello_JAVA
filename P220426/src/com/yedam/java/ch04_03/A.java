package com.yedam.java.ch04_03;

public class A { // 바깥 클래스

	A() {
		System.out.println("A 인스턴스가 생성됨.");
	}

	// 인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("B 인스턴스가 생성됨.");
		}

		// 필드
		int field1;
		// static int field2;

		// 메소드
		void method1() {
		}
		// static void method2() {}
	}

	// 정적 멤버 클래스
	static class C {
		C() {
			System.out.println("C 인스턴스가 생성됨.");
		}

		// 필드
		int field1;
		static int field2;

		// 메소드
		void method1() {
		}

		static void method2() {
		}

	}

	void method() {

		// 로컬 클래스
		class D {
			D() {
				System.out.println("D 인스턴스가 생성됨.");
			}

			// 필드
			int field1;
			// static int field2;

			// 메소드
			void method1() {
			}
			// static void method2() {}

			D d = new D();
		}
	}

}
