package _069_Sqrt_0709;

//use Math will quick.
public class SqrtRefAns {
	public static void main(String[] args) {
		System.out.println(mySqrt(9));
	}
	public static int mySqrt(int x) {
		long r=x;
		while(r*r>x) {
			r=(r+x/r)/2;
		}
		return (int)r;
	}
}
