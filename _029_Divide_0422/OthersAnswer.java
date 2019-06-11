package _029_Divide_0422;
//使用了加法，唉。
public class OthersAnswer {
	public static void main(String[] args) {
		int a=divide(222,22);
		System.out.println(a);
	}
	
	public static int divide(int A, int B) {
	    if (A == Integer.MIN_VALUE && B == -1) return Integer.MAX_VALUE;
	   
	    boolean sign = A<0 == B<0;

	    A = A < 0 ? A : -A;//令a《0
	    B = B < 0 ? B : -B;

	    int result = div(A,B);
	    return sign ? result : -result;
	}

	private static int div(int A, int B) {
	    int total = B, prev = 0, result = 0;

	    while (A <= total) {
	        result = result == 0 ? 1 : result+result;
	        prev = total;
	        total += total;
	        if (total > prev) break; // overflow
	    }

	    return ( result == 0) ? result : result + div(A - prev, B);
	}
}
