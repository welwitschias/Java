package method_InnerClass;

public class App {

	private String name;

	public App() {
		name = "엘리자베스";
	}

	public static void main(String[] args) {

//		System.out.println(name); // static은 인스턴스 변수를 사용할 수 없음

		App app = new App();
		app.run();

	}

	private void run() {
//		System.out.println(name);

		class Printer {
			public void print() {
				System.out.println(name);
			}
		}

		new Printer().print();
	}

}
