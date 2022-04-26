package co.yedam.hello;

public class Example {

	public static void main(String[] args) {
		// 반지름이 5인 원의 면적

		double PI = 3.14;
		int radius = 5;

		double gongsic = PI * radius * radius;
		System.out.println(gongsic);

		// 밑면이 4고 높이가 4인 삼각형의 넓이를 구하시오.

		int baseSide = 4;
		int height = 4;

		double triangle = (baseSide * height) / 2;
		System.out.println(triangle);

	}

}
