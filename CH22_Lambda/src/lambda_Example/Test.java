package lambda_Example;

// 람다식은 함수형 인터페이스(@FunctionalInterface) 필요
@FunctionalInterface
public interface Test {

	void run(); // 함수형 인터페이스는 추상 메소드 1개만 가능(2개 이상 불가)
//	void run2();

}
