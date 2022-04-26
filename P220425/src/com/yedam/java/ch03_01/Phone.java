package com.yedam.java.ch03_01;

public abstract class Phone {

	// 필드
	public String owner;

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 일반 메소드 (모든 클래스가 가져야할 메소드 정의 가능)
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
