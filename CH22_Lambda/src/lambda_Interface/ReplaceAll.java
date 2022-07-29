package lambda_Interface;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.UnaryOperator;

public class ReplaceAll {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);

//		numbers.replaceAll(new UnaryOperator<Integer>() {
//			public Integer apply(Integer n) {
//				return n * n;
//			}
//		});

		/* 람다식으로 표현 */
		numbers.replaceAll(n -> n * n); // 원래 숫자의 제곱으로 리턴
		numbers.forEach(n -> System.out.println(n));
		System.out.println();

		List<String> friends = new ArrayList<>();

		friends.add("펭수");
		friends.add("길동");
		friends.add("메리");
		friends.add("철수");

		friends.replaceAll(s -> "안녕! " + s);
		friends.forEach(s -> System.out.println(s));

	}

}
