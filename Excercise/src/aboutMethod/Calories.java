package aboutMethod;

public class Calories {

	public static void main(String[] args) {

		double result = calCalories(5000);
		System.out.print("소모 칼로리: " + result + " kcal\n");

	}

	private static double calCalories(int walk) {
		return 0.02 * walk;
	}

}
