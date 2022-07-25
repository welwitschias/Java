package method_Overloading;

public class Person {

	public void greet() {
		System.out.println("헬로우~");
	}

	public void greet(String name) {
		System.out.println("헬로우~ " + name);
	}

	public void greet(int height) {
		if (height > 185) {
			System.out.println("키가 크군요!");
		}
		System.out.println("헬로우~");
	}

	public void greet(String name, int height) {
		if (height > 185) {
			System.out.println("키가 크군요!");
		}
		System.out.println("헬로우~ " + name);
	}

}
