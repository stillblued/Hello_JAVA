package com.yedam.java.ch03_01;

public class PhoneExample {

	public static void main(String[] args) {

		// Phone phone = new SmartPhone("홍길동");
		SmartPhone phone = new SmartPhone("홍길동");

		phone.turnOn();
		phone.internetSearch();
		phone.turnOff();

	}
}
