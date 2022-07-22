package aboutMethod;

public class Gamble {

	public static void main(String[] args) {

		double dollar = dice() + dice() + dice();
//		double won = exchange(dollar);
		double won = dollar * 1082.25108;
		
		System.out.printf("획득 금액 : $%.2f(%.0f)원\n", dollar, won);

	}

//	private static double exchange(double dollar) {
//		return dollar * 1082.25108;
//	}

	private static int dice() {
		return (int) (Math.random() * 6) + 1;
	}

}
