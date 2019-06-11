package _017_LetterCombinations_0409;

import java.util.ArrayList;
import java.util.List;

public class MyLetterCombinations {
	public static void main(String[] args) {
		
		List<String> list = letterCombinations("23");
		System.out.println(list);
	} 
	public static List<String> letterCombinations(String digits) {
		List<String> sb = new ArrayList();
		
		
		for(int i = 0;i<digits.length();i++) {
			if(digits.charAt(i)=='1'||digits.charAt(i)=='0') {
				continue;
			}
			if(digits.charAt(i)==2) {
				sb.add("abc");
			}
			if(digits.charAt(i)==3) {
				sb.add("def");
			}
			if(digits.charAt(i)==4) {
				sb.add("ghi");
			}
			if(digits.charAt(i)==5) {
				sb.add("jkl");
			}
			if(digits.charAt(i)==6) {
				sb.add("mno");
			}
			if(digits.charAt(i)==7) {
				sb.add("pqrs");
			}
			if(digits.charAt(i)==8) {
				sb.add("tuv");
			}
			if(digits.charAt(i)==9) {
				sb.add("wxyz");
			}
		}
		List<String> list = new ArrayList();
		for(int i = 0;i<sb.size();i++) {
			for(int j = 0;j<sb.get(i).length();j++) {
				
			}
		}
		
		return null;
	        
	    }
}
