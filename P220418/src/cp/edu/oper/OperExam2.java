package cp.edu.oper;

public class OperExam2 {

	public static void main(String[] args) {

//		boolean flag = true;
//		if (!flag) {
//			System.out.println("참");
//		} else {
//			System.out.println("거짓");
//		}
//
//		int score = 95;
//		char grade = (score > 90) ? 'A' : 'B';
//		System.out.println("학점은" + grade + "입니다.");

		// 논리 연산자 && , || , ^ , !

		int i = 9;
		if (i == 100) { // 비교 연산자 == , != , > , >= , < , <=
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}

		String str = "서브웨이";
		if (str.equals("서브웨이")) {
			System.out.println("맛있다.");
		} else {
			System.out.println("별로다.");
		}

		int var = 6;

		if (var % 2 == 0 && var % 3 == 0) {
			System.out.println("2의 배수이면서, 3의 배수입니다.");
		} else {
			System.out.println("2의 배수이거나 3의 배수가 아닙니다.");
		}

		var = 9;

		if (var % 2 == 0 || var % 3 == 0) {
			System.out.println("2의 배수이거나, 3의 배수입니다.");
		} else {
			System.out.println("2의 배수이거나, 3의 배수가 아닙니다.");
		}

		int score = 99;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println("학점은 " + grade + "입니다.");
	}

}
