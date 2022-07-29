package lambda_Parameter;

interface Runner2 {
	void execute(String name, String text);
}

public class Two_Parameters {

	public static void main(String[] args) {

		Runner2 run = (n, t) -> System.out.printf("%s님 %s\n", n, t);
		run.execute("펭수", "안녕하세요.");

		// 메소드로 사용하기
		greet(run);

	}

	private static void greet(Runner2 run) {
		run.execute("길동", "안녕하세요.");
	}

}
