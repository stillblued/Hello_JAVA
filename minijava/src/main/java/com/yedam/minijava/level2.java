package com.yedam.minijava;

public class level2 extends Customer {

	@Override
	public String getCustomer(int number) {
		String getMenu = null;
		switch (number) {
		case 5:
			getMenu = "포크커틀릿은 돈까스랑 뭐가 다른 걸까요? 한번 먹어볼래요.";
			break;
		case 6:
			getMenu = "갓 튀긴 고로케는 참을 수 없지!";
			break;
		case 7:
			getMenu = "비오는 날에는 역시 부침개에 막걸리죠. 저는 김치전으로 주세요.";
			break;
		case 8:
			getMenu = "'콘도그' 말고 '핫도그'로 부탁합니다.";
			break;
		case 9:
			getMenu = "생쥐가 요리하는 영화 본 적 있어요? 그 영화 제목!";
			break;
		}
		return getMenu;
	}

	@Override
	public int getRandom() {
		return ((int) (Math.random() * 5) + 5);

	}

}
