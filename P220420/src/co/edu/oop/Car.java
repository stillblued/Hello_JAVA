package co.edu.oop;

public class Car {
	
	// 필드
	int tire;
	String color;
	String model;
	int price;

	// 생성자
	public Car() {

	}

	public Car(String a, String b, int c) { // 매개 변수?
		model = a;
		color = b;
		price = c;
	}

	// 메소드(기능)
	void info() {
		System.out.println("model = " + model);
		System.out.println("color = " + color);
		System.out.println("price = " + price);
	}
}
