package co.edu.array;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		// 반복문을 사용해서 최대 최솟값구하기

		int[] ary1 = { 1, 2, 3, 4, 5 };

		int max = 0; //
		int min = ary1[0]; // 다른 변수와 비교할 수 있는 데이터를 변수로 지정 -> 배열의 첫번째 변수
		for (int i = 0; i < ary1.length; i++) {
			// 최댓값 구하기
			if (max < ary1[i]) { // max(=0)이 ary1의 i번째 변수보다 작을 때,
				max = ary1[i]; // 변수 max = ary1[i]이다. ->계속 반복
			}
			// 최솟값 구하기
			if (min > ary1[i]) {
				min = ary1[i];
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

		Scanner sc = new Scanner(System.in);

		int[] ary2 = null;
		System.out.println("배열의 사이즈를 입력하세요");
		int num = sc.nextInt(); // 배열 사이즈 입력
		ary2 = new int[num]; // 배열 사이즈 입력한 값으로 배열 크기 설정

		for (int i = 0; i < ary2.length; i++) {
			ary2[i] = i + 1; // 1~배열의 크기만큼 데이터 입력
		}

		// 2의 배수 구하는 프로그램
		for (int i = 0; i < ary2.length; i++) {
			if (ary2[i] % 2 == 0) {
				System.out.println(ary2[i]);
			}
		}
		// 홀수만 출력
		for (int i = 0; i < ary2.length; i++) {
			if (ary2[i] % 2 == 1) {
				System.out.println(ary2[i]);
			}
		}

		int[] ary3 = new int[num];
		for (int i = 0; i < ary3.length; i++) { // int i=0; i<num; i++ 도 같다
			ary3[i] = i;
		}
		// 중첩 반복문, 조건문을 이용한 데이터 출력
		for (int i = 0; i < ary2.length; i++) {
			for (int j = 0; j < ary3.length; j++) {
				if (ary2[i] + ary3[j] < 10) {
					System.out.println("1. " + ary2[i] + " 2. " + ary3[j]);
				}
			}
		}
	}

}
