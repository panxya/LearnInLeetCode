package _010_IsMatch_0402;

import java.util.HashMap;
//字串匹配
public class Kmp {
	public static void main(String[] args) {

	}

	public static int isMatch(String s, String p) {
		int[] next = buildNext(p);
		int n = s.length(),i=0;
		int m=p.length(),j=0;
		while(j<m&&i<n) {
			if(0>j||s.charAt(i)==p.charAt(j)) {
				i++;j++;
			}else {
				j=next[j];
			}
		}
		
		return i-j;
		

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
