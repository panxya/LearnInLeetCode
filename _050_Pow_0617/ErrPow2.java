package _050_Pow_0617;

public class ErrPow2 {
	public static void main(String[] args) {
		int n =2;
		double x = 10;
		double m = myPow(x,n);
		System.out.println(m);
	}

	private static double myPow(double x, int n) {
		if(n ==0) return 1;
		int pow = Math.abs(n);
		double result=pow%2==0?myPow(x*x, pow%2):myPow(x*x,(pow-1)/2) * x;
		return n < 0 ? 1/result : result;
	}
}
