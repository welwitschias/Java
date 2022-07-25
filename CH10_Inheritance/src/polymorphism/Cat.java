package polymorphism;

// 모든 class는 Object class를 상속 받음
public class Cat {

	public void vocal() {
		System.out.println("야옹~");
	}

	public void hunt() {
		System.out.println("사냥중...");
	}

	@Override
	public String toString() {
		// Object class의 toString 메소드를 Overriding
		return "고양이";
	}

}
