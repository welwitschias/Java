package multiThread;

public class App2 {

	private int value = 0; // 공유 변수

	public void run() throws InterruptedException {

		Runnable runnable = () -> {
			for (int i = 0; i < 100; i++) {
				value++;
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);

		t1.start();
		t2.start();

		System.out.println("Value: " + value);

		t1.join(); // main thread가 t1 thread 동작 끝날 때까지 기다림
		t2.join();

		System.out.println("Value: " + value); // i가 1000이면 2000 안나옴

	}

	public static void main(String[] args) throws InterruptedException {

		new App2().run();

	}

}
