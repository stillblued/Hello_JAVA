package com.yedam.minijava;

public class level3 extends Customer {

	@Override
	public String getCustomer(int number) {
		String getMenu = null;
		switch (number) {
		case 10:
			getMenu = "채소를 싫어하는 사람한테 잠봉뵈르만한 샌드위치는 없는 것 같아요.";
			break;
		case 11:
			getMenu = "여기서 파는 딤섬은 왜 이렇게 맛있는지 모르겠어요! 새우가 많이 들어가서 그런가?";
			break;
		case 12:
			getMenu = "진정한 '까르보나라'를 찾고 있네.";
			break;
		case 13:
			getMenu = "따뜻한 스프 없을까요? 브로콜리 말고 향긋한 걸로...";
			break;
		case 14:
			getMenu = "카프레제 샐러드는 이탈리아 국기를 닮았죠.";
			break;
		}
		return getMenu;
	}

	@Override
	public int getRandom() {
		return ((int) (Math.random() * 5) + 10);

	}

}
