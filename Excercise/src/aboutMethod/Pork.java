package aboutMethod;

public class Pork {

	public static void main(String[] args) {

		int n = 3;
		double result = calories(n);

		System.out.printf("삼겹살 %d인분 : %.2f kcal\n", n, result);

	}

	private static double calories(int server) {
		return server * 180 * 5.179;
	}

}
