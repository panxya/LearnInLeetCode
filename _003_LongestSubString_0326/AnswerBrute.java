package _003_LongestSubString_0326;

import java.util.HashSet;

public class AnswerBrute {
	public static void main(String[] args) {
		String a = "123fjvndiennnjvfjgnbnbm";
		int b = lengthOfLongestSubstring(a);
		System.out.println(b);
	}
	
	 public static int lengthOfLongestSubstring(String s) {
		int ans = 0;
		 for(int i =0;i<s.length();i++) {
			 for(int j = i+1;j<=s.length();j++) {
				 if(check(s,i,j)) {
					ans= Math.max(ans, j-i);
				 }
			 }
		 }
		 
		 return ans;
 
	 }
	 
	 public static boolean check(String s,int start,int end) {
		HashSet hs = new HashSet();
		 for(int i = start;i<end;i++) {
			 char ch=s.charAt(i);
			 if(hs.contains(ch)) {
				 return false;}
			 hs.add(ch);
		 }
		 return true;
		 
	 }
	 
}
