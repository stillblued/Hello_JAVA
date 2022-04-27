package com.yedam.java.homework1;

public class ObesityInfo extends StandardWeightInfo {

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %d, 몸무게 %d, ", this.name, this.height, this.weight);
		if (this.getObesity() < 18.5) {
			System.out.println("저체중입니다.");
		} else if (this.getObesity() < 23) {
			System.out.println("정상입니다.");
		} else if (this.getObesity() < 25) {
			System.out.println("과체중입니다.");
		} else if (this.getObesity() > 25) {
			System.out.println("비만입니다.");
		}
		;
	}

	public double getObesity() {
		return (double) ((this.weight - this.getStandardWeight()) / this.getStandardWeight() * 100);
	}

}
