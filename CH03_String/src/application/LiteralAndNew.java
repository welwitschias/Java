package application;

public class LiteralAndNew {

	public static void main(String[] args) {

		// literal 방식 vs new 키워드
		String new1 = new String("사과");
		String new2 = new String("바나나");
		String literal1 = "딸기";
		String literal2 = "오렌지";
		String new3 = literal1;

		System.out.println(new1);
		System.out.println(new2);
		System.out.println(new3);
		System.out.println(literal1);
		System.out.println(literal2);

	}

}
