package _005_LongestPalindrome_0328;

public class AnswerRef {
	public static void main(String[] args) {
		String s = "abxxxhcbfhfufidbshsusjsjsj";
		String ss = longestPalindrome(s);
		System.out.println(s);
		System.out.println(ss);

	}

	public static String longestPalindrome(String s) {
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);

			if (len > end - start) {
				start = i-(len-1)/2;
				end = i+(len)/2;
			}
			
		}

		return s.substring(start,end+1);
	}

	private static int expandAroundCenter(String s, int left, int right) {
		int l = left;
		int r = right;
		while(l >= 0 && r < s.length() && s.charAt(r) == s.charAt(l)) {
			r++;
			l--;
		}

		return r - l - 1;

	}

}
