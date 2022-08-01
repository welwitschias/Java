package snakeGame;

import java.util.Scanner;

public class GameStart {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("=== 게임을 시작합니다. 난이도를 선택해주세요. ===");
		System.out.println("    [1]EASY   [2]NORMAL   [3]HARD    ");
		System.out.println("=====================================");

		/* 난이도 선택하기 : 1~3번 키입력이 아닐 경우 해당 키가 입력될 때까지 반복한다. */
		boolean isNumber = false;

		do {
			String level = scan.nextLine();

			try {
				int number = Integer.parseInt(level);

				switch (level) {
				case "1":
					System.out.println("Easy Mode를 선택하셨습니다.");
					new GameFrame(1);
					break;
				case "2":
					System.out.println("Normal Mode를 선택하셨습니다.");
					new GameFrame(2);
					break;
				case "3":
					System.out.println("Hard Mode를 선택하셨습니다.");
					new GameFrame(3);
					break;
				default:
					System.out.println(number + "번은 올바르지 않은 선택이니 1~3번 중에 다시 입력해 주세요.");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			}
		} while (!isNumber);

		scan.close();
	}

}