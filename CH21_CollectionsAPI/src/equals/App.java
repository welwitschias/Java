package equals;

import java.util.Scanner;

class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	// 마우스 우클릭 → Source → Generate hashCode() and equals()...
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // 같은 객체일 경우 true
		if (obj == null)
			return false; // null일 경우 false
		if (getClass() != obj.getClass())
			return false; // class가 다를 경우 false
		Person other = (Person) obj;
		if (other.name == null)
			return false; // name이 없으면 false
		return this.name.equals(other.name);
	}

}

public class App {

	public static void main(String[] args) {

		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

		// 문자열 비교 시 '==' 사용하지 말고 'equals' 사용 : 주소를 비교하기 때문에
		String s1 = new String("문자열");
		String s2 = "문자열";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		/* */
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력 y/n : ");
		String input = scanner.nextLine();

//		if (input == "y") {
//			System.out.println("예스");
//		}

		if (input.equals("y")) {
			System.out.println("예스");
		}

		scanner.close();

	}

}
