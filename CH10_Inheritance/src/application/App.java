package application;

// 다른 패키지의 클래스들을 불러온다.
import entities.Fruit;
import entities.Apple;
import entities.Banana;

public class App {

	public static void main(String[] args) {

		Fruit f1 = new Apple();
//		f1.id = 10; // 패키지도 다르고 App class가 자식 클래스도 아님
		System.out.println(f1);

		Fruit f2 = new Banana();
		System.out.println(f2);

	}

}
