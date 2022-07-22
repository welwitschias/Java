package aboutArrayAndLoops;

public class Bacteria {

	public static void main(String[] args) {

		int[] bacteriaCount = new int[10];

		writeLog(bacteriaCount);
		printLog(bacteriaCount);

	}

	private static void printLog(int[] arr) {
		System.out.printf("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d", arr[i]);
			if (i != arr.length - 1) {
				System.out.printf(", ");
			}
		}
		System.out.printf("]");
	}

	private static void writeLog(int[] logs) {
		for (int i = 0; i < logs.length; i++) {
			logs[i] = (int) Math.pow(2, i);
		}
	}

}
