package loopStatement;

public class OperatorPosition {

	public static void main(String[] args) {

		// 증감연산자의 위치에 따라 먼저 증감하고 할당(=), 할당(=)하고 증감
		int cats = 5;
		System.out.println(cats++); // 할당 후 증감
		System.out.println(cats);

		int dogs = 3;
		System.out.println(++dogs); // 증감 후 할당

		int chickens = 10;
		int animals = cats + chickens++;
		System.out.println(animals); // 16(고양이 6, 치킨 10)

		int apples = 5;
		int bananas = 4;
		int fruits = ++apples + bananas++;
		System.out.println(fruits); // 10(사과 6, 바나나 4)

	}

}
