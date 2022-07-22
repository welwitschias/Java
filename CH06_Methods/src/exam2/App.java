package exam2;

public class App {

	public static void main(String[] args) {

		Student s1 = new Student("펭수", 7, false, 36.5);
		Student s2 = new Student("길동", 37, true, 35.5);
		Student s3 = new Student("라이언", 17, false, 37.5);
		Student s4 = new Student("오리온", 27, false, 34.5);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());

	}

}
