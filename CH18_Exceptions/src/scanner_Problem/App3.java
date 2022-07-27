package scanner_Problem;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {

		// nextInt() 뒤에 바로 nextLine()이 올 때 인식이 안될 경우
		Scanner scanI = new Scanner(System.in);
		Scanner scanS = new Scanner(System.in);

		int num;
		String str;

		System.out.print("num 입력 : ");
		num = scanI.nextInt();

		System.out.print("str 입력 : ");
		str = scanS.nextLine();

		System.out.println();
		System.out.println("num : " + num);
		System.out.println("str : " + str);

		scanI.close();
		scanS.close();

	}

}
