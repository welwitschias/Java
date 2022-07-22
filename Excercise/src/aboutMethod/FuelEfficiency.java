package aboutMethod;

public class FuelEfficiency {

	public static void main(String[] args) {
		
		double gasoline = 8.86;
		double distance = 182.736;
		double result = calEfficiency(gasoline, distance);
		
		System.out.printf("연비 : %.2f km/L\n", result);
		
	}

	private static double calEfficiency(double gasoline, double distance) {
		return distance / gasoline;
	}

}
