package application;

import java.util.Random;

/*
 * 랜덤 단어를 생성하는 class
 * 랜덤 단어 생성해주는 사이트 - https://randomwordgenerator.com/
 * /r/n 없애주는 사이트 - https://www.browserling.com/tools/newlines-to-spaces
 */
public class RandomWord {

	private String books = "situation establishment construction conclusion disaster property relationship development percentage supermarket passenger procedure collection department painting advertising reflection president perception baseball permission currency chemistry attention magazine conversation investment replacement combination understanding";
	private String[] words = books.split(" "); // 공백으로 단어들을 분리해서 배열

	private String selectWord;
	private Random random = new Random();
	private char[] characters;

	// 생성자로 생성시 단어가 선택됨
	public RandomWord() {
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()];
	}

	// 단어배열 words에 있는 모든 단어 출력
	public void getWords() {
		for (String word : words) {
			System.out.println(word);
		}
	}

	// 선택된 1개의 단어 리턴
	public String toString() {
		String text = "";
		for (char c : characters) {
			if (c == '\u0000') { // 문자 NULL값의 유니코드
				text += '_';
			} else { // 문자를 맞췄을 때
				text += c;
			}
			text += ' '; // 하나씩 띄워 보기좋게 해줌
		}

		// 3항 연산자 사용
//		for (char c : characters) {
//			text += (c == '\u0000') ? '_' : c;
//			text += ' ';
//		}

//		System.out.println(selectWord); // 임시로 단어를 보여줌
		return text;
	}

	// 입력한 문자와 같은 문자가 있는지 확인
	public void addGuess(char c) {
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}

	public boolean isComplete() {
		for (char c : characters) {
			if (c == '\u0000') {
				return false; // 아직 맞출 문자가 있음
			}
		}
		return true; // 다 맞춤
	}

}
