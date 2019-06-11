package _022_GenerateParenthesis_0415;

import java.util.ArrayList;
import java.util.List;

public class Answer {
	public static void main(String[] args) {
		List list = generateParenthesis(4);
		list.toArray();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static List<String> generateParenthesis(int n) {

		List<String> ans = new ArrayList();
		backtrack(ans, "", 0, 0, n);
		return ans;
	}

	public static void backtrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			return;
		}

		if (open < max)
			backtrack(ans, cur + "(", open + 1, close, max);
		if (close < open)
			backtrack(ans, cur + ")", open, close + 1, max);

	}
}
