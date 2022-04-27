package com.yedam.java.homework;

public class ArcadeGame implements Keypad {

	private int mode;

	public ArcadeGame() {
		this.mode = Keypad.NORMAL_MODE;
		System.out.println("☞ ArcadeGame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("예담이 앞쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("예담이 뒤쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if (this.mode == Keypad.NORMAL_MODE) {
			System.out.println("예담의 일반 공격.");
		}
		if (this.mode == Keypad.HARD_MODE) {
			System.out.println("예담의 Double Hit!");
		}
	}

	@Override
	public void rightDownButton() {
		if (this.mode == Keypad.NORMAL_MODE) {
			System.out.println("예담의 Critical hit!!");
		}
		if (this.mode == Keypad.HARD_MODE) {
			System.out.println("예담의 Double Critical Hit!!");
		}
	}

	@Override
	public void changeMode() {
		if (this.mode == Keypad.NORMAL_MODE) {
			this.mode = Keypad.HARD_MODE;
			System.out.println("※HARD MODE※");
		} else if (this.mode == Keypad.HARD_MODE) {
			this.mode = Keypad.NORMAL_MODE;
			System.out.println("※NORMAL MODE※");
		} else {
			System.out.println("모드 변경 실패.");
		}
	}
}
