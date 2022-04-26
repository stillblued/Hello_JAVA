package com.yedam.java.homework;

public class Main1 {

	public static void main(String[] args) {

		// Question 1] Keypad, RPGgame, ArcadeGame
		RPGgame game1 = new RPGgame();
		game1.leftUpButton();
		game1.rightUpButton();
		game1.changeMode();
		game1.rightUpButton();
		game1.rightDownButton();
		game1.leftDownButton();
		game1.changeMode();
		game1.rightDownButton();
		System.out.println("======================");
		ArcadeGame game2 = new ArcadeGame();
		game2.leftUpButton();
		game2.rightUpButton();
		game2.leftDownButton();
		game2.changeMode();
		game2.rightUpButton();
		game2.leftUpButton();
		game2.rightDownButton();

	}
}
