package aboutClass;

public class CylinderTest {

	public static void main(String[] args) {

		Cylinder c = new Cylinder(4, 5);

		System.out.printf("원기둥의 부피 : %.2f\n", c.getVolume());
		System.out.printf("원기둥의 겉넓이 : %.2f\n", c.getArea());

	}

}

class Cylinder {

	double radius;
	double height;

	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	public double getVolume() {
		return radius * radius * Math.PI * height;
	}

	public double getArea() {
		return (2 * radius * radius * Math.PI) + (2 * radius * Math.PI * height);
	}

}
