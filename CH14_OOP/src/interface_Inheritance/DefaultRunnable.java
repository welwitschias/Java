package interface_Inheritance;

// Runnable interface 기본 내장 되어있음
// interface 끼리만 상속 가능
public interface DefaultRunnable extends Runnable {

	void displayDetails();

	// interface 에서도 default 메소드는 만들 수 있음
	default void hello() {
		System.out.println("헬로우");
	}

}
