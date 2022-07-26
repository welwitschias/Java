package method_InnerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	private String name;

	public App() {
		name = "엘리자베스";
	}

	public static void main(String[] args) {
		
		App app = new App();
		app.run();
		
	}

	private void run() {
		
		class Task implements Runnable {
			public void run() {
				System.out.println(name);
			}
		}

		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Task(), 0L, 1L, TimeUnit.SECONDS);

	}

}
