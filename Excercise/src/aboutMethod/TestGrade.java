package aboutMethod;

public class TestGrade {

	public static void main(String[] args) {

		int score1 = 96;
		int score2 = 85;
		int score3 = 76;

		System.out.printf("%d점 → %s\n", score1, grade(score1));
		System.out.printf("%d점 → %s\n", score2, grade(score2));
		System.out.printf("%d점 → %s\n", score3, grade(score3));

	}

	private static String grade(int score) {

		if (score >= 95) {
			return "A+";
		} else if (score >= 90) {
			return "A0";
		} else if (score >= 80) {
			return "B+";
		} else if (score >= 70) {
			return "B0";
		} else {
			return "C+";
		}

	}

}
