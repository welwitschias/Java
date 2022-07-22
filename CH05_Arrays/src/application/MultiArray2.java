package application;

public class MultiArray2 {

	public static void main(String[] args) {

		// 이중 배열
		String[][] texts = { { "하나", "둘", "셋" }, { "원", "투" }, { "일", "이", "삼", "사" } };

		for (int i = 0; i < texts.length; i++) {

			for (int j = 0; j < texts[i].length; j++) {
				System.out.printf("%s\t", texts[i][j]);
			}
			
			System.out.println();
			
		}

	}

}
