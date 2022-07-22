package application;

public class BooleanMix {

	public static void main(String[] args) {

		boolean isRaining = false;
		boolean mightRain = true;
		boolean haveUmbrella = true;

		// 1
		if ((isRaining || mightRain) && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}

		// 2
		boolean rainCheck = isRaining || mightRain;

		if (rainCheck && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}

	}

}
