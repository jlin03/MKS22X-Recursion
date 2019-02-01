public class recursion{
	public static double sqrt(double n,double tolerance) {
		return sqrtHelper(n,n/2,tolerance);
	}
	
	private static double sqrtHelper(double n,double guess,double tolerance) {
		if(n == 0) {
			return 0;
		}
		if(Math.abs((guess * guess) - n) > tolerance) {
			return sqrtHelper(n,((n / guess) + guess) / 2,tolerance);
		}
		else {
			return guess;
		}
	}
	
}