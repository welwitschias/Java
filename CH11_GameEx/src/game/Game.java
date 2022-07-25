package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissor;

public class Game {

	// 가위, 바위, 보 객체를 objects 배열에 저장
	GameObject[] objects = { new Scissor(), new Rock(), new Paper() };
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	public void run() {
		System.out.println("삼세판 게임을 시작합니다.");
		System.out.println();

		int wins = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "번째 게임 시작");

			System.out.print("가위(0), 바위(1), 보(2) 중 숫자로 선택 : ");
			GameObject ob1 = objects[scanner.nextInt()]; // 유저가 입력
			GameObject ob2 = objects[random.nextInt(objects.length)];

			System.out.println("당신의 선택은 : " + ob1.getName());
			System.out.println("컴퓨터의 선택은 : " + ob2.getName());
			System.out.println();

			int score = ob1.compareTo(ob2);
			wins = wins + score;
		}

		// 누가 이겼는지 확인
		if (wins > 0) {
			System.out.println("승리하였습니다.");
		} else if (wins < 0) {
			System.out.println("패배하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}

		scanner.close();
	}

}
