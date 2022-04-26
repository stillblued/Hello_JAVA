package co.edu.company;

public class Programmer extends Employee {

	@Override
	public void getSalary() {
		System.out.println("프로그래머의 월급은 : " + (baseSalary + 2000000));
	}

}
