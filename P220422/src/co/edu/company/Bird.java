package co.edu.company;

public class Bird extends Animal {

	void fly() {
		System.out.println("날 수 있음");
	}

	@Override
	void walk() {
		System.out.println("헤엄을 칠 수 있음");
	}

}
