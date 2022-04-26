package co.edu.company;

import co.edu.access.A;

public class C extends A {

	public static void main(String[] args) {

		A a = new A();

		int temp;

		// 1)default
//		temp = a.a;
		// 2)public
		temp = a.b;
		// 3)protected
//		temp = a.c;
		// 4)privates
//		temp = a.d;

		// 상속 protected
		C c = new C();
		int d = c.c;

	}
}
