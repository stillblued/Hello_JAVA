package com.yedam.java.homework1;

public class StandardWeightInfo extends Human {

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %d, 몸무게 %d, 표준체중 %3.1f 입니다.\n", this.name, this.height, this.weight,
				this.getStandardWeight());
	}

	public double getStandardWeight() {
		return (double) ((this.height - 100) * 0.9);
	}

}
