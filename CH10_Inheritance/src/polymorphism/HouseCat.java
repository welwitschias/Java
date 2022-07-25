package polymorphism;

public class HouseCat extends Cat {

	@Override
	public void vocal() {
		System.out.println("미야옹~");
	}

	@Override
	public String toString() {
		return "집고양이";
	}

	public void callMaster() {
		System.out.println("집사 부르기~");
	}

}
