package whatIsClass;

// 한 파일에 여러 개의 클래스 생성 가능
class Person {
	String name = "길동";
	int num = 333;
}

public class ClassAndObject {

	public static void main(String[] args) {

		// 클래스는 설계도로 실제 사용가능한 객체를 생성할 수 있음(메모리에 생성)
		Person p1 = new Person();
		p1.name = "펭수";
		System.out.println(p1.name);

		// 참조 변수
		Person p2;
		Person p3;
		p2 = p1;
		p3 = p2;

		System.out.println(p2.name); // 펭수
		System.out.println(p3.name); // 펭수

		p3.num = 777;

		System.out.println(p1.num); // 777
		System.out.println(p2.num); // 777

		// 모두 같은 주소를 가지고 있는 것을 확인할 수 있음
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		// 새로운 객체를 부여 → 주소가 바뀌어 값이 달라졌음(default값으로)을 알 수 있음
		p2 = new Person();
		System.out.println(p2);
		System.out.println(p2.name);
		System.out.println(p2.num);

	}

}
