package try_Catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력 : ");
		String line = scanner.nextLine(); // 문자열 입력

		int number = 0;

		try {
			number = Integer.parseInt(line); // 문자열을 정수로 변환하는 메소드
			System.out.println("입력한 숫자는 : " + number);
		} catch (NumberFormatException e) {
			// 숫자 변환 예외 발생 시 catch문을 실행
			System.out.println("숫자를 입력하세요.");
		}

		scanner.close();

	}

}
