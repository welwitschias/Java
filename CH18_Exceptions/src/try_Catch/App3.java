package try_Catch;

import java.util.Scanner;

public class App3 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scanner.close();

	}

	/** 스캐너로 숫자를 입력 받아서 정수로 리턴함 */
	private static int getNumber() {

		int number = 0;
		boolean isNumber = false;

		do {
			System.out.print("숫자를 입력 : ");
			String line = scanner.nextLine();

			try {
				number = Integer.parseInt(line);
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
			}

		} while (!isNumber); // true일 경우 do 다시 실행

		return number;

	}

}
