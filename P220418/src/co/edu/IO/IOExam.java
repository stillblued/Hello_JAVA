package co.edu.IO;

import java.io.IOException;
import java.util.Scanner;

public class IOExam {

	public static void main(String[] args) {

//		// 괄호 안 내용 출력
//		System.out.println(false);
//		// 괄호 안 내용 출력 후 엔터
//		System.out.println();
//		// 괄호 안의 내용 커스텀해서 출력
//		System.out.printf(null, args);

		int value = 100;
		System.out.printf("%d\n", value); // %d의 위치에 value를 넣는다. \n은 enter키 줄바꿈.
		System.out.printf("%5d\n", value); // 5칸에 value 표현, 자리가 남으면 앞자리 공백 처리
		System.out.printf("%-5d\n", value); // 5칸에 value 표현, 자리가 남으면 뒷자리 공백 처리
		System.out.printf("%05d\n", value); // 5칸에 value 표현, 자리가 남으면 앞자리 0 처리

		// printf 실수
		double value2 = 12.123;

		System.out.printf("%.2f\n", value2); // 소수점 아래 2자리까지 표현
		System.out.printf("%9.4f\n", value2); // 9칸 중에서 소숫점 아래 4자리까지 표현, 자리가 남으면 앞자리 공백처리
		System.out.printf("%-9.0f\n", value2); // 9칸 중에서 소숫점 아래 0자리까지 표현, 자리가 남으면 뒷자리 공백처리

//		try {
//			System.out.println("값을 입력하세요.");
//			int keyCode = System.in.read();
//			System.out.println("입력값 : "+ keyCode);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// 데이터 입력을 받기 위해 스캐너 선언

		while (true) { // 반복문
			Scanner sc = new Scanner(System.in);
			System.out.println("스캐너 값을 입력하세요.");
			String str = sc.nextLine();
			System.out.println("입력값 : " + str);
			if (str.equals("q")) { // 조건문
				break;
			}
		}

	}

}
