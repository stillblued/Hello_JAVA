package com.yedam.java.ch10_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassExample {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strDate = sdf.format(date);
		System.out.println(strDate);

	}

}
