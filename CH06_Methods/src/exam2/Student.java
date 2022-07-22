package exam2;

public class Student {

	private String name;
	private int age;
	private boolean isVisible; // true : 집체, false : 원격
	private double temperature;

	public Student(String name, int age, boolean isVisible, double temperature) {
		super();
		this.name = name;
		this.age = age;
		this.isVisible = isVisible;
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		// 마우스 우클릭 → Source → Generate toString()...
		return "Student [name=" + name + ", age=" + age + ", isVisible=" + isVisible + ", temperature=" + temperature
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

}
