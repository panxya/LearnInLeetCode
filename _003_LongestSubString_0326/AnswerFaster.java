package _003_LongestSubString_0326;

import java.util.HashSet;

public class AnswerFaster {
	public static void main(String[] args) {
		String a = "123fjvndiennnjvfjgnbnbm";
		int b = lengthOfLongestSubstring(a);
		System.out.println(b);
	}

	public static int lengthOfLongestSubstring(String s) {
		HashSet hs = new HashSet();
		int ans = 0, i = 0, j = 0;
		int n = s.length();
		while (i < n && j < n) {
			if (!hs.contains(s.charAt(j))) {
				hs.add(s.charAt(j++));
				ans = Math.max(ans, j - i);

			} else {
				hs.remove(s.charAt(i++));
			}

		}

		return ans;

	}
}
