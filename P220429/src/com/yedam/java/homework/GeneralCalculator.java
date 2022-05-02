package com.yedam.java.homework;

public class GeneralCalculator extends Calculator {

	protected double[] numList = new double[2];
	protected int numCount = 0;

	public GeneralCalculator() {
		super();
	}

	@Override
	public void init() {
		this.numList = new double[2];
		this.numCount = 0;
	}

	@Override
	public void setInputNum(double num) {
		this.numList[numCount] = num;
		this.numCount++;
	}

	@Override
	public void print() {
		System.out.print("현재까지 입력된 숫자 : ");
		for (int i = 0; i < this.numList.length; i++) {
			System.out.print(this.numList[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void plus() {
		if (check()) {
			double plus = 0;
			for (int i = 0; i < this.numList.length; i++) {
				plus += this.numList[i];
			}
			System.out.println("+ : " + plus);
		}
	}

	@Override
	public void subtract() {
		if (check()) {
			double subtract = this.numList[0];
			for (int i = 1; i < this.numList.length; i++) {
				subtract -= this.numList[i];
			}
			System.out.println("- : " + subtract);
		}
	}

	@Override
	public void multiply() {
		if (check()) {
			double multiply = 1;
			for (int i = 0; i < this.numList.length; i++) {
				multiply = multiply * this.numList[i];
			}
			System.out.println("* : " + multiply);
		}
	}

	@Override
	public void division() {
		if (check()) {
			double division = this.numList[0];
			for (int i = 1; i < this.numList.length; i++) {
				division = division / this.numList[i];
			}
			System.out.println("/ : " + division);
		}
	}

	@Override
	public void remain() {
		if (check()) {
			double remain = this.numList[0];
			for (int i = 1; i < this.numList.length; i++) {
				remain = remain % this.numList[i];
			}
			System.out.println("% : " + remain);
		}
	}

	@Override
	public void delete() {
		if (this.numCount == 0) {
			System.out.println("더이상 삭제할 숫자가 없습니다.");
		} else {
			this.numList[this.numCount - 1] = 0;
			this.numCount--;
		}
	}

	public boolean check() {
		if (this.numCount == this.numList.length) {
			return true;
		} else {
			System.out.println("숫자를 더 입력해주세요.");
			return false;
		}

	}
}
