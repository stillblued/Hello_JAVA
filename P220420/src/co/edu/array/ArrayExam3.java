package co.edu.array;

public class ArrayExam3 {

	public static void main(String[] args) {

		// 1. 1~100까지 데이터를 넣은 배열에서 3의 배수만 출력
		int[] ary1 = new int[100];

		for (int i = 0; i < ary1.length; i++) {
			ary1[i] = i + 1;
		}

//				for (int i=1; i<=ary1.length; i++) {
//					ary1[i-1] = i;
//				}

		for (int i = 0; i < ary1.length; i++) {
			if (ary1[i] % 3 == 0) {
				System.out.println(ary1[i]);
			}
		}

		// 2. 위에서 만든 배열에서 짝수만 출력
		for (int i = 0; i < ary1.length; i++) {
			if (ary1[i] % 3 == 0) {
				if (ary1[i] % 2 == 0) {
					System.out.println(ary1[i]);
				}
			}
		}

	}

}
