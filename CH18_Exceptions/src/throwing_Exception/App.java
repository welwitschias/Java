package throwing_Exception;

public class App {

	public static void main(String[] args) throws Exception {

		// throws 예외 처리는 불러와서 처리함
		Thermostat stat = new Thermostat();
		stat.setTemperature(30);

	}

}
