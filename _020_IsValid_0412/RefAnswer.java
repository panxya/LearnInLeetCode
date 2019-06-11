package _020_IsValid_0412;

import java.util.Stack;

public class RefAnswer {
	public static void main(String[] args) {
		String s = "([])[]";
		boolean b = isValid(s);
		System.out.println(b);
	}
	public static boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
		for(char c :s.toCharArray()) {
			if(c=='(') {
				stack.push(')');
			}else if(c=='{') {
				stack.push('}');
			}else if(c=='[') {
				stack.push(']');
			}else if(stack.isEmpty()||stack.pop()!=c) {
				return false;
			}
			
		}
		
		
		return stack.isEmpty();
		
		
		
	}
}
