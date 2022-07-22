package aboutArrayAndLoops;

public class Factorial {

	public static void main(String[] args) {

		printFatorical(4);
		printFatorical(7);

	}

	private static void printFatorical(int num) {
		long result = 1;
		System.out.printf("%d! = ", num);
		for (int i = num; i > 0; i--) {
			result = result * i;
			if (i != 1) {
				System.out.printf("%d × ", i);
			} else {
				System.out.printf("%d", i);
			}
		}
		System.out.printf(" = %d\n", result);
	}

}
