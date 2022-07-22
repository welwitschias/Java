package integerVariable;

public class IntLiteral {

	public static void main(String[] args) {

		// 정수 : 기본적으로 int형으로 처리
		int a = 101; // 10진수
		int b = 0146; // 8진수 : 0으로 시작
		int c = 0x1C2B; // 16진수 : 0x로 시작
		int d = 0b1111; // 2진수 : 0b로 시작

		long l = 123144321564845L; // long 접미사 L을 끝에 붙임

		// 자바는 수를 변수에 저장하기 전에 그 수를 메모리에 저장하는데,
		// 저장하는 형태가 무조건 int형임. 위의 수는 너무 커서 컴파일 에러가 발생함
		// 접미사 L을 붙이면 이 수를 int형이 아닌 long형으로 나타내라고 지시를 하는 것

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(l);

	}

}
