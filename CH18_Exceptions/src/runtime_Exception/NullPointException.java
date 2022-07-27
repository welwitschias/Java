package runtime_Exception;

import java.util.Scanner;

public class NullPointException {

	public static void main(String[] args) {

//		System.out.println(5 / 0); // 오류 발생

		// 위의 오류 해결방안
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

//		Scanner scanner = null; // 객체를 만들지 않고 null 입력
//		scanner.nextLine(); // 오류 발생

		// 위의 오류 해결방안
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.close();

	}

}
