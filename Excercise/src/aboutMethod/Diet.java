package aboutMethod;

public class Diet {

	public static void main(String[] args) {

		double weight = 81.6;
		double tall = 1.76;
		double bmi = cal(weight, tall);

		System.out.printf("BMI : %.2f(%.1fkg, %.2fm)\n", bmi, weight, tall);
		System.out.printf("결과 : %s입니다.\n", result(bmi));

	}

	private static String result(double bmi) {

		if (bmi >= 30) {
			return "비만";
		} else if (bmi >= 25) {
			return "과체중";
		} else if (bmi >= 18.5) {
			return "정상";
		} else {
			return "저체중";
		}
	}

	private static double cal(double weight, double tall) {
		return weight / (tall * tall);
	}

}
