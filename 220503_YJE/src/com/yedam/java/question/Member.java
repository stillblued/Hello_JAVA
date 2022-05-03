package com.yedam.java.question;

public abstract class Member {

	static int GRADE_STANDARD = 1000000;
	static int record;
	static String grade;

	public Member(int record) {
		this.record = record;
	}

	public static void showMemberInfo() {
		System.out.printf("현재 실적은 %d이며, 회원등급은 %s입니다.\n", record, grade);
	}

	public static Member getMemberShip(int record) {
		Member member = null;
		if (record >= GRADE_STANDARD) {
			member = new Gold(record);
			grade = "GOLD";
		} else {
			member = new Silver(record);
			grade = "SILVER";
		}
		return member;

	}

}
