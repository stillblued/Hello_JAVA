package com.yedam.java.homework;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		// Question 3] 랜덤게임
		Scanner sc = new Scanner(System.in);
		RPGgame rg = null;
		ArcadeGame ag = null;

		int random = (int) (Math.random() * 2);

		if (random == 0) {
			ag = new ArcadeGame();
		} else if (random == 1) {
			rg = new RPGgame();
		}
		;

		while (true) {
			System.out.println(
					"============================================================================================");
			System.out.println(
					"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println(
					"============================================================================================");
			System.out.println("choice>> ");

			int choice = Integer.parseInt(sc.nextLine());
			if (random == 0 && choice == 1) {
				ag.leftUpButton();
			} else if (random == 0 && choice == 2) {
				ag.leftDownButton();
			} else if (random == 0 && choice == 3) {
				ag.rightUpButton();
			} else if (random == 0 && choice == 4) {
				ag.rightDownButton();
			} else if (random == 0 && choice == 5) {
				ag.changeMode();
			} else if (random == 0 && choice == 0) {
				random = 1;
				System.out.println("☞ RPGgame 실행");
			} else if (random == 0 && choice == 9) {
				System.out.println("☞ RPGgame 종료");
			} else {
				System.out.println("다시 입력해주세요.");
			}
			;

			if (random == 1 && choice == 1) {
				rg.leftUpButton();
			} else if (random == 1 && choice == 2) {
				rg.leftDownButton();
			} else if (random == 1 && choice == 3) {
				rg.rightUpButton();
			} else if (random == 1 && choice == 4) {
				rg.rightDownButton();
			} else if (random == 1 && choice == 5) {
				rg.changeMode();
			} else if (random == 1 && choice == 0) {
				random = 0;
				System.out.println("☞ ArcadeGame 실행");
			} else if (random == 1 && choice == 9) {
				System.out.println("☞ RPGgame 종료");
			} else {
				System.out.println("다시 입력해주세요.");
			}
			;

		}

	}

}