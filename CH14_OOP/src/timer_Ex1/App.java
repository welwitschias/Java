package timer_Ex1;

import java.util.Timer;
import java.util.TimerTask;

//class Task extends TimerTask {
//	@Override
//	public void run() {
//		System.out.println("헬로우");
//	}
//}

public class App {

	public static void main(String[] args) {

		Timer timer = new Timer();

		// task를 1000ms(1s) 간격으로 반복
//		timer.scheduleAtFixedRate(new Task(), 0, 1000);
//		                                  시작시간, 반복시간

		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				System.out.println("헬로우");
			}
		}, 0, 1000);

	}

}
