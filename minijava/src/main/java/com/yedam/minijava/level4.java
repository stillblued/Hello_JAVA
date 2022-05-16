package com.yedam.minijava;

public class level4 extends Customer {

	@Override
	public String getCustomer(int number) {
		String getMenu = null;
		switch (number) {
		case 15:
			getMenu = "황금볶음밥만 1주일 째! 그래도 오늘은 럭셔리하게 새우를 추가해주세요!";
			break;
		case 16:
			getMenu = "브런치의 정석은 역시 팬케이크죠. 버터랑 시럽이 뿌려진 모양이 정말 인스타감이라니까.";
			break;
		case 17:
			getMenu = "불고기가 아니라 일식 느낌 나는 덮밥이 먹고 싶어요.";
			break;
		case 18:
			getMenu = "뵈프 부르기뇽.. 무슨 맛인지 궁금해요..";
			break;
		case 19:
			getMenu = "키슈. 시금치 듬뿍 넣어서~ 부탁합니다.";
			break;
		}
		return getMenu;
	}

	@Override
	public int getRandom() {
		return ((int) (Math.random() * 5) + 15);
	}
}
