package co.edu.member;

public class Person {

	final String nation = "Korean";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	public void info() {
		System.out.println(nation + ", " + ssn);
	}

}
