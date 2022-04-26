package co.edu.oop;

public class CarExample {
	public static void main(String[] args) {

		MyCar mycar = new MyCar();

		mycar.setGas(5);

		boolean gasState = mycar.isLeftGas();

		if (gasState) {
			System.out.println("출발합니다.");
			mycar.run();
		}

		if (mycar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}

	}
}
