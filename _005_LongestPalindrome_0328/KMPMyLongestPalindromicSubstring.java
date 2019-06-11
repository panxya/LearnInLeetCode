package _005_LongestPalindrome_0328;

import java.util.HashMap;
//kmp
public class KMPMyLongestPalindromicSubstring {
	public static void main(String[] args) {
		String s = "bbbbb";
		String ss = longestPalindrome(s);
		System.out.println(s);
		System.out.println(ss);
	
	}
	
	
	public static String longestPalindrome(String s) {
	        HashMap hm = new HashMap();
	        HashMap hm2 = new HashMap();
	       
	        int l = s.length();
	       
	       
	        for(int i = 0;i<l;i++) {
	        	hm.put(i, s.charAt(i));		
	        }
	        for(int i = 0;i<l;i++) {
	        	hm2.put(i,s.charAt(s.length()-1-i));	
	        }
	       
	        int n[] =buildNaxt(hm2);
	        n[0]=-1;
	        int i =0,j=0;
	        while(i<l&&j<l) {
	        	if(j<0||hm.get(i)==hm.get(j)) {
	        		i++;j++;
	        		
	        	}else {
	        		j = n[j];
	        	}
	        
	        }
	        
		return s.substring(i, j);
	    }


	private static int[] buildNaxt(HashMap hm2) {
		int size = hm2.size();
		int j=0;
		int n[] = new int [size];
		int t = -1;
		n[0] = -1;
		while(j<size-1) {
			if(t<0||hm2.get(j)==hm2.get(t)) {
				j++;t++;
				n[j]=(hm2.get(j)!=hm2.get(t))?t:n[t];
			}else {
				t=n[t];
			}
		}
		return n;
	}
}
