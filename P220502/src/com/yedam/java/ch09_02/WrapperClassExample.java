package com.yedam.java.ch09_02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WrapperClassExample {
	public static void main(String[] args) {

		// Boxing
		Integer obj1 = Integer.valueOf(300);
		Integer obj2 = Integer.valueOf("300");

		// Unboxing
		int value1 = obj1.intValue();
		System.out.println(value1);

		// 자동 Boxing
		Integer obj = 100; // heap 영역에 새로운 객체 생성
		System.out.println("Value : " + obj.intValue());

		// 대입 시 자동 Unboxing
		int value = obj; // heap 영역의 객체 값을 복사
		System.out.println("value : " + value);

		// 연산시 자동 Unboxing
		int result = obj + 100; // ->100 + 100;
		System.out.println("result : " + result);

		// 포장 객체 비교
		System.out.println("[-128~127 범위 값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과 : " + (obj3 == obj4));
		System.out.println("언박싱 후 == 결과 : " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과 : " + obj3.equals(obj4));

		System.out.println("[-128~127 초과 값일 경우]");
		Integer obj5 = 300;
		Integer obj6 = 300;
		System.out.println("==결과 : " + (obj5 == obj6));
		System.out.println("언박싱 후 == 결과 : " + (obj5.intValue() == obj6.intValue()));
		System.out.println("equals() 결과 : " + obj5.equals(obj6));

	}

}
