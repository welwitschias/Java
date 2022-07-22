package application;

public class StringMethod {

	public static void main(String[] args) {

		// charAt(indexNumber) : index번호에 해당하는 문자가 반환됨
		String text1 = "ABCDE";
		System.out.println(text1.charAt(0)); // A
		System.out.println(text1.charAt(1)); // B
		System.out.println(text1.charAt(2)); // C
		System.out.println(text1.charAt(3)); // D
		System.out.println(text1.charAt(4)); // E

		// compareTo : 문자열 알파벳 비교
		String word1 = "abcde";
		String word2 = "abcdd";
		System.out.println(word1.compareTo(word2));

		// contains(문자열) : 문자열이 포함하고 있는지 확인
		String text2 = "오늘 점심은 돈까스다.";
		System.out.println(text2.contains("돈까스"));
		System.out.println(text2.contains("돈까스요"));

		// concat : 문자열 합치기
		System.out.println(word1.concat(word2));

		// StringBuilder를 사용해 문자열 합치기
		String finalString = new StringBuilder().append(word1).append(word2).toString();
		System.out.println(finalString);

		// String.format() : printf("%s", 변수) 대신 출력하지 않고 문자열 형식을 만들어 줌
		String formatString = String.format("%s %s", word1, word2);
		System.out.println(formatString);
		System.out.printf("%s %s\n", word1, word2);

		// substring() : 문자열 잘라내기
		String text = "apple";
		String newText1 = text.substring(1);
		System.out.println(newText1);
		String newText2 = text.substring(1, 3);
		System.out.println(newText2);

		// indexOf() : 특정 문자열의 인덱스 번호 반환
		String myText = "abcdef";
		System.out.println(myText.indexOf('c'));
		System.out.println(myText.indexOf('e'));

	}

}
