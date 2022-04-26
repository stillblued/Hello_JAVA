package co.edu.company;

import java.util.Scanner;
import co.edu.member.Person;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person p1 = new Person("1213-1212", "홍길동");
		p1.info();

		Manager manager = new Manager();
		manager.getSalary();
		Programmer prog = new Programmer();
		prog.getSalary();

		Bird bird = new Bird();
		bird.walk();
		bird.fly();

	}
}
