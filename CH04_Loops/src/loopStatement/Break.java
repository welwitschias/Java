package loopStatement;

public class Break {

	public static void main(String[] args) {

		// break : 반복문에서 빠져나옴
		int count = 0;

		while (true) {
			System.out.println("헬로우. " + count);
			if (count == 5) {
				break;
			}
			System.out.println("하 아 유.");
			count++;
		}
		System.out.println("프로그램 종료.");

	}

}
