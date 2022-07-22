package loopStatement;

public class WhileLoop {

	public static void main(String[] args) {

		int counter = 0;

		while (counter <= 10) {
			System.out.printf("카운터 : %d \n", counter);
			// counter = counter + 1;
			// counter++;
			counter += 1;
		}

	}

}
