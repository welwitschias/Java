package application;

public class EmptyString {

	public static void main(String[] args) {

		// isBlank(공백을 빈값으로 처리) vs isEmpty(공백을 비어있지 않다고 처리)
		// 공백에 대해서도 비어있다고 판단할 경우 isBlank를 사용
		String myText1 = "";
		
		System.out.println(myText1.isBlank()); // true
		System.out.println(myText1.isEmpty()); // true

		String myText2 = "     \n";
		
		System.out.println(myText2.isBlank()); // true
		System.out.println(myText2.isEmpty()); // false : length != 0

		// replace(A, B) : A를 B로 바꿈
		String myText3 = "아침밥을 맛있게 먹었다.";
		
		System.out.println(myText3.replace("아침", "저녁"));

		// .strip() : 공백 제거 
		String name = "    Jane    ";
		
		System.out.printf("'%s'\n", name.strip());
		System.out.printf("'%s'\n", name);

	}

}
