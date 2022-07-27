package try_Catch_Finally;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();

		try {
			p1.setName(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// 예외가 발생하더라도 여기는 무조건 실행됨
			System.out.println("finally는 무조건 실행!");
		}

		System.out.println("프로그램 종료");

	}

}
