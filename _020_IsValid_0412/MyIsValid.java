package _020_IsValid_0412;
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//
//Note that an empty string is also considered valid.
public class MyIsValid {
public static void main(String[] args) {
	String s = "([])[]";
	boolean b = isValid(s);
	System.out.println(b);
}
	
	
	
	public static boolean isValid(String s) {
	boolean flag=false;
	for(int i = 0;i<s.length();i++) {
		for(int j = i;j<s.length();j+=2) {
			if((s.charAt(i)=='(')&&(s.charAt(j)==')')) {
				flag = true;
			}else if((s.charAt(i)=='{')&&(s.charAt(j)=='}')) {
				flag = true;
			}else if((s.charAt(i)=='[')&&(s.charAt(j)==']')) {
				flag = true;
			}else {
				flag = false;
			}
		}
	}
		
		
		
		
		return flag;
        
    }
}
