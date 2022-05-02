package com.yedam.java.homework;

public class EngineeringCalculator extends Calculator {

	private double[] numList = new double[5];// 입력 받은 숫자 저장하는 배열
	private int numCount; // 입력받은 숫자 갯수
	private String[] operatorList = new String[this.numList.length - 1];// 입력받은 연산자 저장하는 배열
	private int operatorCount; // 입력받은 연산자 갯수

	public EngineeringCalculator() {
		super();
	}

	@Override
	public void printMenu() {
		super.printMenu();
		getExpression();

	}

	@Override
	public void init() {
		this.numList = new double[5];
		this.numCount = 0;
		this.operatorList = new String[this.numList.length - 1];
		this.operatorCount = 0;

	}

	@Override
	public void setInputNum(double num) {
		this.numList[numCount] = num;
		this.numCount++;
	}

	@Override
	public void print() {
		if (check()) {
			System.out.println("계산 결과 : " + getCalResult());
		}
	}

	@Override
	public void plus() {
		if (check()) {
			this.operatorList[operatorCount] = "+";
			operatorCount++;
		}
	}

	@Override
	public void subtract() {
		if (check()) {
			this.operatorList[operatorCount] = "-";
			operatorCount++;
		}
	}

	@Override
	public void multiply() {
		if (check()) {
			this.operatorList[operatorCount] = "*";
			operatorCount++;
		}
	}

	@Override
	public void division() {
		if (check()) {
			this.operatorList[operatorCount] = "/";
			operatorCount++;
		}
	}

	@Override
	public void remain() {
		if (check()) {
			this.operatorList[operatorCount] = "%";
			operatorCount++;
		}
	}

	@Override
	public void delete() {
		if (this.numCount == 0) {
			System.out.println("더이상 삭제할 숫자가 없습니다.");
		}
		if (this.operatorCount == 0) {
			System.out.println("더이상 삭제할 연산자가 없습니다.");
		} else if (this.numCount > this.operatorCount) {
			this.numList[this.numCount - 1] = 0;
			this.numCount--;
		} else if (this.numCount < this.operatorCount)
			this.operatorList[this.operatorCount - 1] = null;
		this.operatorCount--;
	}

	public boolean check() {
		if (this.numCount > this.operatorCount) {
			return true;
		} else {
			System.out.println("현재까지 입력된 연산식을 확인해주세요.");
			return false;
		}
	}

	public double getCalResult() { ///////// 연산식 결과....만들어야함...
		double result = numList[0];
		for (int i = 0; i <= operatorCount; i++) {
			switch (operatorList[i]) {
			case "+":
				result += numList[i + 1];
				break;
			case "-":
				result -= numList[i + 1];
				break;
			case "*":
				result *= numList[i + 1];
				break;
			case "/":
				result /= numList[i + 1];
				break;
			case "%":
				result %= numList[i + 1];
				break;
			}
		}
		return result;
	}

	public void getExpression() {
		System.out.print("현재 연산식 : ");
		for (int i = 0; i < this.numCount; i++) {
			System.out.print(this.numList[i] + " ");
			for (int j = 0; j < this.operatorCount; j++) {
				if (i == j) {
					System.out.print(this.operatorList[i] + " ");
				}
				if (i == numCount - 1 && j > i) {
					System.out.print(this.operatorList[j] + " ");

				}
			}

		}
	}
}
