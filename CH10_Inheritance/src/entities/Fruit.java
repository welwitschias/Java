package entities;

public class Fruit {

	// protected 접근자 : 자식 클래스 + 같은 패키지에서 사용 가능
	protected int id;

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}

}
