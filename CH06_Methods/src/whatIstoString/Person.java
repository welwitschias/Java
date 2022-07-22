package whatIstoString;

// 1개의 java file에 public class는 하나뿐이다.
public class Person {

	// 인스턴스 변수에 직접 접근이 되면 안됨 → get, set 메소드 이용
	// private : 다른 클래스에서 접근 불가, public : 다른 클래스에서 사용 가능
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// set 메소드는 필드변수의 값으로 입력받은 값을 넣어준다.
	void setName(String name) {
		this.name = name; // this는 해당 클래스로 만든 객체(인스턴스)
	}

	void setAge(int age) {
		this.age = age;
	}

	// get 메소드
	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	// Ctrl + Space → toString() 선택
	@Override
	public String toString() {
		// 객체의 정보를 리턴
		return "이름 : " + name + ", 나이 : " + age;

	}

}
