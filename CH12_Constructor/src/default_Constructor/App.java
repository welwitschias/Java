package default_Constructor;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person("펭수");
		System.out.println(p1);

		// 아무 생성자가 없을 때는 기본 생성자 사용 가능
		// 생성자가 있으면 있는 것을 사용, 기본 생성자 사용하고 싶으면 새로 만들어 줄 것
		Person p2 = new Person();
		System.out.println(p2);

	}

}
