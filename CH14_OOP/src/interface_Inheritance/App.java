package interface_Inheritance;

public class App {

	public static void main(String[] args) {

		// interface는 객체를 만들지 못함, 상속 받으면 가능
		DefaultRunnable m1 = new Machine();
		m1.run();
		m1.displayDetails();
		m1.hello();

	}

}
