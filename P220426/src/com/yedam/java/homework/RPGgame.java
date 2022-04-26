package com.yedam.java.homework;

public class RPGgame implements Keypad {

	private int mode;

	public RPGgame() {
		this.mode = Keypad.NORMAL_MODE;
		System.out.println("☞ RPGgame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("예담이 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("예담이 아래쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if (mode == NORMAL_MODE) {
			System.out.println("예담이 Jump한다.");
		}
		if (mode == HARD_MODE) {
			System.out.println("예담이 Super Jump한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if (mode == NORMAL_MODE) {
			System.out.println("예담의 일반 공격.");
		}
		if (mode == HARD_MODE) {
			System.out.println("예담의 Critical hit!!");
		}
	}

	@Override
	public void changeMode() {
		if (mode == NORMAL_MODE) {
			mode = HARD_MODE;
			System.out.println("※HARD MODE※");
		} else if (mode == HARD_MODE) {
			mode = NORMAL_MODE;
			System.out.println("※NORMAL MODE※");
		} else {
			System.out.println("모드 변경 실패.");
		}
	}

}
