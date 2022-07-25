package overriding;

public class App {

	public static void main(String[] args) {

		HouseCat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();

		RoadCat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();

		Tiger cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();

		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3.toString());

	}

}
