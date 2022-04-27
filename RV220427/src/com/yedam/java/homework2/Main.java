package com.yedam.java.homework2;

import java.util.Scanner;

public class Main {

	public static Keypad change() {
		Keypad game = null;
		int random = (int) (Math.random() * 2 + 1);
		switch (random) {
		case 1:
			game = new RPGgame();
			break;
		case 2:
			game = new ArcadeGame();
			break;
		}
		return game;
	}

	public static void main(String[] args) {

		// Keypad, RPGgame, ArcadeGame
		RPGgame g1 = new RPGgame();
		g1.leftUpButton();
		g1.rightUpButton();
		g1.changeMode();
		g1.rightUpButton();
		g1.rightDownButton();
		g1.leftDownButton();
		g1.changeMode();
		g1.rightDownButton();
		System.out.println("=====================");
		ArcadeGame g2 = new ArcadeGame();
		g2.leftUpButton();
		g2.rightUpButton();
		g2.leftDownButton();
		g2.changeMode();
		g2.rightUpButton();
		g2.leftUpButton();
		g2.rightDownButton();

		System.out.println("------------------------------------------");
		// Notebook, Tablet, PortableNotebook
		PortableNotebook pn = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		pn.writeDocumentaion();
		pn.watchVideo();
		pn.changeMode();
		pn.useApp();
		pn.searchInternet();

		System.out.println("------------------------------------------");
		// 랜덤 게임
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Keypad game = change();

		while (run) {
			System.out.println(
					"============================================================================================");
			System.out.println(
					"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println(
					"============================================================================================");
			System.out.print("choice>>");
			int number = Integer.parseInt(sc.nextLine());
			switch (number) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.rightUpButton();
				break;
			case 4:
				game.rightDownButton();
				break;
			case 5:
				game.changeMode();
				break;
			case 0:
				game = change();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				run = false;
				break;
			default:
				System.out.println("잘못 선택하였습니다.");
			}
		}

	}

}
