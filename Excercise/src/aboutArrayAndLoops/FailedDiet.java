package aboutArrayAndLoops;

public class FailedDiet {

	public static void main(String[] args) {

		weight(72.4, 5);
		weight(65.1, 9);
		weight(83.8, 3);
		weight(77.6, 7);

	}

	private static void weight(double initWeight, int months) {
		double expWeight = initWeight;
		for (int i = 0; i < months; i++) {
			expWeight = expWeight + 0.231;
		}
		System.out.printf("%d개월 후 예상 몸무게 : %.2fkg\n", months, expWeight);
	}

}
