package aboutArrayAndLoops;

public class ThreeCombos {

	public static void main(String[] args) {

		printCombos(24);

	}

	private static void printCombos(int num) {
		int count = 0;

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				for (int k = 0; k <= num; k++) {
					if (i * j * k == num) {
						System.out.printf("%d = %d × %d × %d\n", num, i, j, k);
						count++;
					}
				}
			}
		}
		System.out.println("====================");
		System.out.printf("경우의 수 : %d\n", count);
	}

}
