package regularExpression;

import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {

		System.out.println("Cat".matches("cat")); // false
		System.out.println("Cat".matches("Cat")); // true

		System.out.println("Cat".toLowerCase().matches("cat")); // true

		// [aA] : a 또는 A가능
		System.out.println("Cat".matches("[Cc]at")); // true

		// [a-z] : 소문자 a부터 z까지 가능, [A-Z] : 대문자 A부터 Z까지 가능
		System.out.println("Cat".matches("[a-dA-D]at")); // true

		// [^c] : 소문자 c만 제외하고 가능, [^C] : 대문자 C만 제외하고 가능
		System.out.println("Cat".matches("[^c]at")); // true
		System.out.println("Cat".matches("[^C]at")); // false

		// \w : 하나의 알파벳 또는 숫자 + 언더바(_) (자바에서는 \\w)
		System.out.println("Cat".matches("\\w\\w\\w")); // true

		// {n} : 정확히 n개, + : 1개 이상
		System.out.println("Cat".matches("\\w{3}")); // true
		System.out.println("Cat".matches("\\w+")); // true

		// 전화번호
		// \d : 하나의 숫자 (자바에서는 \\d), {n, m} : n개부터 m개까지, | : 정규식에서는 or의 뜻
		System.out.println("010-1234-5678".matches("(02|051|010)-\\d{3,4}-\\d{4}")); // true

		String regexPN = "(02|051|010)-\\d{3,4}-\\d{4}";
		String phoneNumber = "010-1234-5678";

		boolean resultPN = Pattern.matches(regexPN, phoneNumber);

		if (resultPN) {
			System.out.println("올바른 전화번호 형식입니다.");
		} else {
			System.out.println("올바르지 않은 전화번호 형식입니다.");
		}

		// 이메일
		String regexEmail = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String email = "angel@naver.com";

		boolean resultEmail = Pattern.matches(regexEmail, email);

		if (resultEmail) {
			System.out.println("올바른 이메일 형식입니다.");
		} else {
			System.out.println("올바르지 않은 이메일 형식입니다.");
		}

	}

}
