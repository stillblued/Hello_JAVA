package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		cal.x = 12;
		cal.y = 3;

		cal.plus(10, 2);
		cal.minus(100, 40);
		cal.multi(5, 78);
		cal.div(168, 3);

		Car car = new Car(); // 그랜져
		car.model = "그랜져";
		car.color = "white";
		car.price = 50000000;
		car.info();

		Car car2 = new Car(); // 소나타
		car2.model = "소나타";
		car2.color = "white";
		car2.price = 48000000;
		car2.info();

		Car car3 = new Car("벤츠", "Black", 100000000);
		car3.info();

	}

}
