package com.yedam.java.ch05_01;

public class AnonymousClassExample {

	public static void main(String[] args) {

		AnonymousClass ac = new AnonymousClass();
		// 익명 객체 필드로 사용
		ac.rc.turnOn();
		System.out.println();

		// 익명 객체 로컬 변수로 사용
		ac.method1();
		System.out.println();

		// 익명 객체 매개 변수로 사용
		ac.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		});

	}

}
