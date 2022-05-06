package com.yedam.prj220506;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baseball {

	Scanner scanner = new Scanner(System.in);

	public int getRandom() {
		return (int) (Math.random() * 9) + 1;
	}

	public List<Integer> create() {
		List<Integer> comNum = new ArrayList<>();
		while (comNum.size() < 3) {
			int ranNum = getRandom();
			if (comNum.contains(ranNum)) {
				continue;
			} else {
				comNum.add(ranNum);
			}
		}
		return comNum;
	}

	public int howMany(List<Integer> computer, List<Integer> player) {
		int result = 0;
		for (int i = 0; i < player.size(); i++) {
			if (computer.contains(player.get(i))) {
				result += 1;
			}
		}
		return result;
	}

	public int countStrike(List<Integer> computer, List<Integer> player) {
		int strike = 0;
		for (int i = 0; i < player.size(); i++) {
			if (computer.get(i) == player.get(i)) {
				strike += 1;
			}
		}
		return strike;
	}

	public String judgement(List<Integer> computer, List<Integer> player) {
		int total = howMany(computer, player);
		int strike = countStrike(computer, player);
		int ball = total - strike;

		if (total == 0) {
			return "낫싱";
		} else if (strike == 0) {
			return ball + "볼";
		} else if (ball == 0) {
			return strike + "스트라이크";
		}
		return ball + "볼 " + strike + "스트라이크";
	}

	public List<Integer> playerNumber() {
		System.out.println("숫자를 입력해주세요");
		List<Integer> playerNum = new ArrayList<>();
		String input = scanner.next();

		for (String number : input.split("")) {
			playerNum.add(Integer.parseInt(number));
		}
		return playerNum;
	}

	public boolean playagain() {
		System.out.println("축하합니다! 경기를 다시 시작하겠습니까? 다시 시작 : 1, 종료 : 2");
		char answer = scanner.next().charAt(0);
		if (answer == '1') {
			return true;
		}
		return false;
	}

}
