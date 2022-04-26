package co.edu.extend;

public class CellPhone {

	public String model;
	public String color;

	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
