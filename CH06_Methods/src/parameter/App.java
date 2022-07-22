package parameter;

public class App {

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		int number1 = 5;
		int number2 = 11;
		int number3 = 29;

		int result = calc.square(number1);
		System.out.printf("%d의 제곱은 %d이다.\n", number1, result);

		result = calc.plus(number2, number3);
		System.out.printf("%d더하기 %d는 %d이다.\n", number2, number3, result);

		result = calc.minus(number3, number1);
		System.out.printf("%d빼기 %d는 %d이다.\n", number3, number1, result);

		result = calc.plus(22, 25);
		System.out.printf("두 수의 합은 %d이다.\n", result);

	}

}
