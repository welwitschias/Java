package methodReturn;

public class App {

	public static void main(String[] args) {

		ReturnValue rv = new ReturnValue();
		System.out.println(rv.getCat());

		String value = rv.getCat();
		System.out.println(value);

	}

}
