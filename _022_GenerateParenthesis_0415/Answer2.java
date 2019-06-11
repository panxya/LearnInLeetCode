package _022_GenerateParenthesis_0415;

import java.util.ArrayList;
import java.util.List;

public class Answer2 {
	public static void main(String[] args) {
		List list = generateParenthesis(3);
		list.toArray();
		for(int i = 0 ;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	public static List<String> generateParenthesis(int n) {
	List<String> ans = new ArrayList();
     if (n == 0) {
         ans.add("");
     } else {
         for (int c = 0; c < n; ++c)
             for (String left: generateParenthesis(c))
                 for (String right: generateParenthesis(n-1-c))
                     ans.add("(" + left + ")" + right);
     }
     return ans;
     }	
}
