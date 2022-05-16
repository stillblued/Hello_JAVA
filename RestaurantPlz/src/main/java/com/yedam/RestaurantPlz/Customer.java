package com.yedam.RestaurantPlz;

public abstract class Customer {

	public static Customer getType(int lv) { // 레벨에 따라 타입 변경
		Customer custom = null;
		switch (lv) {
		case 1:
			custom = new Level1();
			break;
		case 2:
			custom = new Level2();
			break;
		case 3:
			custom = new Level3();
			break;
		case 4:
			custom = new Level4();
			break;
		case 5:
			custom = new Level5();
			break;
		}
		return custom;
	}

	

	public abstract int getRandom(); // 랜덤 인덱스

	public abstract String getCustomer(int number); // 손님 출력

}
