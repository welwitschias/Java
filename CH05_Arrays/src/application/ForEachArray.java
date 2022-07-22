package application;

public class ForEachArray {

	public static void main(String[] args) {

		String[] fruits = { "바나나", "사과", "수박" };
		int[] numbers = { 10, 20, 30 };

		for (String f : fruits) {
			System.out.println(f);
		}

		for (int n : numbers) {
			System.out.println(n);
		}

	}

}
