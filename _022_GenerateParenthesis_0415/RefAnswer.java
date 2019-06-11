package _022_GenerateParenthesis_0415;

import java.util.ArrayList;
import java.util.List;

public class RefAnswer {
	public static void main(String[] args) {
		List list = generateParenthesis(4);
		list.toArray();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		blackTrack(list,"",0,0,n);
		return list;	
	}

	private static void blackTrack(List<String> list, String s, int lo, int hi, int n) {
		if(s.length()==2*n) {
			list.add(s);
			return;
		}
		if(lo<n) {
			blackTrack(list, s+"(", lo+1, hi, n);
		}if(hi<lo) {
			blackTrack(list, s+")", lo, hi+1, n);
		}
		
	}
}
