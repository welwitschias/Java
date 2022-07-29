package timer_Ex1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//class Task2 implements Runnable {
//	@Override
//	public void run() {
//		System.out.println("헬로우");
//	}
//}

public class App2 {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//		executor.scheduleAtFixedRate(new Task2(), 0, 1, TimeUnit.SECONDS);
//		                                      시작시간, 반복시간

//		executor.scheduleAtFixedRate(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("헬로우");
//			}
//		}, 0, 1, TimeUnit.SECONDS);

		/* 람다식으로 표현 */
		executor.scheduleAtFixedRate(() -> {
			System.out.println("헬로우");
		}, 0, 1, TimeUnit.SECONDS);

	}

}
