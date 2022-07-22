package conditionStatement;

import java.util.Scanner;

public class PasswordCheck2 {

	public static void main(String[] args) {

		// 유저가 입력한 패스워드와 비교
		final String USER_PASSWORD = "hello";

		System.out.print("비밀번호 입력 > ");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();

		if (password.equals(USER_PASSWORD)) {
			System.out.println("접속 승인");
		} else {
			System.out.println("접속 불가");
		}

	}

}
