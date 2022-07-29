package lambda_Interface;

import java.util.function.Predicate;

public class Predicate_Interface {

	public static void main(String[] args) {

		// Predicate : <generic> type을 검사해서 boolean값으로 return
		Predicate<String> p1 = new Predicate<>() {
			public boolean test(String s) {
				return s.length() < 4; // 문자열의 길이가 4미만이면 true
			}
		};

		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("하나둘"));
		System.out.println();

		/* 람다식으로 표현 */
		Predicate<String> p2 = s -> s.length() < 4;

		System.out.println(p2.test("abcd"));
		System.out.println(p2.test("하나둘"));

	}

}
