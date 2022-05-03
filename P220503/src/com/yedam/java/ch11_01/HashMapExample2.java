package com.yedam.java.ch11_01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);

		// new 연산자로 인해 물리적으로 다른 객체 이므로 엔트리수 2~ 해시코드, 이퀄즈 오버라이딩
		System.out.println("총 Entry 수 : " + map.size());

	}

}
