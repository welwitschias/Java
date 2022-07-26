package innerClass;

// public class는 1파일에 1개 뿐
public class Person {

	class Head {
		public void print() {
			System.out.println("머리");
		}
	}

	static class Body {
		public void print() {
			System.out.println("몸");
		}
	}

	public void print() {
		Head head = new Head();
		Body body = new Body();
		head.print();
		body.print();
	}

}
