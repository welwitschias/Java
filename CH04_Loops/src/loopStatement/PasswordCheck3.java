package loopStatement;

import java.util.Scanner;

public class PasswordCheck3 {

	public static void main(String[] args) {

		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 ﻿맞으면 '접속승인' 출력하고 반복문을 빠져나옴
		// 패스워드 3회 틀릴시 '접속거부'
		final String USER_PASSWORD = "hello";
		Scanner scanner = new Scanner(System.in);
		boolean accessOK = false; // 플래그(flag) : 불린변수로 상태에 따라 처리흐름 제어

		String password = "";
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("비밀번호 입력 > ");
			password = scanner.nextLine();
			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				accessOK = true;
				break;
			}
		}

		if (!accessOK) {
			System.out.println("접속거부");
		}

		scanner.close();
	}

}
