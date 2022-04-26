package co.edu.array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		boolean run = true;
		int stuNum = 0;
		int[] scores = null;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 >");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.print("학생 수 >");
				stuNum = sc.nextInt();
				scores = new int[stuNum];
				sc.nextLine();
			}

			else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					scores[i] = sc.nextInt(); // 엔터를 치면 엔터값이 있어 오류가 남. Integer.parseInt(sc.nextLine());를 쓰면 오류 안남
					System.out.println("scores [" + i + "]>" + scores[i]);
					sc.nextLine(); // 엔터값 처리를 위한 구문
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores [" + i + "]>" + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
						// max = max<scores[1] ? scores[i] : max;
					}
					sum += scores[i];

				}
				System.out.println("최고 점수 : " + max);
				System.out.printf("평균 점수 : + %.2f\n", (double) sum / scores.length);
			}

			else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
