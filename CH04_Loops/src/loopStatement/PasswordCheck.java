package loopStatement;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {

		// 유저가 입력한 패스워드와 비교
		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);

		String password = "";

		do {
			System.out.print("비밀번호 입력 > ");
			password = scanner.nextLine();
		} while (!password.equals(USER_PASSWORD)); // 일치하지 않으면 true 반복 → do 계속 실행

		System.out.println("접속 승인!");
		scanner.close();

	}

}
