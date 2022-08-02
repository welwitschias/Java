package aboutClass;

public class FoodTest {

	public static void main(String[] args) {

		/* food 객체 생성 */
		Food chicken = new Food("치킨", 18000);
		Food pizza = new Food("피자", 28000);
		Food sushi = new Food("초밥", 22000);

		/* 생성된 객체들 배열에 담기 */
		Food[] foods = { chicken, pizza, sushi };

		/* 음식들 정보 출력 */
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i].toString());
		}

//		System.out.println(chicken.toString());
//		System.out.println(pizza.toString());
//		System.out.println(sushi.toString());

	}

}

class Food {

	/* 변수 생성 */
	String name;
	int price;

	/* 생성자 추가 */
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	/* toString Method */
	@Override
	public String toString() {
		return "Food {name: " + name + ", price: " + price + "원}";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}