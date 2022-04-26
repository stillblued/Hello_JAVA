package co.edu.member;

public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
