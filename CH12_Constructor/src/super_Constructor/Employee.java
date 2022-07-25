package super_Constructor;

public class Employee extends Person {
	
	public Employee() {
		super("익명"); // 생략됨, 부모 클래스 Person의 생성자를 불러 옴
		System.out.println("Employee 생성자!");
	}
	
}
