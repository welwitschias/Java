package aboutArrayAndLoops;

public class AEIOU {

	public static void main(String[] args) {

		String sentence = "Programming is fun! right?";
		int[] result = count(sentence);

		System.out.printf("%s\n → 자음 %d개, 모음 %d개", sentence, result[0], result[1]);

	}

	private static int[] count(String str) {

		int conso = 0; // 자음
		int vowel = 0; // 모음

		char[] letters = str.toUpperCase().toCharArray();

		for (int i = 0; i < letters.length; i++) {
			switch (letters[i]) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;

			case ' ':
			case '\t':
			case '\n':
			case ',':
			case '.':
			case '?':
			case '!':
				break;

			default:
				conso++;
				break;
			}
		}
		return new int[] { conso, vowel };
	}

}
