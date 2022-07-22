package conditionStatement;

public class CompareStrings {

	public static void main(String[] args) {

		// equals 메소드
		String t1 = "apple";
		String t2 = "Apple";

		System.out.printf("두개의 문자열 일치 : %b\n", t1 == t2);
		System.out.println("두개의 문자열 일치 : " + t1.equals(t2));

	}

}
