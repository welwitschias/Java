package default_Constructor;

public class Person {

	private String name;

	// 기본생성자 재생성
	public Person() {
		System.out.println("person 객체 생성");
	}
	
	// 매개변수 있는 생성자
	public Person(String name) {
		System.out.println("person 객체 생성");
		this.name = name;
	}

	@Override
	public String toString() {
		return "헬로우 " + name;
	}
	
}
