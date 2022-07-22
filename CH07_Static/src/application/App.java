package application;

public class App {

	public static void main(String[] args) {

		// static(클래스) 상수는 객체 생성 없이 class.상수로 사용
		// 수학 공식과 같이 바뀔 일이 없는 것에 사용
		System.out.println(Cat.FOOD);

		// 수학 공식 : Math class (기본 내장)
		System.out.println(Math.PI);

		System.out.println(Cat.getCount());
		Cat cat1 = new Cat("마틸다"); // count : +1
		System.out.println(cat1);
		System.out.println(Cat.getCount());
		Cat cat2 = new Cat("라이언"); // count : +1
		System.out.println(cat2);
		System.out.println(Cat.getCount());
		Cat cat3 = new Cat("울버린"); // count : +1
		System.out.println(cat3);
		System.out.println(Cat.getCount());

//		App app = new App();
//		app.sayHi();
		sayHi(); // 같은 class에서는 class명 생략 가능(단, static 붙어야 함)
		hello(); // 왼쪽 오류창 클릭해서 method 자동으로 생성하면 됨

	}

	private static void hello() {
		System.out.println("헬로우~!");
	}

	private static void sayHi() {
		System.out.println("안녕~!");
	}

}
