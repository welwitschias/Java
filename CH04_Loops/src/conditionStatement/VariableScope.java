package conditionStatement;

import java.util.Scanner;

public class VariableScope {

	public static void main(String[] args) {

		// 변수의 범위는 코드블록{} 으로 결정
		{
			int value = 0;
			System.out.println(value);
		}

		// System.out.println(value); // 사용 불가

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		// for문 안에 쓰인 변수 i는 밖에서 쓸 수 없음 (지역변수)
		// System.out.println(i);

		Scanner scanner = new Scanner(System.in);

		String input = "";
		do {
			System.out.println("종료할려면 'quit'를 입력하세요");
			input = scanner.nextLine();
		} while (!input.equals("quit"));

		scanner.close();

	}

}
