package _044_WildcardMatching_0611;

public class MyFalseWildcardMatching {

	public static void main(String[] args) {
		String s = "aa";
		String p = "*";
		System.out.println(isMatch(s, p));
	}
//KMP算法匹配字符串，不知通配符如何匹配
	public static boolean isMatch(String s, String p) {
		int[] next = buildNext(p);
		int n = s.length(), i = 0;
		int m = p.length(), j = 0;
		while (j < m && i < n) {
			if (0 > j || s.charAt(i) == p.charAt(j)) {
				i++;
				j++;

			} else if (p.charAt(j) == '?') {
				i++;
			} else if (p.charAt(j) == '*') {
				while (j + 1 < m && s.charAt(i) != p.charAt(j + 1)) {
					j++;
				}

			} else {
				j = next[j];
			}
		}
		if(i==n) {
			return true;
		}else {
			return false;
		}
		
	}

	private static int[] buildNext(String p) {
		int m = p.length(), j = 0;
		int[] N = new int[m];
		int t = -1;
		N[0] = -1;
		while (j < m - 1) {
			if (0 > t || p.charAt(j) == p.charAt(t)) {
				j++;
				t++;
				N[j] = (p.charAt(j) != p.charAt(t) ? t : N[t]);
			} else {
				t = N[t];
			}
		}
		return N;
	}
}
