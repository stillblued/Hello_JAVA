package co.edu.loop;

public class LoopExam {

	public static void main(String[] args) {

		// 1~5까지의 합을 구하는 반복문
		int sum = 0;
		System.out.println("1~5의 합 : " + sum);
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}

		// 구구단 2단 만들기
		for (int i = 1; i <= 9; i++) {
			System.out.println("2단 : 2 * " + i + "=" + (2 * i));
		}

		// 1~100 사이 3의 배수 구하기
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

		// 홀수 짝수
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println("홀수 : " + i);
			}
			if (i % 2 == 0) {
				System.out.println("짝수 : " + i);
			}
		}

		// 업그레이드 구구단
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

		// 별찍기
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 역순찍기
		for (int i = 1; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 이쁨ㅇㅅㅇ
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

		// 역순공백
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
