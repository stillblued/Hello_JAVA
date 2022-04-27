package com.yedam.java.homework;

public class Main {

	public static void main(String[] args) {

		// Question 1) Employee, EmpDept
		EmpDept em = new EmpDept("이지나", 3000, "교육부");
		em.getInformation();
		em.print();

		System.out.println("=======================================");

		// Question 2) Human, StandardWeightInfo, ObesityInfo
		Human hu = null;
		hu = new StandardWeightInfo("홍길동", 168, 45);
		hu = new ObesityInfo("박둘이", 168, 90);

		hu.getInformation();
		hu.getInformation();

		System.out.println("=======================================");

		// Question 3) Culture, Movie, Performance

		Movie movieInfo = new Movie("추격자", 7, 5, "영화");
		movieInfo.setTotalScore(4);
		movieInfo.setTotalScore(1);
		movieInfo.setTotalScore(2);
		movieInfo.setTotalScore(5);

		movieInfo.getInformation();
		System.out.println("================================");

		Performance performance = new Performance("지킬앤하이드", 9, 10, "공연");

		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(2);
		performance.setTotalScore(1);
		performance.setTotalScore(3);

		performance.getInformation();

	}

}
