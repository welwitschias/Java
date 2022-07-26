package innerClass;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.print();

		// inner class
		Person.Head head = p1.new Head();
		head.print();

		// static inner class
		Person.Body body = new Person.Body();
		body.print();

	}

}
