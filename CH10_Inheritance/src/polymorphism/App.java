package polymorphism;

public class App {

	public static void main(String[] args) {

		// 상속 받은 경우 부모 class로 선언이 가능함
		Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();

		Cat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();

		Cat cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();

		// 배열로 만들어서 사용
		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger() };

		cats[0].vocal();
		cats[0].hunt();

		cats[1].vocal();
		cats[1].hunt();

		cats[2].vocal();
		cats[2].hunt();

		// for 반복문 사용
		for (int i = 0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}

		// for each 반복문 사용
		for (Cat c : cats) {
			c.vocal();
			c.hunt();
		}

		// casting
		Cat cat11 = new HouseCat(); // 부모 타입으로 선언 (업캐스팅)
		HouseCat cat12 = (HouseCat) cat11; // 다시 자식 타입으로 선언 (다운캐스팅)

//		cat11.callMaster(); // 부모 타입으로 선언했을 때 부모 타입이 사용 가능한 메소드만 가능
		cat12.callMaster(); // 자식 타입으로 선언했으므로 사용 가능

	}

}
