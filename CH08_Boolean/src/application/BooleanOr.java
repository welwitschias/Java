package application;

public class BooleanOr {

	public static void main(String[] args) {

		boolean isRaining = false;
		boolean mightRain = true;
		boolean takeUmbrella = false;

		takeUmbrella = isRaining || mightRain;
		System.out.println(takeUmbrella);

	}

}
