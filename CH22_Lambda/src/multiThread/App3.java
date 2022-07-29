package multiThread;

public class App3 {

	private int value = 0;

	// synchronized : thread 하나만 접근 가능하게
	private synchronized void increment() {
		value++;
	}

	public void run() throws InterruptedException {

		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				increment();
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		Thread t4 = new Thread(() -> System.out.println("헬로우"));

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println("Value: " + value);

		t1.join(); // main thread가 t1 thread 동작 끝날 때까지 기다림
		t2.join();
		t3.join();

		System.out.println("Value: " + value);

	}

	public static void main(String[] args) throws InterruptedException {

		new App3().run();

	}

}
