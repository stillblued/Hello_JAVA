package com.yedam.java.ch08_01;

public class MemberExample {
	public static void main(String[] args) {

		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");

		if (m1.equals(m2)) { // 오버라이드로 == 와 연산결과 달라짐
			System.out.println("m1와 m2은 동등합니다.");
		} else {
			System.out.println("m1와 m2은 동등하지 않습니다");
		}

		if (m1.equals(m3)) {
			System.out.println("m1와 m3은 동등합니다.");
		} else {
			System.out.println("m1와 m3은 동등하지 않습니다");
		}

	}

}
