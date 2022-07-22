package aboutMethod;

public class DatingGrade {

	public static void main(String[] args) {

		String x = grade(4.2, 4.7, 4.3);
		String y = grade(3.8, 4.1, 3.5);
		String z = grade(3.6, 3.0, 3.4);

		System.out.printf("X → %s등급\n", x);
		System.out.printf("Y → %s등급\n", y);
		System.out.printf("Z → %s등급\n", z);

	}

	private static String grade(double personality, double look, double ability) {

		if (personality >= 4.0 && look >= 4.0 && ability >= 4.0) {
			return "A";
		} else if ((personality + look + ability >= 10) && (personality >= 4.0 || look >= 4.0 || ability >= 4.0)) {
			return "B";
		} else {
			return "C";
		}

	}

}
