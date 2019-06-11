package _028_StrStr_0421;

public class MyRefKmp {
	public static void main(String[] args) {
		String haystack = "ii";
		String needle = "i";
		int i = strStr(haystack, needle);
		System.out.println(i);
	}

	public static int strStr(String haystack, String needle) {
	
		if(needle.length()==0) {
			return 0;
		}
		if(haystack.length()==0) {
			return -1;
		}
		if(needle.length()>haystack.length()) {
			return -1;
		}
//		if(needle.length()==haystack.length()) {
//			boolean flag = true;
//			for(int i = 0;i<haystack.length();i++) {
//				flag = flag&&(haystack.charAt(i)==haystack.charAt(0));
//			}
//			for(int i = 0;i<needle.length();i++) {
//				flag = flag&&(needle.charAt(i)==haystack.charAt(0));
//			}
//			if(flag) return 0;
//		}
		//加不加都可以过
		
		int[] next = buildNext(needle);
		int n = haystack.length(), i = 0;
		int m = needle.length(), j = 0;
		while (j < m && i < n) {
			if (0 > j || haystack.charAt(i) == needle.charAt(j)) {
				i++;
				j++;
			} else {
				j = next[j];
			}
		}
		
		
		if(j==m) {
			return i - j;
		}else {
			return -1;
		}

		
	}

	private static int[] buildNext(String s) {
		int length = s.length();
		int j = 0;
		int n[] = new int[length];
		int t = -1;
		n[0] = -1;
		while (j < length - 1) {
			if (t < 0 || s.charAt(j) == s.charAt(t)) {
				j++;
				t++;
				n[j] = s.charAt(j) != s.charAt(t) ? t : n[t];
			} else {
				t = n[t];
			}
		}
		return n;
	}
}
