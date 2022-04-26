package co.edu.array;

import java.util.Scanner;

public class ArrayExam1 {

	public static void main(String[] args) {
		
		int[] ary = new int[5]; 
		// int 타입(정수) 배열, 5개의 데이터를 넣을 수 있는 공간.

		ary[0] = 1; // 1)데이터 저장하는 방법
		ary[1] = 2; // []은 무조건 0부터 넣는다
		ary[2] = 3;
		ary[3] = 4;
		ary[4] = 5;

		// 2) 데이터 저장하는 방법
		int[] ary1 = { 1, 2, 3, 4, 5 }; // int 타입(정수) 배열, 한 번에 변수 입력

		// 1. 배열 만들고, Scanner을 통해 데이터를 입력하는 프로그램.

		Scanner sc = new Scanner(System.in); // Scanner 선언

		int[] ary2 = new int[5]; // 공간 5개인 정수형 타입 배열 생성

		for (int i = 0; i < ary2.length; i++) {
			System.out.println("데이터를 입력하세요.");
			ary2[i] = sc.nextInt(); // 각 배열 1~5번째 데이터를 넣는 구문
			System.out.println(ary[i]); // 각 배열의 데이터 출력

		}

		// 2. 점수의 총합과 평균을 구하는 프로그램.
		for (int i = 0; i < ary2.length; i++) {
			System.out.println("점수를 입력하세요.");
			ary2[i] = sc.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < ary2.length; i++) {
			sum += ary2[i];
			// sum = sum + ary2[i]
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double) (sum / ary2.length)); // (double) : 타입을 바꿔서 출력하는것 -> 캐스팅

		// 3. 1~100까지의 합
		int[] ary3 = new int[100];
		for (int i = 0; i < ary3.length; i++) { // 변수 i를 이용해서 데이터를 저장하는 방법
			ary3[i] = i + 1;
		}

		sum = 0; // 위에서 sum에 데이터가 들어있어 0으로 초기화
		for (int i = 0; i < ary3.length; i++) { // sum에 0~99까지의
			sum += ary3[i];
		}
		System.out.println(sum);

		sum = 0;

//		1~10 -> 10개
//		0~9 ->10개
//		int[] ary = new int[100];
//		0~99

		// 100번째 배열 자리에서 1~99까지 더한 값을 저장
		for (int i = 0; i < ary3.length; i++) {
			if (i == 99) {
				ary3[i] = sum;
				break;
			}
			sum += ary3[i];
		}
		System.out.println(ary3[99]);
		System.out.println(ary3[98]);
	}

}
