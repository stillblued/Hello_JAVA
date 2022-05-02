package com.yedam.java.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework {

	List<String> list = new ArrayList<String>();
	List<String> input = new ArrayList<String>();
	int select;
	String answer;

	public Homework() {
	}

	public void menu() {
		System.out.println("================================================");
		System.out.println("1. 문자하나 | 2. 단어 | 3. 입력내역 | 4. 새 게임 | 5. 종료");
		System.out.println("================================================");
	}

	public void select() {
		select = (int) (Math.random() * 4) + 1;
		if (select == 1) {
			answer = "orange";
			list.add("o");
			list.add("r");
			list.add("a");
			list.add("n");
			list.add("g");
			list.add("e");
		} else if (select == 2) {
			answer = "game";
			list.add("G");
			list.add("a");
			list.add("m");
			list.add("e");
		} else if (select == 3) {
			answer = "phone";
			list.add("p");
			list.add("h");
			list.add("o");
			list.add("n");
			list.add("e");
		} else if (select == 4) {
			answer = "smart";
			list.add("s");
			list.add("m");
			list.add("a");
			list.add("r");
			list.add("t");
		}
	}

	public void game() {
		select = (int) (Math.random() * 4) + 1;
		list = new ArrayList<String>();
		input = new ArrayList<String>();
	}

	public void print() {
		if (input.size() != 0) {
			System.out.print("현재까지 확인된 문자열의 문자들은 다음과 같습니다 >> ");
			for (int i = 0; i < input.size(); i++) {
				System.out.print(input.get(i) + " ");
			}
			System.out.println();
		} else {
			System.out.println("입력된 값이 없습니다.");
		}
	}

	public void correct(String input1) { // 구성 문자 맞는지+대소문자 ~?
	}

	public void check(String input2) { // 순서 길이 맞는지
	}
	// 갑자기 시험이 걱정되기 시작..해서 공부하러감..
}
