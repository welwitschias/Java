package application;

import java.util.Scanner;

// 전체 Game을 실행하는 class
public class Hangman {

	Scanner scanner = new Scanner(System.in);
	private boolean running = true;
	private RandomWord word = new RandomWord();

	public void run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput(); // 맞으면 running → false
		} while (running);
	}

	public void displayWord() {
		System.out.println(word.toString()); // 랜덤으로 선택된 단어 출력
	}

	public void getUserInput() {
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine(); // 유저가 입력한 문자열 받음
		word.addGuess(guess.charAt(0)); // 문자열에서 첫번째 문자만 받음
	}

	public void checkUserInput() {
		if (word.isComplete()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 : " + word.toString());
			running = false; // 반복문 종료
		}
	}

	public void close() {
		scanner.close();
	}

}
