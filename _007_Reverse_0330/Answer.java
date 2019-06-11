package _007_Reverse_0330;

public class Answer {
	public static void main(String[] args) {
		int a = 123;
		int b = reverse(a);
		System.out.println(b);
	}

	public static int reverse(int x) {
		
		int rec = 0;
		while(x!=0) {
			int pop=x%10;
			x/=10;
			if(rec >Integer.MAX_VALUE/10||(rec ==Integer.MAX_VALUE/10&&pop>7) ) {
				return 0;
			}
			if(rec <Integer.MIN_VALUE/10||(rec ==Integer.MIN_VALUE/10&&pop<-8 )) {
				return 0;
			}
			rec=rec*10+pop;
		}
	return rec;
	
//	int rev = 0;
//	while (x != 0) {
//		int pop = x % 10;
//		x /= 10;
//		if (rev > Integer.MAX_VALUE / 10 
//				|| (rev == Integer.MAX_VALUE / 10 
//				&& pop > 7))
//			return 0;
//		if (rev < Integer.MIN_VALUE / 10 
//				|| (rev == Integer.MIN_VALUE / 10 
//				&& pop < -8))
//			return 0;
//		rev = rev * 10 + pop;
//	}
//	return rev;
	}
		
	}

