package runtime_Exception;

public class Thermostat {

	public void setTemperature(double t) {

		setMachineTemperature(t);

		System.out.println("온도 세팅 : " + t);

	}

	private void setMachineTemperature(double t) {

		if (t < 0 || t > 35) {
			// runtime 예외는 따로 예외 처리를 안해도 에러가 발생하지 않음
			throw new RuntimeException("온도가 비정상입니다.");
		}

	}

}
