package scanner_Problem;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// nextInt() 뒤에 바로 nextLine()이 올 때 인식이 안될 경우
		Scanner scanner = new Scanner(System.in);

		int num;
		String str;

		System.out.print("num 입력 : ");
		num = scanner.nextInt();
		scanner.nextLine(); // 여기서 줄바꿈 문자열(\n)을 제거

		System.out.print("str 입력 : ");
		str = scanner.nextLine(); // 남아있는 줄바꿈 문자열을 인식해서 넘어감

		System.out.println();
		System.out.println("num : " + num);
		System.out.println("str : " + str);

		scanner.close();

	}

}
