package instanceVariable;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person(); // 객체 생성
		p1.name = "펭수";
		p1.age = 10;

		Person p2 = new Person(); // 객체 생성
		p2.name = "길동";
		p2.age = 17;

		System.out.println(p1);
		System.out.println(p2);

		System.out.println(p1.name);
		System.out.println(p2.name);

		System.out.println(p1.age);
		System.out.println(p2.age);

	}

}
