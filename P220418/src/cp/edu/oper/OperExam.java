package cp.edu.oper;

public class OperExam {

	public static void main(String[] args) {
/*		
		+, -, *, /, %
		/ -> 몫
		% -> 나머지

		10,000초 -> 10000/(60*60) => 시간
		-> 10000/60 => 분
		-> 10000%60 => 초
		int hour = 10000 / (60 * 60);
		int min = 10000 / 60;
		int sec = 10000 % 60;
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);

		int i = 0;
		int j = 0;

		i = i + 1;
		// 대입 연산가
		i += 1;
		// 증감 연산자

		i = i + j++; // i1j1 :2
		i = i + ++j; // :3
*/
		int i = 0;

		i++;
		System.out.println(i);
		++i;
		System.out.println(i);

		System.out.println(++i);

		System.out.println(i++);
		System.out.println(i);

	}

}
