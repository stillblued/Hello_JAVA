package co.edu.oop;

public class Person {
	int ssn;
	String name;
	String address;
	int age;

	public Person() {

	}

	public Person(int ssn, String name, String address, int age) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("Person[ name : " + name + " age : " + age + "]");
	}
	
	
}
