package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person> {

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}

}

public class App {

	public static void main(String[] args) {

		// 정렬 기능 추가
		// Person class → Comparable 인터페이스 추가 → 비교 기준 추가
		TreeSet<Person> people = new TreeSet<>();

		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));

		for (Person p : people) {
			System.out.println(p);
		}

	}

}
