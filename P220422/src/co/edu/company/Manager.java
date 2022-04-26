package co.edu.company;

public class Manager extends Employee {

	@Override
	public void getSalary() {
		System.out.println("관리자의 월급은 : " + (baseSalary + 1000000));
	}

}
