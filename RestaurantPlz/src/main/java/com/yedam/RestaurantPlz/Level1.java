package com.yedam.RestaurantPlz;

public class Level1 extends Customer {

	@Override
	public String getCustomer(int number) {
		String getMenu = null;
		switch (number) {
		case 0:
			getMenu = "날도 더운데 시원하고 상큼하게~ 딸기가 들어간 디저트가 땡기네요. 뭐 좋은 거 없을까요?";
			break;
		case 1:
			getMenu = "어른들을 위한 젤리는 없나요.. 위스키봉봉처럼..";
			break;
		case 2:
			getMenu = "집에 홈시어터룸을 만들었어요! 가볍게 영화관 분위기가 날 간식거리 포장 부탁해요.";
			break;
		case 3:
			getMenu = "아침마다 먹는 써니사이드업도 슬슬 질리네요. 뭐 색다른 거 없을까.";
			break;
		case 4:
			getMenu = "프랑스던가 보라색 닭요리가 있다던데! 코코? 뭐더라? 아무튼 그걸로..!!";
			break;
		}
		return getMenu;
	}

	@Override
	public int getRandom() {
		return (int) (Math.random() * 5);
	}

}