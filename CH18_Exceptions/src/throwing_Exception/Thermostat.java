package throwing_Exception;

public class Thermostat {

	// throws 예외는 예외를 미뤄서 해당 메소드를 부를 때 처리
	public void setTemperature(double t) throws Exception {

		if (t < 0 || t > 35) {
			// 코드로 직접 예외 객체 생성
			throw new Exception("온도가 비정상입니다.");
		}

		System.out.println("온도 세팅 : " + t);

	}

}
