package com.yedam.java.ch04_02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();

		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
