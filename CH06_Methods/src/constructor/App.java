package constructor;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("철수");
		p1.setHeight(182.5);

		Person p2 = new Person();
		p2.setName("영수");
		p2.setHeight(174.2);

		Person p3 = new Person();
		p3.setName("영희");
		p3.setHeight(163.8);

		// 생성자 매개변수로 한 번에 만들기
		Person p4 = new Person("훈이", 130.8);
		System.out.print(p4.getName());
		System.out.println(p4.getHeight());

		Person p5 = new Person("유리", 132.1);
		System.out.println(p5.getName());
		System.out.println(p5.getHeight());

		// name 초기값 변경
		Person p6 = new Person();
		System.out.println(p6.getName());
		System.out.println(p6.getHeight());

	}

}
