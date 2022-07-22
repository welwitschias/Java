package whatIsMethod;

public class Person {

	// 인스턴스(필드) 변수 : 클래스 안에 만든 변수, 객체 생성시 생성됨
	String name;
	int age;

	// 메소드 : 클래스 안에 만든 함수, 객체 생성시 생성됨
	// void : return값이 없다.
	void sayHello() {
		System.out.println("Hello!! " + name);
	}

}
