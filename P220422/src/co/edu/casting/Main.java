package co.edu.casting;

public class Main {

	public static void main(String[] args) {

		// D>B>A
		// E>C>A

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;

//		B b2 = e;
//		C c2 = d;

		Parent p1 = new Child();
		p1.method1();
		p1.method2();
		p1.method3();
//		p1.method4();

		Child c2 = new Child();
		c2.method4();

		Parent p2 = new Parent();
		Parent p3 = new Parent();
		Parent p4 = new Parent();

		Parent[] parent = { p2, p3, p4 };

	}

}
