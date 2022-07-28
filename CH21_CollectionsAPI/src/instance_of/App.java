package instance_of;

import java.io.Serializable;

class Creature implements Serializable {
	private static final long serialVersionUID = 1L;
}

class Cat extends Creature {
	private static final long serialVersionUID = 1L;
}

public class App {

	public static void main(String[] args) {

		Creature c1 = new Creature();
		Object c2 = c1;
		Cat c3 = new Cat();
		Serializable c4 = (Serializable) c3;

		// a instanceof b : a가 b의 객체가 맞으면 true, 다르면 false
		System.out.println(c1 instanceof Object);
		System.out.println(c1 instanceof Serializable);
		System.out.println(c1 instanceof Creature);
		System.out.println(c1 instanceof Cat);
		System.out.println();

		System.out.println(c2 instanceof Object);
		System.out.println(c2 instanceof Serializable);
		System.out.println(c2 instanceof Creature);
		System.out.println(c2 instanceof Cat);
		System.out.println();

		System.out.println(c3 instanceof Object);
		System.out.println(c3 instanceof Serializable);
		System.out.println(c3 instanceof Creature);
		System.out.println(c3 instanceof Cat);
		System.out.println();

		System.out.println(c4 instanceof Object);
		System.out.println(c4 instanceof Serializable);
		System.out.println(c4 instanceof Creature);
		System.out.println(c4 instanceof Cat);
		System.out.println();

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
