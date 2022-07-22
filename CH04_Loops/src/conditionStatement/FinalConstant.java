package conditionStatement;

public class FinalConstant {

	public static void main(String[] args) {

		// final이 붙은 변수 → 상수
		// 상수는 전체를 대문자로 작성
		final int VALUES = 9;
		// VALUES = 99; // 수정 불가
		System.out.println(VALUES);

		final String USER_PASSWORD = "abc";
		// USER_PASSWORD = "ABCDEFGH"; // 수정불가

		System.out.println(USER_PASSWORD);

	}

}
