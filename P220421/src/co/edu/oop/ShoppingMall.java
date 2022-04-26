package co.edu.oop;

public class ShoppingMall {
	
	int orderNum;
	String id;
	String name;
	int goodsNum;
	String address;

	public ShoppingMall(int orderNum, String id, String name, int goodsNum, String address) {
		super();
		this.orderNum = orderNum;
		this.id = id;
		this.name = name;
		this.goodsNum = goodsNum;
		this.address = address;
	}

	void getInfo() {
		System.out.println("주문 번호 : " + orderNum);
		System.out.println("주문자 아이디 : " + id);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + goodsNum);
		System.out.println("배송 주소 : " + address);
	}

}
