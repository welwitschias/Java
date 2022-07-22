package whatIstoString;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person("펭수", 7);
		Person p2 = new Person("길동", 17);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}

}
