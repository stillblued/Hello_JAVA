package co.edu.condition;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * while (true) { int num = (int) (Math.random() * 6) + 1;
		 * System.out.println("주사위의 수는 : " + num);
		 * 
		 * if (num == 1) { System.out.println("숫자 1"); } else if (num == 2) {
		 * System.out.println("숫자 2"); } else if (num == 3) {
		 * System.out.println("숫자 3"); } else if (num == 4) {
		 * System.out.println("숫자 4"); } else if (num == 5) {
		 * System.out.println("숫자 5"); } else { System.out.println("숫자 6, 탈출"); break; }
		 * 
		 */
		boolean run = true;
		while (run) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("주사위의 수는 : " + num);

			switch (num) {
			case 1:
				System.out.println("주사위 수는 1");
				break;
			case 2:
				System.out.println("주사위 수는 2");
				break;
			case 3:
				System.out.println("주사위 수는 3");
				break;
			case 4:
				System.out.println("주사위 수는 4");
				break;
			case 5:
				System.out.println("주사위 수는 5");
				break;
			default:
				System.out.println("주사위 수는 6");
				run = false;
				break;
			}
		}

	}
}
