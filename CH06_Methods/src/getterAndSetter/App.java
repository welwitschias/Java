package getterAndSetter;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("펭수");
		p1.setAge(10);
		System.out.printf("%s는 %d살 입니다.\n", p1.getName(), p1.getAge());
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
		
		Person p2 = new Person();
		p2.setName("길동");
		p2.setAge(17);
		System.out.printf("%s이는 %d살 입니다.\n", p2.getName(), p2.getAge());
//		System.out.println(p2.getName());
//		System.out.println(p2.getAge());

	}

}
