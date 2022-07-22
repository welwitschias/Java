package aboutClass;

public class FoodTest {

	public static void main(String[] args) {

		Food chicken = new Food("치킨", 18000);
		Food pizza = new Food("피자", 28000);
		Food sushi = new Food("초밥", 22000);

//		System.out.println(chicken.toString());
//		System.out.println(pizza.toString());
//		System.out.println(sushi.toString());

		Food[] foods = { chicken, pizza, sushi };
		
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i].toString());
		}

	}

}

class Food {

	String name;
	int price;

	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
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

	@Override
	public String toString() {
		return "Food {name: " + name + ", price: " + price + "원}";
	}

}