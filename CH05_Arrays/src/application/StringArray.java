package application;

public class StringArray {

	public static void main(String[] args) {

		// 문자열로 이루어진 배열
		String[] animals = { "고양이", "개", "펭귄", "사자" };
		
		System.out.println(animals[0]); // 고양이
		System.out.println(animals[1]); // 개
		System.out.println(animals[2]); // 펭귄
		System.out.println(animals[3]); // 사자
		
		// 배열에 있는 값을 바꾸는 방법
		animals[0] = "닭";
		
		System.out.println(animals[0]); // 고양이 → 닭
		System.out.println(animals[1]); // 개
		System.out.println(animals[2]); // 펭귄
		System.out.println(animals[3]); // 사자

	}

}
