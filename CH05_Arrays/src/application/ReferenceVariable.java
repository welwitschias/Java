package application;

public class ReferenceVariable {

	public static void main(String[] args) {

		// String은 참조 자료형, 참조 변수는 기본적으로 주소값을 가진다.
		String text = null; // null : 주소값이 없음
		text = "Hello!";
		System.out.println(text);

		String[] texts = null;
		System.out.println(texts);

		texts = new String[3];
		System.out.println(texts); // 주소값 반환
		System.out.println(texts[0]);
		System.out.println();

		texts[0] = new String("하이!");
		texts[1] = "안녕?";
		texts[2] = "굿바이~";

		for (String w : texts) {
			System.out.println(w);
		}

	}

}
