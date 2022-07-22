package loopStatement;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {

		int count = 0;

		count = count + 1;
		System.out.println(count);
		count += 1;
		System.out.println(count);
		count++;
		System.out.println(count);
		++count;
		System.out.println(count);

		count = count - 1;
		System.out.println(count);
		count -= 1;
		System.out.println(count);
		count--;
		System.out.println(count);
		--count;
		System.out.println(count);

	}

}
