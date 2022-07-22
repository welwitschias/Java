package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// Scanner 적고 Ctrl + Space 한 후 java.util 선택
		Scanner scanner = new Scanner(System.in);
		System.out.print("온도를 입력해 주세요 : ");

//		double c1 = scanner.nextInt(); // 정수만 입력 가능
//		double f1 = (c1 * (9 / 5)) + 32;

//		System.out.println("섭씨 " + c1 + "는 화씨 " + f1 + "이다.");

		double c2 = scanner.nextFloat(); // 실수(소수점) 입력 가능
		double f2 = (c2 * (9 / 5)) + 32;

		System.out.printf("섭씨 %.2f는 화씨 %.2f이다.", c2, f2);

		scanner.close();

	}

}
