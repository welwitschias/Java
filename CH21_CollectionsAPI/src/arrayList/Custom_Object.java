package arrayList;

import java.util.ArrayList;

public class Custom_Object {

	public static void main(String[] args) {

		// Person class를 list에 넣기
		ArrayList<Person> people = new ArrayList<>();

		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));

		for (Person p : people) {
			System.out.println(p.toString());
		}
		System.out.println();

		// 인덱스 1번의 객체를 수정
		people.set(1, new Person("마이클"));

		for (Person p : people) {
			System.out.println(p.toString());
		}

	}
}
