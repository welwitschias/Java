package lambda_Example;

public class App {

	public static void main(String[] args) {

		// (매개변수) -> {코드}
		// 코드가 1줄일 경우 {} 생략 가능
		Test test = () -> System.out.println("테스트");
		test.run();

	}

}
