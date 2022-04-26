package co.edu.member;

public class Main {

	public static void main(String[] args) {

		double pi = StaticMember.PI;
		System.out.println(pi);

		int sum = StaticMember.plus(5, 10);
		System.out.println(sum);

		int mi = StaticMember.minus(5, 10);
		System.out.println(mi);

		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");

		int sales = Pizza.count;
		System.out.println("판매된 피자 갯수 : " + sales);

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (p1 == p2) {
			System.out.println("같은 피자입니다.");
		}
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		if (obj1 == obj2) {
			System.out.println("하나의 싱글톤 객체 입니다.");
		}
		System.out.println(obj1);
		System.out.println(obj2);

		Person p4 = new Person("123213-123123", "홍길동");
		System.out.println(p4.nation + ", " + p4.ssn + ", " + p4.name);
//		p4.nation = "USA";

		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS);
		System.out.println("지구의 표면적 : " + Earth.EARTH_AREA);

	}

}
