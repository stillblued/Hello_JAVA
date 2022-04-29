package com.yedam.java.ch07_01;

public class BoxingMethodExample {

	public static void main(String[] args) {

		Box<Integer> box = Util.<Integer>boxing(100);
		int intValue = box.getT();

		Box<String> strbox = Util.<String>boxing("홍길동");
		String strValue = strbox.getT();

	}

}
