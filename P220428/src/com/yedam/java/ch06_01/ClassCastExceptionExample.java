package com.yedam.java.ch06_01;

public class ClassCastExceptionExample {

	public static void main(String[] args) {

		changeDog(new Dog());
		changeDog(new Cat());

	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}

}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
