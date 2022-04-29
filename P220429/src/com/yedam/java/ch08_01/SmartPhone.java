package com.yedam.java.ch08_01;

public class SmartPhone {

	private String company;
	private String os;

	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}

}
