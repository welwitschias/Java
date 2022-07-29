package multiThread;

public class Exercise {

	public static void main(String[] args) {

//		longTask(); // 메인 스레드로 작동

		Thread thread = new Thread(() -> longTask());
		thread.start(); // 메인 스레드가 아닌 새로운 스레드로 작동

		System.out.println("메인 스레드 동작");

	}

	private static void longTask() {

		long t = System.currentTimeMillis();
		long end = t + 3000; // 3초 더하기

		while (true) {
			if (System.currentTimeMillis() == end) {
				System.out.println("긴 작업 종료");
				break; // 3초 대기하다가 빠져 나감
			}
		}

	}

}
