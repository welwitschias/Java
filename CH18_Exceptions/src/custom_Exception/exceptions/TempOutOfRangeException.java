package custom_Exception.exceptions;

public class TempOutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	public TempOutOfRangeException(String message) {
		super(message); // 예외 메세지 생성
	}

}
