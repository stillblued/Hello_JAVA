package com.yedam.java.homework1;

public class Main {

	public static void main(String[] args) {

		// Employee, EmpDept
		Employee emp = new EmpDept("이지나", 3000, "교육부");
		emp.getInformation();
		emp.print();

		System.out.println("============================");

		// Human, StandardWeightInfo, ObesityInfo
		Human hm = null;
		hm = new StandardWeightInfo("홍길동", 168, 45);
		hm.getInformation();
		hm = new ObesityInfo("박둘이", 168, 90);
		hm.getInformation();

		System.out.println("============================");

		// Culture, Movie, Performance
		Movie m = new Movie("추격자", 7, 5, "영화");
		
		m.setTotalScore(4);
		m.setTotalScore(4);
		m.setTotalScore(4);

		m.getInformation();

		Performance p = new Performance("지킬앤하이드", 9, 10, "공연");
		
		p.setTotalScore(5);
		p.setTotalScore(5);
		p.setTotalScore(4);
		p.setTotalScore(5);
		p.setTotalScore(5);
		p.setTotalScore(4);
		p.setTotalScore(5);
		p.setTotalScore(4);
		p.setTotalScore(5);
		p.setTotalScore(4);

		p.getInformation();
	}

}
