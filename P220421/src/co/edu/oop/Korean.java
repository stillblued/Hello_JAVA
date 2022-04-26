package co.edu.oop;

public class Korean {

	String nation = "대한민국";
	String name;
	String ssn;

	public Korean(String n, String s) {
		this.name = n;
		this.ssn = s;
	}

	public Korean(String n, String s, String p) {
		this.nation = n;
		this.name = s;
		this.ssn = p;
	}

	void getInfo() {
		System.out.println("국적 : " + nation);
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + ssn);
	}

}
