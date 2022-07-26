package boiling_Egg;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Message extends TimerTask {
	@Override
	public void run() {
		System.out.println("계란 삶는 중");
	}
}

class Alarm implements Runnable {
	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");
	}
}

public class App {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Message(), 5000, 5000);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Alarm(), 30, 30, TimeUnit.SECONDS);

	}

}
