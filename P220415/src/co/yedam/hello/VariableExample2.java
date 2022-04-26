package co.yedam.hello;

public class VariableExample2 {

	public static void main(String[] args) {

//		자동타입 변환
//		byte a = 10;
//		int b = a;
//		long c = b;
//		byte d = 10;
//		char f = d;

//	강제 타입 변환		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);

		int intValue1 = 10;
		byte byteValue = (byte) intValue1;
		System.out.println(byteValue);

	}

}
