package _003_LongestSubString_0326;

public class MyLongestSubstring {
	public static void main(String[] args) {
		String a = "123fjvndiennnjvfjgnbnbm";
		int b = lengthOfLongestSubstring(a);
	}
	
	 public static int lengthOfLongestSubstring(String s) {
	int i = 0;
		 for(i=0;i<s.length();i++) {
			 for(int j =0;j<i;j++) {
			 if(s.charAt(i)==s.charAt(j)) {
				
				System.out.println(i);
			 	}
			 }
		 }
		 
		 return i;

		
	        
	  }
}
