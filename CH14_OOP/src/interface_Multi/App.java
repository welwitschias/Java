package interface_Multi;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.greet();
		p1.speak();
		
		Greeter p2 = new Person();
		p2.greet();
//		p2.speak();
		
		Speaker p3 = new Person();
//		p3.greet();
		p3.speak();

	}

}
