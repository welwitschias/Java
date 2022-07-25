package method_Overloading;

public class App {

	public static void main(String[] args) {

		// 메소드 오버로딩 : 메소드의 이름은 같지만 매개변수가 다를 때
		Person person = new Person();

		person.greet();
		person.greet("펭수");
		person.greet(190);
		person.greet("라이언", 195);

	}

}
