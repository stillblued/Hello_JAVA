package com.yedam.RestaurantPlz;

public class Level5 extends Customer {

	@Override
	public String getCustomer(int number) {
		String getMenu = null;
		switch (number) {
		case 20:
			getMenu = "빠에야에는 금보다 비싼 향신료를 넣어야 진짜라고 해요. 배보다 배꼽이 큰 것 같지만 진짜로 부탁해요.";
			break;
		case 21:
			getMenu = "비프웰링턴. 내 완벽한 디너를 부탁하네. 설마 모르는 건 아니겠지?";
			break;
		case 22:
			getMenu = "지난 휴가철 마르세이유에서 먹었던 생선스튜 맛이 그리워요.. 국물이 정말 끝내줬는데.";
			break;
		case 23:
			getMenu = "다이어트 중이라도 가볍게 포토푀 정도는 괜찮죠? 그렇다고 소세지를 빼지는 마세요..";
			break;
		case 24:
			getMenu = "버섯이 듬뿍 들어간 라비올리가 먹고싶어요. 아, 소스는 크림이 좋겠어요.";
			break;
		}
		;
		return getMenu;
	}

	@Override
	public int getRandom() {
		return ((int) (Math.random() * 5) + 20);

	}

}
