package anonymous_Class;

public class App {

	private String name = "펭수";

	public static void main(String[] args) {
		new App().start();
	}

	private void start() {
		// 익명 클래스로 인터페이스 객체 생성
//		Runnable runner = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println(name);
//			}
//		};
//		activate(runner);

		activate(new Runnable() {
			@Override
			public void run() {
				System.out.println(name);
			}
		});
	}

	public void activate(Runnable runnable) {
		runnable.run();
	}

}
