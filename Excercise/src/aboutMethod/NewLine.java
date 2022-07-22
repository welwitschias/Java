package aboutMethod;

public class NewLine {

	public static void main(String[] args) {

		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");

	}

	private static void threeLines() {
		oneline();
		oneline();
		oneline();
	}

	private static void oneline() {
		System.out.println(">");
	}

}
