package timer_Ex2;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task extends TimerTask {
	@Override
	public void run() {
		System.out.println("헬로우!");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("안녕~");
	}
}

public class App {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task2(), 0, 2, TimeUnit.SECONDS);

	}

}
