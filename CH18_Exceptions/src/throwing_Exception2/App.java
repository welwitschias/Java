package throwing_Exception2;

public class App {

	public static void main(String[] args) {

		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(60);
		} catch (Exception e) {
//			e.printStackTrace(); // 예외발생 시 빨간색 코드를 출력
			System.out.println(e.getMessage()); // 에러 메세지만 출력
		}

	}

}
