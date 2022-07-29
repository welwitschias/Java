package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) {

		File wordsTI = new File("Treasure Island.txt");
		System.out.println(wordsTI.exists());

		TreeSet<String> TI = loadWords(wordsTI);
		System.out.println(TI.size());

		displayWords(TI);

	}

	private static void displayWords(TreeSet<String> list) {
		// 6글자 이상의 단어만 출력 + 6단어마다 줄 바꿈
		int count = 0;
		for (String w : list) {
			if (w.length() <= 6)
				continue; // 특정 조건을 제외할 때 주로 사용
			System.out.printf("%-20s \t", w); // 자릿수(20)만큼 왼쪽(-) 정렬, (+) → 오른쪽 정렬
			count++;
			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}
	}

	private static TreeSet<String> loadWords(File file) {
		// text 파일의 모든 단어들을 set list에 넣어서 return
		TreeSet<String> wordSet = new TreeSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");
				for (String word : words) {
					wordSet.add(word.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못함");
		} catch (IOException e1) {
			System.out.println("파일을 읽지 못함");
		}

		return wordSet;
	}

}
