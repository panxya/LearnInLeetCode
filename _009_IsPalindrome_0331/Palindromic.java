package _009_IsPalindrome_0331;

public class Palindromic {
	public static void main(String[] args) {
		int x = 1111;
		boolean a = isPalindrome(x);
		System.out.println(a);
	}

	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		int i = 0, l = 0, r = 0;
		if (s.length() % 2 != 0) {
			i = s.length() / 2;
			l = i;
			r = i;
		} else {
			i = s.length() / 2;
			l = i - 1;
			r = i;
		}

		while (l >= 0 && r < s.length() && s.charAt(r) == s.charAt(l)) {
			r++;
			l--;
		}
		r--;
		l++;
		if (l == 0 && r == s.length() - 1) {
			return true;
		} else {
			return false;
		}

	}
}
