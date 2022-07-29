package lambda_Return;

interface Joiner {
	String join(String text1, String text2);
}

public class App {

	public static void main(String[] args) {

		Joiner joiner1 = (s1, s2) -> {
			String text = s1 + " - " + s2;
			return text;
		};

		System.out.println(joiner1.join("치킨", "맥주"));
		System.out.println(joiner1.join("학원", "공부"));
		System.out.println();

		// 코드가 1줄이면 return 생략 가능
		Joiner joiner2 = (s1, s2) -> s1 + " + " + s2;

		System.out.println(joiner2.join("치킨", "맥주"));
		System.out.println(joiner2.join("학원", "공부"));

	}

}
