package application;

public class Cat {

	private String name;
	private int id;
	// static 상수는 final 앞에 붙음 + 객체 생성없이 사용
	public static final String FOOD = "고양이 사료";

	// static 변수는 공유해서 값을 사용 가능
	private static int count = 0; // 초기값 0

	public Cat(String name) {
		super();
		this.name = name;
		count++;
		id = count;
	}

	// static 메소드는 인스턴스 변수를 사용할 수 없음, static 변수만 사용 가능
	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Cat [고양이 ID : " + id + ", 이름 : " + name + "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getFood() {
		return FOOD;
	}

}