package _028_StrStr_0421;

public class Answer {
	public static void main(String[] args) {
		String haystack = "missippi";
		String needle = "ssipi";
		int i = strStr(haystack, needle);
		System.out.println(i);
	}
	
	public static int strStr(String haystack, String needle) {
		  for (int i = 0; ; i++) {
		    for (int j = 0; ; j++) {
		      if (j == needle.length()) return i;
		      if (i + j == haystack.length()) return -1;
		      if (needle.charAt(j) != haystack.charAt(i + j)) break;
		    }
		  }
		}
}
