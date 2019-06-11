package _029_Divide_0422;

public class MyDivide {

	public static void main(String[] args) {
		int a=divide(-2147483648,-1);
		System.out.println(a);
	}
	public static int divide(int dividend, int divisor) {
		if(dividend==(-2147483648)&&divisor==-1) {
			return 2147483647;
		}
		int mod = dividend%divisor;
		int result = (dividend-mod)/divisor;
		
        return result;
    }
}
