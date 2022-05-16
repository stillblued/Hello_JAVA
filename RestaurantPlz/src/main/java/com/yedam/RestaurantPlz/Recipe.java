package com.yedam.RestaurantPlz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {

	// 레시피 (추가 변경시 오름차순으로~)

	private static final List<String> strawberrySorbet = new ArrayList<String>() {
		{
			add("딸기");
			add("얼음");
		}
	};

	private static final List<String> wineJelly = new ArrayList<String>() {
		{
			add("젤라틴");
			add("포도주");
		}
	};
	private static final List<String> popcorn = new ArrayList<String>() {
		{
			add("버터");
			add("옥수수");
		}
	};
	private static final List<String> scrambledEggs = new ArrayList<String>() {
		{
			add("계란");
			add("우유");
		}
	};
	private static final List<String> cocoVin = new ArrayList<String>() {
		{
			add("닭고기");
			add("포도주");
		}
	};

	private static final List<String> porkCutlet = new ArrayList<String>() {
		{
			add("계란");
			add("돼지고기");
			add("빵가루");
		}
	};
	private static final List<String> croquettes = new ArrayList<String>() {
		{
			add("감자");
			add("계란");
			add("빵가루");
		}
	};
	private static final List<String> kimchiPancake = new ArrayList<String>() {
		{
			add("김치");
			add("부침가루");
			add("오징어");
		}
	};
	private static final List<String> hotdog = new ArrayList<String>() {
		{
			add("빵");
			add("소세지");
			add("피클");
		}
	};
	private static final List<String> ratatouille = new ArrayList<String>() {
		{
			add("가지");
			add("애호박");
			add("토마토");
		}
	};

	private static final List<String> jambonBeurre = new ArrayList<String>() {
		{
			add("루꼴라");
			add("버터");
			add("빵");
			add("햄");
		}
	};
	private static final List<String> xiaolongbao = new ArrayList<String>() {
		{
			add("돼지고기");
			add("밀가루");
			add("새우");
			add("생강");
		}
	};
	private static final List<String> carbonara = new ArrayList<String>() {
		{
			add("계란");
			add("베이컨");
			add("파스타");
			add("후추");
		}
	};
	private static final List<String> basilSoup = new ArrayList<String>() {
		{
			add("밀가루");
			add("바질");
			add("버터");
			add("생크림");
		}
	};
	private static final List<String> caprese = new ArrayList<String>() {
		{
			add("바질");
			add("발사믹");
			add("치즈");
			add("토마토");
		}
	};

	private static final List<String> shrimpPilaf = new ArrayList<String>() {
		{
			add("계란");
			add("굴소스");
			add("대파");
			add("밥");
			add("새우");
		}
	};
	private static final List<String> pancake = new ArrayList<String>() {
		{
			add("계란");
			add("메이플시럽");
			add("밀가루");
			add("버터");
			add("우유");
		}
	};
	private static final List<String> donburi = new ArrayList<String>() {
		{
			add("대파");
			add("밥");
			add("소고기");
			add("양파");
			add("쯔유");
		}
	};
	private static final List<String> bœufBourguignon = new ArrayList<String>() {
		{
			add("당근");
			add("샐러리");
			add("소고기");
			add("양파");
			add("포도주");
		}
	};
	private static final List<String> spinachQuiche = new ArrayList<String>() {
		{
			add("계란");
			add("밀가루");
			add("베이컨");
			add("시금치");
			add("치즈");
		}
	};

	private static final List<String> paella = new ArrayList<String>() {
		{
			add("밥");
			add("사프란");
			add("새우");
			add("오징어");
			add("조개");
			add("파프리카");
		}
	};
	private static final List<String> beefWellington = new ArrayList<String>() {
		{
			add("계란");
			add("머스타드");
			add("밀가루");
			add("베이컨");
			add("소고기");
			add("양송이");
		}
	};
	private static final List<String> bouillabaisse = new ArrayList<String>() {
		{
			add("새우");
			add("생선");
			add("월계수");
			add("조개");
			add("콘소메");
			add("토마토");
		}
	};
	private static final List<String> potAuFeu = new ArrayList<String>() {
		{
			add("감자");
			add("당근");
			add("샐러리");
			add("소세지");
			add("양배추");
			add("월계수");
		}
	};
	private static final List<String> mushroomRavioli = new ArrayList<String>() {
		{
			add("밀가루");
			add("생크림");
			add("시금치");
			add("양송이");
			add("양파");
			add("치즈");
		}
	};

	
	// 레시피 대조 확인
	public static String check(ArrayList<String> arr) {
		if (Arrays.equals(arr.toArray(), strawberrySorbet.toArray())) {
			return "딸기셔벗";
		} else if (Arrays.equals(arr.toArray(), wineJelly.toArray())) {
			return "와인젤리";
		} else if (Arrays.equals(arr.toArray(), popcorn.toArray())) {
			return "팝콘";
		} else if (Arrays.equals(arr.toArray(), scrambledEggs.toArray())) {
			return "스크램블에그";
		} else if (Arrays.equals(arr.toArray(), cocoVin.toArray())) {
			return "코코뱅";
		} else if (Arrays.equals(arr.toArray(), porkCutlet.toArray())) {
			return "포크커틀릿";
		} else if (Arrays.equals(arr.toArray(), croquettes.toArray())) {
			return "고로케";
		} else if (Arrays.equals(arr.toArray(), kimchiPancake.toArray())) {
			return "김치전";
		} else if (Arrays.equals(arr.toArray(), hotdog.toArray())) {
			return "핫도그";
		} else if (Arrays.equals(arr.toArray(), ratatouille.toArray())) {
			return "라따뚜이";
		} else if (Arrays.equals(arr.toArray(), jambonBeurre.toArray())) {
			return "잠봉뵈르";
		} else if (Arrays.equals(arr.toArray(), xiaolongbao.toArray())) {
			return "샤오롱바오";
		} else if (Arrays.equals(arr.toArray(), carbonara.toArray())) {
			return "까르보나라";
		} else if (Arrays.equals(arr.toArray(), basilSoup.toArray())) {
			return "바질스프";
		} else if (Arrays.equals(arr.toArray(), caprese.toArray())) {
			return "카프레제";
		} else if (Arrays.equals(arr.toArray(), shrimpPilaf.toArray())) {
			return "새우필라프";
		} else if (Arrays.equals(arr.toArray(), pancake.toArray())) {
			return "팬케이크";
		} else if (Arrays.equals(arr.toArray(), donburi.toArray())) {
			return "규동";
		} else if (Arrays.equals(arr.toArray(), bœufBourguignon.toArray())) {
			return "비프부르기뇽";
		} else if (Arrays.equals(arr.toArray(), spinachQuiche.toArray())) {
			return "시금치키슈";
		} else if (Arrays.equals(arr.toArray(), paella.toArray())) {
			return "빠에야";
		} else if (Arrays.equals(arr.toArray(), beefWellington.toArray())) {
			return "비프웰링턴";
		} else if (Arrays.equals(arr.toArray(), bouillabaisse.toArray())) {
			return "부이야베스";
		} else if (Arrays.equals(arr.toArray(), potAuFeu.toArray())) {
			return "포토푀";
		} else if (Arrays.equals(arr.toArray(), mushroomRavioli.toArray())) {
			return "버섯라비올리";
		} else {
			return "개밥";
		}
	}

}
