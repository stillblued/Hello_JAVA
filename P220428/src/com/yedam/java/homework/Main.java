package com.yedam.java.homework;

public class Main {

/*
	
Question1] 다음과 같이 실행코드가 있는 경우 발생할 수 있는 예외가 무엇인지 채워넣으세요.
1) 실행코드
class Question1 {
	public static void main(String[] args){
		String[] strArray = { "10" , "2a" };
		int value = 0;
		for(int i = 0; i <= 2; i++ ){
    	try{
        	value = Integer.parseInt(strArray[i]);
        } catch(                           e){
        	System.out.println("           ");
        } catch(                           e) {
        	System.out.println("           ");
        } finally {
        	System.out.println(value);
        }
    }
}
}

Question 2] 다음과 같이 출력결과가 나오도록 실행코드를 수정하세요.
1) 실행코드
class Question4 {
	public static void main(String[] args){
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;
		
		// 사용자입력을 저장할 공간
		int input = 0; 

		// 시도횟수를 세기 위한 변수
		int count = 0; 
		
		do{
			
			//출력결과를 실행하는 코드부분
		
		}while(true);
	}
}

2) 출력결과
	1과 100사이의 값을 입력하세요 : 50
	더 작은 수를 입력하세요.
	1과 100사이의 값을 입력하세요 : asdf
	유효하지 않은 값입니다. 다시 값을 입력해주세요.
	1과 100사이의 값을 입력하세요 : 25
	더 큰 수를 입력하세요.
	1과 100사이의 값을 입력하세요 : 38
	더 큰 수를 입력하세요.
	1과 100사이의 값을 입력하세요 : 44
	맞췄습니다.
	시도횟수는 5번입니다.
	
3) 조건
	try~catch문을 이용하여 "유효하지 않은 값입니다. 다시 값을 입력해주세요."를 출력하세요.

Plus 1] 다음과 같이 출력결과가 나오도록 실행코드를 수정하세요.
1) 실행코드
class Question2 {

	public static void main(String[] args) {
	
		method1();
		System.out.println(1);
		
		System.out.println(2);
		
		System.out.println(3);
		
		System.out.println(4);

	}
	
	public static void method1(){
		throw new NullPointerException();
	}
}

2) 출력결과
	3	
	4

3) 조건
	try~catch~finally문 사용

Plus 2] 다음과 같이 출력결과가 나오도록 실행코드를 수정하세요.
1) 실행코드
class Question3 {
	public static void main(String[] args) {

		method(true);
		method(false);

	}
	
	public static void method(boolean value){
		System.out.println(1);
		
		if(value){
			throw new RuntimeException();
		}
		
		System.out.println(2);
		
		System.out.println(3);
		
		System.out.println(4);
		
		System.out.println(5);
		
		System.out.println(6);
	}
	
}

2) 출력결과
	1
	3
	5
	1
	2
	5
	6

3) 조건
	다중 catch문 사용


	
*/
	
}
