package aboutClass;

public class CubeTest {

	public static void main(String[] args) {

		Cube a = new Cube(3);
		Cube b = new Cube(5);

		System.out.printf("정육면체 a의 부피 : %d, 겉넓이 : %d\n", a.getVolume(), a.getArea());
		System.out.printf("정육면체 b의 부피 : %d, 겉넓이 : %d\n", b.getVolume(), b.getArea());

	}

}

class Cube {

	int length;

	public Cube(int length) {
		super();
		this.length = length;
	}

	public int getArea() {
		return length * length * 6;
	}

	public int getVolume() {
		return length * length * length;
	}

}