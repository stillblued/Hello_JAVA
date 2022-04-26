package co.edu.member;

public class Pizza {

	private String toppings;
	private int radius;
	static final double PI = 3.141592;
	static int count = 0;

	public Pizza(String toppings) {
		this.toppings = toppings;
		count++;
	}

}
