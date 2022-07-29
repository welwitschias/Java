package lambda_Example;

interface Runner {
	void execute();
}

public class App2 {

	public static void main(String[] args) {

		Runner run1 = new Runner() {
			public void execute() {
				System.out.println("하이");
				System.out.println("헬로우");
				System.out.println("람다식");
			}
		};

		run1.execute();
		System.out.println();

		/* 람다식으로 표현 */
		Runner run2 = () -> {
			System.out.println("하이");
			System.out.println("헬로우");
			System.out.println("람다식");
		};

		run2.execute();

		System.out.println(run2 instanceof Runner); // Runner의 객체인가?
		System.out.println(run2.getClass()); // 객체의 class는?

	}

}
