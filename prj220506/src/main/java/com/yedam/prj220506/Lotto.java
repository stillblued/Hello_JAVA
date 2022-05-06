package com.yedam.prj220506;

import java.util.Arrays;

public class Lotto {

	private int[] lotto;
	int number;

	public Lotto(int number) {
		super();
		this.lotto = new int[6];
		this.number = number;
	}

	public void makeLotto() {
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lotto[i] = num;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.print("로또 번호 : ");
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		;
	}

	public void showLotto() {
		for (int i = 1; i < this.number + 1; i++) {
			makeLotto();
			System.out.println();
			if (i % 5 == 0) {
				System.out.println("----------------------------");
			}
		}
		System.out.printf("금액은 %d000 원입니다.\n", this.number);

	}

}
