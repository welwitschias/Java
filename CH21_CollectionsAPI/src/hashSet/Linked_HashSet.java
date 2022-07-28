package hashSet;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {

		// 입력한 순서대로 출력되지만 중복은 안됨
		LinkedHashSet<String> fruits = new LinkedHashSet<>();

		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("배");

		for (String f : fruits) {
			System.out.println(f);
		}

	}

}
