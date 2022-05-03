package com.yedam.java.question;

public interface Payment {

	public static final double OFFLINE_PAYMENT_RATIO = 0.01;
	public static final double ONLINE_PAYMENT_RATIO = 0.03;
	public static final double SIMPLE_PAYMENT_RATIO = 0.05;

	public abstract int offline(int price);

	public abstract int online(int price);

	public abstract int simple(int price);

	public abstract void showCardInfo();

}
