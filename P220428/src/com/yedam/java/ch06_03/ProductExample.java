package com.yedam.java.ch06_03;

public class ProductExample {

	public static void main(String[] args) {

		Product<TV, String> product1 = new Product<TV, String>();
		product1.setT(new TV());
		product1.setM("스마트TV");

		TV tv = product1.getT();
		String tvMode1 = product1.getM();

	}

}
