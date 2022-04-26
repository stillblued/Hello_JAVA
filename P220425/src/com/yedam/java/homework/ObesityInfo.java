package com.yedam.java.homework;

public class ObesityInfo extends StandardWeightInfo {

	public ObesityInfo() {

	}

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		System.out.print("이름 : " + name + " | 키 : " + height + " | 체중 : " + weight);
		if (getObesity() < 90) {
			System.out.println(" | 저체중입니다.");
		} else if (getObesity() > 120) {
			System.out.println(" | 비만입니다.");
		} else {
			System.out.println(" | 정상체중입니다.");
		}
		;
	}

	public double getObesity() {
		return (weight / getStandardWeight()) * 100; // ( * 비만도 : 체중/표준체중 * 100 )

	}

}
