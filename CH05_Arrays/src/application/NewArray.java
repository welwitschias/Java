package application;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// new 키워드로 배열 만들기
		int[] numbers = new int[3]; // 3개의 int형 배열을 넣을 수 있는 방만 생성

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자를 입력 : ");
			numbers[i] = scanner.nextInt();
		}

		System.out.println("입력한 값은");

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			sum = sum + numbers[i];
		}

		System.out.print("합 : " + sum);

		scanner.close();

	}

}
