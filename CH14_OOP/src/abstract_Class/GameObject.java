package abstract_Class;

// 추상 클래스 : class 앞에 abstract 추가
public abstract class GameObject {
	
	// 추상 메소드는 코드블록{}이 없음
	// 상속 받는 하위 클래스(Monster, Player)에 강제적으로 구현시킴
	public abstract void describe();
	
}
