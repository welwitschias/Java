package overriding;

public class Tiger extends Cat {

	// 마우스 우클릭 → Source → Override/Implement methods...
	@Override
	public void vocal() {
		System.out.println("어흥!");
	}

	@Override
	public String toString() {
		return "호랑이";
	}

}
