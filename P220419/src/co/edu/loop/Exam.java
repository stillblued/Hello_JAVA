package co.edu.loop;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int menu = 0;
		int withDraw = 0;
		int deposit = 0;
		int balance = 0;
		while (run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-----------------------");
			System.out.println("선택> ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("예금액>");
				deposit = sc.nextInt();
				balance += deposit;
				System.out.println("잔고>" + balance);
				break;
			case 2:
				System.out.println("출금액>");
				withDraw = sc.nextInt();
				if (balance < withDraw) {
					System.out.println("잔고 부족");
				} else {
					balance -= withDraw;
					System.out.println("잔고>" + balance);
				}
				break;
			case 3:
				System.out.println("잔고>" + balance);

				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}

	}

}
