package application;

public class CatEx {

	public static void main(String[] args) {

		System.out.printf("고양이 숫자: %s\n", Cat.getCount());

		Cat cat1 = new Cat("마틸다");
		System.out.println(cat1);
		Cat cat2 = new Cat("라이언");
		System.out.println(cat2);
		Cat cat3 = new Cat("울버린");
		System.out.println(cat3);

		System.out.printf("고양이 숫자: %s\n", Cat.getCount());

	}

}
