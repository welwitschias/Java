package loopStatement;

public class DoWhileLoop {

	public static void main(String[] args) {

		// do while 반복문의 처음 한 번은 조건과 상관없이 실행
		int count = 10000;

		System.out.println("do while 반복문");

		do {
			System.out.println("Count: " + count);
		} while (count++ < 5);

	}

}
