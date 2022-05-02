package com.yedam.java.ch09_01;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {

		// String 생성자 : byte 타입 -> String 타입 디코딩
		// getBytes 메소드 : String 타입 -> byte 타입 인코딩

		String str = "안녕하세요";
		byte[] strBytes1 = str.getBytes();
		System.out.println(strBytes1);
		String str1 = new String(strBytes1);
		System.out.println(str1);

		try {
			byte[] strBytes2 = str.getBytes("EUC-KR");
			System.out.println("strBytes2의 길이 " + strBytes2.length);
			String str2 = new String(strBytes2, "EUC-KR");
			System.out.println("strBytes2 -> String : " + str2);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();

		}

	}

}
