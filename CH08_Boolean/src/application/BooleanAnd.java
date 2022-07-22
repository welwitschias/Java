package application;

public class BooleanAnd {

	public static void main(String[] args) {

		// 비교 및 논리 연산자 : ==, !=, !, &&, ||

		boolean isRaining = false;
		boolean haveUmbrella = true;
		boolean takeUmbrella = false;

		// 1
		if (isRaining) {
			if (haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("첫번째 : " + takeUmbrella);

		// 2
		if (isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("두번째 : " + takeUmbrella);

		// 3
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println("세번째 : " + takeUmbrella);

	}

}
