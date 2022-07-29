package lambda_Parameter;

interface Runner {
	void execute(String text);
}

public class One_Parameter {

	public static void main(String[] args) {

		Runner run1 = (t) -> System.out.println(t);
		run1.execute("펭수");

		// 매개변수가 1개일 때 () 생략 가능
		Runner run2 = s -> System.out.println(s);
		run2.execute("길동");

	}

}
