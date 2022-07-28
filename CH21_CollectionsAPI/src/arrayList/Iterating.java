package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(9);
		list.add(11);
		list.add(123);

		for (Integer n : list) {
			System.out.println(n);
		}
		System.out.println();

		// arraylist에서는 length 대신 size 사용
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println(i + " : " + n);
		}
		System.out.println();

		// 람다식 사용
		list.forEach(n -> System.out.println(n));

	}

}
