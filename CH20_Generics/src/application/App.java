package application;

import collection.Wrapper;
import hierarchy.Cat;
import hierarchy.Mammal;

public class App {

	public static void main(String[] args) {

		Wrapper<Cat> wrapper = new Wrapper<Cat>();

		Cat cat = new Cat("고양이");
		wrapper.set(cat);
		Cat cat2 = wrapper.get();

		System.out.println(cat2);

		// 제네릭 타입은 객체를 만들 때 그 타입을 결정
		Wrapper<Mammal> wrapper2 = new Wrapper<Mammal>();

		Mammal mam = new Mammal("포유류");
		wrapper2.set(mam);
		Mammal mam2 = wrapper2.get();

		System.out.println(mam2);

	}

}
