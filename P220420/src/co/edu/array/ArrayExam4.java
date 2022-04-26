package co.edu.array;

public class ArrayExam4 {

	public static void main(String[] args) {

//		int[][] ary = {{1,2},{2,3},{3,4},{4,5},{5,6}};
//		
//		for(int i=0; i<ary.length; i++) {
//			for (int j=0; j<ary[i].length; j++) {
//				System.out.print(ary[i][j] +" ");
//			}
//			System.out.println();
//		}

		// 2차원 배열 -> 배열 안에 배열이 존재.
		int[][] ary1 = new int[5][5]; // 5행 3열 = 5줄 3칸
		int num = 1;

		// 2차원 배열 데이터 입력 1~25
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				ary1[i][j] += num; // (0,0)일때 1, (0,1) 일때 2, ... , (5,5)일때 25
				num++;
			}
		}
		System.out.println("-----------------------1---------------------");
		// 2차원 배열 데이터 출력
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				System.out.print(ary1[i][j] + "	");
			}
			System.out.println();
		}
		System.out.println("-----------------------2---------------------");

		// 2차원 배열 데이터 출력2
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				System.out.print(ary1[j][i] + "	");
			}
			System.out.println();
		}
//		System.out.println("-----------------------3---------------------");

		// 2차원 배열 데이터 출력3
//		for(int i=0; i<ary1.length; i++) {
//			for (int j=4; j>ary1[i].length; j++) {
//				System.out.print(ary1[i][j] +"	");
//			}
//			System.out.println();
//		}
//		System.out.println("----------------------4---------------------");
//		
//		//2차원 배열 데이터 출력4
//		for(int i=0; i<ary1.length; i++) {
//			for (int j=4; j>ary1[i].length; j--) {
//				System.out.print(ary1[j][i] +"	");
//			}
//			System.out.println();
//		}

//		참조타입 (String) 배열 생성
		String[] strAry = { "김", "이", "박", "최" };

		for (String firName : strAry) { // 참조타입과 출력 타입(?)이 같아야한다.
			System.out.println(firName);
		}

	}

}
