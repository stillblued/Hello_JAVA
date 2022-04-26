package co.edu.extend;

public class Main {

	public static void main(String[] args) {

		DmbCellPhone dmvCellPhone = new DmbCellPhone("연아의 햅틱", "white", 100);

		// 부모 클래스 메소드
		dmvCellPhone.powerOn();
		dmvCellPhone.bell();
		dmvCellPhone.hangUp();
		// 자식 클래스 메소드
		dmvCellPhone.turnOnDmb();
		dmvCellPhone.turnOffDmb();
		// 부모 클래스 메소드
		dmvCellPhone.powerOff();
		// 부모 클래스 필드 출력
		System.out.println(dmvCellPhone.color);
		System.out.println(dmvCellPhone.model);

		// 부모
		Calculator cal = new Calculator();
		System.out.println("원면적 : " + cal.areaCircle(10));
		// 자식
		Computer com = new Computer();
		System.out.println("원면적 : " + com.areaCircle(10));
		//
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
