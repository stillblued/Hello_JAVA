package co.edu.array;

public class ArrayExam {

	public static void main(String[] args) {

//		int[] ary = new int[10];
//
//		int[] ary1 = { 1, 2, 3, 4, 5 };
//		int sum = 0;
//		for (int i = 0; i < ary1.length; i++) {
//			sum += ary1[i];
//		}
//		System.out.println("총합 : " + sum);

		int[] scores = { 83, 90, 87 };
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);

		// 최대, 최소값 구하기
		int[] ary2 = { 5, 3, 2, 8, 1 };

		int max = 0;
		int min = ary2[0]; // 0
		for (int i = 0; i < ary2.length; i++) {
			// 최대값
			if (max < ary2[i]) {
				max = ary2[i];
			}
			// 최소값
			if (min > ary2[i]) {
				min = ary2[i];
			}
		}

		System.out.println(max);
		System.out.println(min);
	}

}
