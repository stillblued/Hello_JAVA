package com.yedam.java.question;

public class GreenCard implements Payment {

	private String name = "GREENCard";
	private String grade = "SILVER";
	private int point;
	private double pointRatio = 0.05;

	public GreenCard() {
		super();
	}

	@Override
	public int offline(int price) {
		this.point += (int) (price * this.pointRatio);
		return (int) (price - (price * Payment.OFFLINE_PAYMENT_RATIO));
	}

	@Override
	public int online(int price) {
		this.point += (int) (price * this.pointRatio);
		return (int) (price - (price * Payment.ONLINE_PAYMENT_RATIO));
	}

	@Override
	public int simple(int price) {
		this.point += (int) (price * this.pointRatio);
		return (int) (price - (price * SIMPLE_PAYMENT_RATIO));
	}

	@Override
	public void showCardInfo() {
		System.out.println("======카드 정보======");
		System.out.println("카드명 : " + this.name);
		System.out.println("적용 등급 : " + this.grade);
		System.out.println("할인율 : 오프라인(1%), 온라인(3%), 간편결제(5%)");
		System.out.println("포인트 적립율 : " + this.pointRatio);
		System.out.println("적립 포인트 :" + this.point);

	}

}
