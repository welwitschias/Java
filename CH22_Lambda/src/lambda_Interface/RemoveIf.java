package lambda_Interface;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Predicate;

public class RemoveIf {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);

//		numbers.removeIf(new Predicate<Integer>() {
//			public boolean test(Integer n) {
//				return n < 6;
//			}
//		});

//		numbers.forEach(new Consumer<Integer>() {
//			public void accept(Integer n) {
//				System.out.println(n);
//			}
//		});

		/* 람다식으로 표현 */
		numbers.removeIf(n -> n < 6); // 숫자를 검사해서 참(6 미만)이면 삭제
		numbers.forEach(n -> System.out.println(n));

	}

}
