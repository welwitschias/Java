package custom_Exception;

import custom_Exception.exceptions.TempTooHighException;
import custom_Exception.exceptions.TempTooLowException;

public class Thermostat {

	public void setTemperature(double t) throws TempTooLowException, TempTooHighException {

		setMachineTemperature(t);

		System.out.println("온도 세팅 : " + t);

	}

	private void setMachineTemperature(double t) throws TempTooLowException, TempTooHighException {

		if (t < 0) {
			throw new TempTooLowException("온도가 너무 낮습니다.");
		} else if (t > 35) {
			throw new TempTooHighException("온도가 너무 높습니다.");
		}

	}

}
