package scanner_Problem;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {

		// nextInt() 뒤에 바로 nextLine()이 올 때 인식이 안될 경우
		Scanner scanner = new Scanner(System.in);

		int num = 0;
		String str;

		System.out.print("num 입력 : ");

		try {
			num = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수를 입력해!");
		}

		System.out.print("str 입력 : ");
		str = scanner.nextLine();

		System.out.println();
		System.out.println("num : " + num);
		System.out.println("str : " + str);

		scanner.close();

	}

}
