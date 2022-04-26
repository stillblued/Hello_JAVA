package co.edu.extend;

public class DmbCellPhone extends CellPhone {

	public int channel;

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	void turnOnDmb() {
		super.powerOn();
		System.out.println("DMB를 켭니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB를 끕니다.");
	}

	@Override
	void powerOn() {
		System.out.println("자식 클래스에서 전원을 켭니다.");
	}

}
