package com.yedam.java.ch08_01;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {

//		Class clazz = Member.class;
//		Class clazz = Class.forName("com.yedam.java.ch08_01.Member");
		Member member = new Member("blue");
		Class clazz = member.getClass();

		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());

		String textPath = clazz.getResource("Info.txt").getPath();
		System.out.println(textPath);

	}

}
