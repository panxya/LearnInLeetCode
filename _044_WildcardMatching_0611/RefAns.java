package _044_WildcardMatching_0611;

public class RefAns {
	public static void main(String[] args) {
		String s = "aa";
		String p = "*";
		System.out.println(isMatch(s, p));
	}

	private static boolean isMatch(String s, String p) {
		int i = 0, j = 0, match = 0, starIdx = -1;
		while (i < s.length()) {
			// 匹配？
			if (j < p.length() && (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j))) {
				i++;
				j++;
			} // 匹配*，只有j++
			else if (j < p.length() && p.charAt(j) == '*') {
				starIdx = j;
				match = i;
				j++;
			} // 结尾只有*，i++
			else if (starIdx != -1) {
				j = starIdx + 1;

				i = ++match;
			} // 不匹配||现在的j不是starIdx,p结尾不是*
			else {
				return false;
			}

			// 检查p中剩余

		}
		while (j < p.length() && p.charAt(j) == '*') {
			j++;
		}
		return j == p.length();
	}
}
