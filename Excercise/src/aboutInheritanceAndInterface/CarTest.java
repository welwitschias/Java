package aboutInheritanceAndInterface;

public class CarTest {

	public static void main(String[] args) {

		Car c = new Car("티코");
		Car t = new Truck("봉고", 1.5);

		System.out.println(c.toString());
		System.out.println(t.toString());

	}

}

class Car {
	protected String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("[자동차] {name: %s}", name);
	}
}

class Truck extends Car {
	protected double ton;

	public Truck(String name, double ton) {
		super(name);
		this.ton = ton;
	}

	@Override
	public String toString() {
		return String.format("[트럭] {name: %s, ton: %.1f}", name, ton);
	}
}