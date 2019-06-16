package _049_GroupAnagrams_0616;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupAnagramsRefAns {
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>>  ll = groupAnagrams(strs);
		for(List l:ll) {
			for (int i = 0; i < l.size(); i++) {
				System.out.printf("%5s",l.get(i));
			}
			System.out.println();
		}
	}

	private static List<List<String>>  groupAnagrams(String[] strs) {
		if(strs.length ==0)return new ArrayList();
		Map<String,List> ans = new HashMap<String ,List>();
		for(String s:strs) {
			char[] ca =s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if(!ans.containsKey(key)) ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}
}
