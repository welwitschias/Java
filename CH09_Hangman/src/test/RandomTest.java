package test;

import java.util.Random;

import application.RandomWord;

public class RandomTest {

	public static void main(String[] args) {

		RandomWord randomWord = new RandomWord();
//		randomWord.getWords();
		System.out.println(randomWord.toString());

		// 랜덤으로 한 단어를 가져오기
		Random random = new Random();
		String[] friends = { "라이언", "어피치", "무지", "프로도", "네오", "콘" };

		for (int i = 0; i < 30; i++) {
			int randomIndex = random.nextInt(friends.length);
			System.out.println(friends[randomIndex]);
		}

	}

}
