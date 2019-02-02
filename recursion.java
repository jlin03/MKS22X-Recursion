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
	
	public static int fib(int n){
		return fibH(n,0,1);
    }
	
	private static int fibH(int n, int f1, int f2) {
		if(n == 0) {
			return f1;
		}
		if(n == 1) {
			return f2;
		}
		else {
			return fibH(n-1,f2,f1+f2);
		}
	}
	
}