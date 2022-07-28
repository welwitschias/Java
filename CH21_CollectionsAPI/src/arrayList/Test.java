package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// ArrayList 사용
		ArrayList<Double> numbers = new ArrayList<>();

		double total = 0;

		while (true) {
			System.out.print("숫자 또는 'q' 입력 > ");
			String input = scanner.nextLine();
			input = input.trim(); // 공백 삭제

			if (input.equalsIgnoreCase("q")) {
				break;
			}

			try {
				double value = Double.parseDouble(input); // 실수로 변환
				numbers.add(value);
				total += value; // 평균값 구하는 첫번째 방법
			} catch (NumberFormatException e) {
				System.out.println("실수를 입력하세요");
				continue;
			}
		}

		scanner.close();
		System.out.println();

		Collections.sort(numbers); // 정렬

		if (numbers.size() > 0) {
			System.out.println("입력된 숫자 : ");

			for (Double number : numbers) {
				System.out.printf("%.2f\n", number);
//				total += number; // 평균값 구하는 두번째 방법
			}

			System.out.println();
			double avg = total / numbers.size();
			System.out.printf("평균값 : %.2f", avg);
		} else {
			System.out.println("입력된 실수가 없습니다.");
		}

	}

}
