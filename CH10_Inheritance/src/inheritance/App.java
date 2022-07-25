package inheritance;

public class App {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.eat();

		// Animal class(부모)의 eat 메소드(상속 받음) 사용가능
		Bird bird = new Bird();
		bird.eat();
		bird.fly();

	}

}
