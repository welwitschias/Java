package throwing_Exception2;

public class Thermostat {

	public void setTemperature(double t) throws Exception {

		setMachineTemperature(t);

		System.out.println("온도 세팅 : " + t);

	}

	private void setMachineTemperature(double t) throws Exception {

		if (t < 0 || t > 35) {
			throw new Exception("온도가 비정상입니다.");
		}

	}

}
