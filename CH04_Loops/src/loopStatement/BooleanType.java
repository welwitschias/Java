package loopStatement;

public class BooleanType {

	public static void main(String[] args) {

		// 불린 타입은 참(true) 또는 거짓(false)
		boolean condition1 = false;
		System.out.println("조건1: " + condition1);

		boolean condition2 = 4 < 5; // true
		System.out.println("조건2: " + condition2);

		boolean condition3 = 2 > 8; // false
		System.out.println("조건3: " + condition3);

		// == 같다, != 같지않다, >=, <=
		boolean condition4 = 9 == 10;
		System.out.println("조건4: " + condition4);
		System.out.printf("조건4: %b", condition4);

	}

}
