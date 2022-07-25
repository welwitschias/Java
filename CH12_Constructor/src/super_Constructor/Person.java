package super_Constructor;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
		System.out.println("Person 생성자!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
