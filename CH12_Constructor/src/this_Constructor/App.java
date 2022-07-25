package this_Constructor;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person("길동");
		Person p3 = new Person("펭수", 20);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
