package com.yedam.prj220506;

import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		Stack st = new Stack();
//		for (int i = 0; i < 5; i++) {
//			System.out.println("정수를 입력해주십시오.");
//			int n = scan.nextInt();
//		}
//		st.push(n);
//		st.pop();

//		while (true) {
//			System.out.println("============================");
//			System.out.println("로또 몇 게임을 구매하시겠습니까?");
//			int number = scan.nextInt();
//			Lotto lt = new Lotto(number);
//			lt.showLotto();
//			System.out.println("행운을 빕니다~");
//		}

//		Baseball bb = new Baseball();
//		boolean again = true;
//
//		while (again) {
//			List<Integer> computer = bb.create();
//			String result = "";
//			while (!result.equals("3스트라이크")) {
//				result = bb.judgement(computer, bb.playerNumber());
//				System.out.println(result);
//			}
//			again = bb.playagain();
//		}

		Diction ws = new Diction();
		ws.run();

	}
}
