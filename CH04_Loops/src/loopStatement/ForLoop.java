package loopStatement;

public class ForLoop {

	public static void main(String[] args) {

		// for 반복문 : for (초기값; 조건문; 증감) { 명령문; }
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i: " + i);
//		}

		// 1에서 100까지 합을 출력하라
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
