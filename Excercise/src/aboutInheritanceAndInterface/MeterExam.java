package aboutInheritanceAndInterface;

public class MeterExam {

	public static void main(String[] args) {

		Taxi taxi = new Taxi();

		taxi.start();
		taxi.stop(5000);

	}

}

interface Meter {

	public int BASE_FARE = 3000; // 인터페이스에서 정의한 변수는 상수임

	public abstract void start();

	public abstract void stop(int distnace);

}

class Taxi implements Meter {

	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");
	}

	@Override
	public void stop(int distance) {
		int fare = BASE_FARE + (distance * 2);
		System.out.printf("운행을 종료합니다. 요금은 %d원 입니다.", fare);
	}

}