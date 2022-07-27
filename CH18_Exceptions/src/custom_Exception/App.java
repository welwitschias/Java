package custom_Exception;

import custom_Exception.exceptions.TempTooHighException;
import custom_Exception.exceptions.TempTooLowException;

public class App {

	public static void main(String[] args) {

		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(5);
		} catch (TempTooHighException e) {
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			System.out.println(e.getMessage());
		}

	}

}
