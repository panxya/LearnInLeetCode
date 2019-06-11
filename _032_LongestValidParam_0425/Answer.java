package _032_LongestValidParam_0425;

import java.util.Stack;

public class Answer {
	public static void main(String[] args) {
		String s = "())((())";
		int a = longestValidParentheses(s);
		System.out.println(a);
	}
	public static int longestValidParentheses(String s) {
	        int maxans = 0;
	        Stack<Integer> stack = new Stack<>();
	        stack.push(-1);
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == '(') {
	                stack.push(i);
	            } else {
	                stack.pop();
	                if (stack.empty()) {
	                    stack.push(i);
	                } else {
	                    maxans = Math.max(maxans, i - stack.peek());
	                }
	            }
	        }
	        return maxans;
	    }
}
