package interfaces;

public class App {

	public static void main(String[] args) {

		// Object 클래스는 모든 클래스들의 상위(부모) 클래스
//		Object[] objs = { new Person(), new Computer() };
//
//		for (Object obj : objs) {
//			System.out.println(obj);
//		}

		Describable[] objs = { new Person(), new Computer() };

		for (Describable obj : objs) {
			System.out.println(obj.getDescription());
		}

	}

}
