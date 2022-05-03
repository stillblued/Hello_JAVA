package com.yedam.java.question;

public class VIPCard implements Payment {

	private String name = "VIPCard";
	private String grade = "GOLD";
	private double saleRatio = 0.1;
	private int point;
	private double pointRatio = 0.03;

	public VIPCard() {
		super();

	}

	@Override
	public int offline(int price) {
		this.point += (int) (price * this.pointRatio);
		return (int) (price * (1 - (saleRatio + Payment.OFFLINE_PAYMENT_RATIO)));
	}

	@Override
	public int online(int price) {
		this.point += (int) (price * this.pointRatio);
		return (int) (price * (1 - (saleRatio + Payment.ONLINE_PAYMENT_RATIO)));
	}

	@Override
	public int simple(int price) {
		this.point += (int) (price * this.pointRatio);
		return (int) (price * (1 - (saleRatio + Payment.SIMPLE_PAYMENT_RATIO)));
	}

	@Override
	public void showCardInfo() {
		System.out.println("======카드 정보======");
		System.out.println("카드명 : " + this.name);
		System.out.println("적용 등급 : " + this.grade);
		System.out.println("할인율 : " + this.saleRatio);
		System.out.println("포인트 적립율 : " + this.pointRatio);
		System.out.println("적립 포인트 :" + this.point);

	}

}
