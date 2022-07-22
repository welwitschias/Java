package integerVariable;

public class Casting {

	public static void main(String[] args) {

		// 자동 형변환 : 범위가 더 큰 자료형으로 자동 변환
		byte a = 32;
		short b = a; // 1 byte로 저장된 값을 2 byte로 변환
		int c = b; // 2 byte로 저장된 값을 4 byte로 변환
		long d = c; // 4 byte로 저장된 값을 8 byte로 변환
		// int x = d; // 큰 type을 작은 type에 넣을 수 없음

		float e = 1.12f;// 실수의 기본 type은 double이기 때문에 접미사 f를 붙임
		double f = e; // 4 byte로 저장된 값을 8 byte로 변환

		System.out.println(d + f); // 주의 표시 없애주는 용도

		// 명시적 형변환 (원할 때)
		long g = 1000000;
		int h = (int) g; // 8 byte로 저장된 값을 4 byte로 변환
		short i = (short) h; // 4 byte로 저장된 값을 2 byte로 변환

		System.out.println(i); // 큰 type에서 작은 type으로 변환 시 손실 가능성 있음

	}

}
