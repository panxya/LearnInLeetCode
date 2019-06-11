package _032_LongestValidParam_0425;

import java.util.Stack;
//false
public class MyLongestValidParam {
	public static void main(String[] args) {
		String s = "()()()()((()()()";
		int a = longestValidParentheses(s);
		System.out.println(a);
	}

	public static int longestValidParentheses(String s) {
		Stack<Character> stack = new Stack();
		int count = 0;
		int max = 0;
		for (int n = 0; n < s.length(); n++) {
			char c = s.charAt(n);
			if (c == '(') {
				stack.push(')');
			} else if (!stack.isEmpty()) {
				char cc = stack.pop();
				if (cc!=')') {
					max=Math.max(max, count);
					count = 0;
					continue;
				}else{
					count++;
				}
			}
		}

		return max * 2;

	}
}
