package _007_Reverse_0330;

public class Reverse {
	public static void main(String[] args) {
		int a = -2147483648;
		int b = reverse(a);
		System.out.println(b);
	}

	public static int reverse(int x) {
		if (x == 0 || x < Integer.MIN_VALUE||x>Integer.MAX_VALUE) {
			return 0;
		}

		int z = Math.abs(x);
		String s = String.valueOf(z);
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		s = sb.toString();

		if (Long.parseLong(s) > Integer.MAX_VALUE) {
			return 0;
		} else {
			int y = Integer.parseInt(s);

			if (x < 0) {
				return y * (-1);
			} else {
				return y;
			}

		}

//		int rev = 0;
//		while (x != 0) {
//			int pop = x % 10;
//			x /= 10;
//			if (rev > Integer.MAX_VALUE / 10 
//					|| (rev == Integer.MAX_VALUE / 10 
//					&& pop > 7))
//				return 0;
//			if (rev < Integer.MIN_VALUE / 10 
//					|| (rev == Integer.MIN_VALUE / 10 
//					&& pop < -8))
//				return 0;
//			rev = rev * 10 + pop;
//		}
//		return rev;
	}
}
