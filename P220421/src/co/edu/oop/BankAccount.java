package co.edu.oop;

public class BankAccount {

	int acNum;
	String acNam;
	int acBal;

	public BankAccount(int acNum, String acNam, int acBal) {
		super();
		this.acNum = acNum;
		this.acNam = acNam;
		this.acBal = acBal;
	}

	void deposit(int money) {
		this.acBal += money;
		return;
	}

	void withDraw(int money) {
		this.acBal -= money;
		return;
	}

	void balance() {
		System.out.println("현재 잔액은 " + this.acBal + " 원 입니다.");

	}

}
