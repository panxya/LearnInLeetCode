package _017_LetterCombinations_0409;

import java.util.LinkedList;
import java.util.List;

public class RefAns {
public static void main(String[] args) {
		
		List<String> list = letterCombinations("0223");
		System.out.println(list);
	} 
	public static List<String> letterCombinations(String digits) {
		LinkedList<String> list = new LinkedList<>();
		if(digits.isEmpty()) return list;
		
		String map[] = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		list.add("");
		for(int i =0;i<digits.length();i++) {
			char d = digits.charAt(i);
			int x = Character.getNumericValue(digits.charAt(i));
			while(list.peek().length()==i) {
				String t= list.remove();
				for(char c:map[x].toCharArray()) {
					list.add(t+c);
				}
			}
		}
		
		return list;
	}
}
