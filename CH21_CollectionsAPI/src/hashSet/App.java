package hashSet;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {

		// Set : 순서가 없고 중복이 안되는 데이터의 집합
		HashSet<String> fruits = new HashSet<>();

		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("배");

		// list에 오렌지가 있는가?
		System.out.println(fruits.contains("오렌지"));

		for (String f : fruits) {
			System.out.println(f);
		}

	}

}
