package aboutMethod;

public class CafeSalary {

	public static void main(String[] args) {

		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);

	}

	private static void printPay(double basePay, int hours) {
		double pay = 0.0;
		if (basePay < 8.00) {
			System.out.println("최저 시급 에러!");
			return;
		}
		if (hours > 60) {
			System.out.println("초과 근무시간 에러!");
			return;
		}
		if (hours > 40) {
			pay = (basePay * 40) + ((basePay * 1.5) * (hours - 40));
		} else {
			pay = basePay * hours;
		}
		System.out.printf("$%.2f\n", pay);
	}

}
