package _050_Pow_0617;

public class ErrPow {
	public static void main(String[] args) {
		int n =2147483647;
		double x = 0.00001;
		double m = myPow(x,n);
		System.out.println(m);
	}
	
	

	private static double myPow(double x, int n) {
		if(x == -1) {
			if((n&1)!=0) {
				return -1;
			}else {
				return 1;
			}
		}
		if(x == 1.0) {
			return 1;
		}
		if(n == -2147483648) {
			return 0;
		}
		double mul = 1;
		if(n>0) {
			for(int i =0;i<n;i++) {
				mul *= x ;
			}
		}else {
			n = -n;
			for(int i = 0;i<n;i++) {
				mul *=x;
			}
			mul = 1/mul;
		}
		return mul;
	}
}
