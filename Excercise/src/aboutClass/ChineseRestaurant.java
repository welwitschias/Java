package aboutClass;

public class ChineseRestaurant {

	public static void main(String[] args) {

		Menu jjajang = new Menu("짜장", 6000);
		Menu jjambbong = new Menu("짬뽕", 7000);
		Menu tangsook = new Menu("탕수육", 15000);

		Menu[] menus = { jjajang, jjambbong, tangsook };
		Order order = new Order(123, menus);

		System.out.printf("주문 합계 : %d원\n", order.totalPrice());

	}

}

class Menu {

	String name;
	int price;

	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

}

class Order {

	int orderNum;
	Menu[] menus;

	public Order(int orderNum, Menu[] menus) {
		super();
		this.orderNum = orderNum;
		this.menus = menus;
	}

	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < menus.length; i++) {
			total = total + menus[i].price;
		}
		return total;
	}

}