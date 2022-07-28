package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		// 가장 많이 쓰는 자료 collection type
		ArrayList<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(9);
		list.add(11);
		list.add(123);

		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

	}

}
