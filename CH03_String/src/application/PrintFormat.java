package application;

public class PrintFormat {

	public static void main(String[] args) {

		// printf("출력서식(%d, %f, %c, %s)", 출력값)
		// %d : 정수, %f : 실수(소수점), %c : 문자, %s : 문자열
		// printf는 println과 달리 한 줄을 띄워주지 않으므로 끝에 \n 붙여줌
		int age = 25;
		String addr = "부산";

		System.out.printf("내 나이는 %d살 입니다.\n", age);
		System.out.printf("내 나이는 %d살 이고, %s에 살고 있습니다.\n", age, addr);

		double pi = 3.141592;

		System.out.printf("파이의 값은 : %.2f\n", pi); // 소수점 2자리
		System.out.printf("파이의 값은 : %.3f\n", pi); // 소수점 3자리
		System.out.printf("파이의 값은 : %.4f\n", pi); // 소수점 4자리

	}

}
