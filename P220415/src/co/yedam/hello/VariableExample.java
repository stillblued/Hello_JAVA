package co.yedam.hello;

public class VariableExample {

	public static void main(String[] args) {

		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수

		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);

//		long longVar1 = 10;
//		long longVar2 = 20L;
//		long longVar3 = 10000000000;
//		long longVar4 = 10000000000L;

		char c1 = 'A'; // 문자
		char c2 = 65;
		char c3 = 44032;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		String name = "홍길동"; // 문자열.. *참조타입*
		String job = "프로그래머";

		System.out.println(name);
		System.out.println(job);
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 \n출력"); // \t탭 \n엔터

		// 실수 타입 : float, double
//		float floatVar1 = 3.14;
//		float floatVar2 = 3.14f;
//		double doubleVar1 = 0.321;
//		float floatVar3 = 0.12345678912344559f;
//		double doubleVar2 = 0.12345678912344559;

		boolean stop = true;
//		boolean state = false;

		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}

	}

}
