package com.yedam.minijava;

public abstract class Customer {

	public static Customer getType(int level) { // 레벨에 따라 타입 변경
		Customer custom = null;
		switch (level) {
		case 1:
			custom = new level1();
			break;
		case 2:
			custom = new level2();
			break;
		case 3:
			custom = new level3();
			break;
		case 4:
			custom = new level4();
			break;
		case 5:
			custom = new level5();
			break;

		}
		return custom;

	}

	public abstract int getRandom(); // 랜덤 인덱스

	public abstract String getCustomer(int number); // 랜덤 손님 출력

}