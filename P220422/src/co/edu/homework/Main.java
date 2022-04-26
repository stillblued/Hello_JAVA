package co.edu.homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		int menu = 0;
		Student[] st = null;

		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println(" 1.학생수 | 2.학생정보입력 | 3.학생정보출력 | 4.순위 |5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택 > ");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {

				System.out.println("학생수를 입력하십시오. >>>");
				size = Integer.parseInt(sc.nextLine());
				st = new Student[size];

			} else if (menu == 2) {
				for (int i = 0; i < st.length; i++) {

					System.out.println("학번을 입력하세요>");
					int number = Integer.parseInt(sc.nextLine());
					System.out.println("이름을 입력하세요>>>");
					String name = sc.nextLine();
					System.out.println("국어 점수를 입력하세요>");
					int kor = Integer.parseInt(sc.nextLine());
					System.out.println("수학 점수를 입력하세요>");
					int math = Integer.parseInt(sc.nextLine());
					System.out.println("영어 점수를 입력하세요>");
					int eng = Integer.parseInt(sc.nextLine());

					st[i] = new Student(number, name, kor, math, eng);
				}
			} else if (menu == 3) {
				System.out.println("학번 입력 >");
				int studentNum = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < st.length; i++) {
					if (studentNum == st[i].getNumber()) {
						st[i].getInfo();
					}
				}
			} else if (menu == 4) {
				int rank = 1;
				for (int i = 0; i < st.length - 1; i++) {
					for (int j = i + 1; j < st.length; j++) {
						if (st[i].avg() < st[j].avg()) {
							rank++;
						}
					}
					st[i].getInfo();
					System.out.println(st[i].avg() + "점 : " + rank + "등");
					rank = 1;
				}
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 값입니다.");
			}
		}

	}
}
