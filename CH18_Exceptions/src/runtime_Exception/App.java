package runtime_Exception;

public class App {

	public static void main(String[] args) {

		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(60);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
