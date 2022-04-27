package com.yedam.java.ch04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] no = null;

		System.out.println("주사위를 굴릴 횟수를 입력해주세요.");
		int size = Integer.parseInt(sc.nextLine());
		no = new int[size];
		int max = 0;
		int min = no[0];
		int sum = 0;

		for (int i = 0; i < no.length; i++) {
			int num = (int) ((Math.random() * 6) + 1);
			no[i] = num;
		}

		for (int i = 0; i < no.length; i++) {
			if (max < no[i]) {
				max = no[i];
			}

			if (min > no[i]) {
				min = no[i];
			}
		}

		for (int k = 0; k < no.length; k++) {
			sum += k;

		}
		System.out.println(
				"주사위를 " + no.length + "번 돌려서 나온 | 최댓값 : " + max + " | 최솟값 : " + min + " | 총합계 : " + sum + "입니다.");

	}

}
