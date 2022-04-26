package co.edu.oop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		 
//		  Korean k1 = new Korean("박자바", "012345-1234578"); k1.getInfo();
//		 
//		  Korean k2 = new Korean("김자바", "843745-1234228"); k2.getInfo();
//		  
//		  Korean k3 = new Korean("미국", "이자바", "24324-123133"); k3.getInfo();
//		  
//		  Calculator cal = new Calculator(); int result = cal.plus(3, 2);
//		  System.out.println(result);
//		  
//		  result = cal.minus(10, 2); System.out.println(result);
//		  
//		  cal.excute(); double avg = cal.avg(10, 2); System.out.println(avg);
//		 
//		  Calculator2 myCalcu = new Calculator2();
//		  
//		  double result1 = myCalcu.areaRectangle(10);
//		  
//		  double result2 = myCalcu.areaRectangle(10, 20);
//		  
//		  System.out.println("정사각형 넓이 = " + result1); System.out.println("직사각형 넓이 = " +
//		  result2);
//		 
//		 
//		  
//		  System.out.println("주문 번호 입력> "); int no = Integer.parseInt(sc.nextLine());
//		  System.out.println("주문자 아이디 입력> "); String id = sc.nextLine();
//		  System.out.println("주문자 이름 입력> "); String name = sc.nextLine();
//		  System.out.println("주문 상품 번호 입력> "); int prono =
//		  Integer.parseInt(sc.nextLine()); System.out.println("배송 주소 입력> "); String
//		  addr = sc.nextLine();
//		  
//		  ShoppingMall shop = new ShoppingMall(no, id, name, prono, addr);
//		  
//		  shop.getInfo();
//		  
//		  Person per = new Person(92493 - 123123, "John", "Newyork", 20);
//		  per.introduce();
//		  
//		  Person pers = new Person(123123 - 324234, "James", "Hawaii", 23);
//		  pers.introduce();
//		  
//		  Person perso = new Person(123123 - 123123, "Suji", "London", 24);
//		 perso.introduce();
//		
//		
//
//		BankAccount ba = new BankAccount(22323 - 1212121, "윤정은", 100);
//
//		boolean run = true;
//
//		while (run) {
//			System.out.println("1.예금, 2.출금, 3.잔액확인, 4.종료");
//			System.out.println("선택> ");
//			int selectNo = Integer.parseInt(sc.nextLine());
//			if (selectNo == 1) {
//				System.out.println("예금을 넣어주세요.");
//				int money = Integer.parseInt(sc.nextLine());
//				ba.deposit(money);
//			} else if (selectNo == 2) {
//				System.out.println("출금액을 입력하세요.");
//				int money = Integer.parseInt(sc.nextLine());
//				ba.withDraw(money);
//			} else if (selectNo == 3) {
//				ba.balance();
//			} else if (selectNo == 4) {
//				run = false;
//			}
//
//		}
//		System.out.println("종료");

		Student st = new Student();
		st.stuNo = 21112213;
		st.name = "윤정은";
		st.kor = 100;
		st.math = 78;
		st.eng = 86;

		st.info();
		st.avg();

	}

}
