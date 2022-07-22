package application;

public class MultiArray {

	public static void main(String[] args) {

		// 이중 배열
		String[][] texts = { { "하나", "둘", "셋" }, { "원", "투" }, { "일", "이", "삼", "사" } };

		for (int i = 0; i < texts.length; i++) {
//			System.out.println(texts[i]);
//			System.out.println(texts[i].length); // 3, 2, 4
			String[] innerArray = texts[i];

			for (int j = 0; j < innerArray.length; j++) {
				System.out.printf("%s\t", innerArray[j]);
			}
			
			System.out.println();
			
		}

	}

}
