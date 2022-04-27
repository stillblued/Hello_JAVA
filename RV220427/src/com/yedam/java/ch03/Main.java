package com.yedam.java.ch03;

public class Main {

	public static void main(String[] args) {

		int[] lotto = new int[7]; // 로또 번호 배열

		for (int i = 0; i < lotto.length; i++) { // 7회 반복
			int num = (int) (Math.random() * 45) + 1; // 랜덤 값 1~45 생성
			lotto[i] = num; // 랜덤 값을 7크기의 배열에 입력
			for (int j = 0; j < i; j++) { // 두 값이 일치 시 이전 for로 돌아감
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("로또 번호 : ");
		for (int i = 0; i < lotto.length; i++) { // 번호 출력 7회 반복
			System.out.print(lotto[i] + " ");
		}
		;

		int[] numList = new int[6];
		int numCount = -1;
		boolean selected = false;

		while (numCount < 5) {
			selected = false;
			// 랜덤 값 생성
			int num = (int) (Math.random() * 20) + 1;

			// 중복여부 확인
			if (numCount > -1) {
				for (int i = 0; i <= numCount; i++) {
					if (num == numList[i]) {
						selected = true;
						break;
					}
				}
			}

			// 로또 번호 등록
			if (!selected) {
				numList[++numCount] = num;
			}
		}

		for (int num : numList) {
			System.out.print(num + " ");
		}
	}
}
