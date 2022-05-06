package com.yedam.prj220506;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class App {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);

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

//		Diction ws = new Diction();
//		ws.run();

		try {
			Writer os = new FileWriter("c:\\temp\\a.txt");
			String str = "abcdef";

			os.write(str);

			os.flush();
			os.close();

			Reader reader = new FileReader("c:\\temp\\a.txt");
			char[] buffer = new char[100];
			while (true) {
				int charNum = reader.read(buffer);
				if (charNum == -1)
					break; // 파일 끝을 만나면 EOF
				for (int i = 0; i < charNum; i++) {
					System.out.println(buffer[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
