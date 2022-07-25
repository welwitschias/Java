package abstract_Class;

public class App {

	public static void main(String[] args) {

//		GameObject gameObject = new GameObject(); // 추상 클래스는 객체를 만들 수 없음

		GameObject[] objs = { new Player(), new Monster() };

		for (GameObject obj : objs) {
			System.out.println(obj);
			obj.describe();
		}

	}

}
