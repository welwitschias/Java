package constructor;

public class Person {

	private String name;
	private double height;

	// 기본 생성자는 생략가능
	public Person() {
		// 기본 생성자는 public class명으로 시작
		name = "이름 미상"; // 초기값 지정
		System.out.println("Person 객체(인스턴스)를 생성!"); // 객체가 만들어질 때 실행됨
	}

	// 마우스 우클릭 → Source → Generate Constructor using Fields... : 생성자 매개변수
	public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
		System.out.println("Person 객체(인스턴스)를 생성!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
