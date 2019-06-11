package _014_LongestCommonPrefix_0406;

public class Answer {
	public static void main(String[] args) {
		String s[] = { "flow","flower","flight"};
		String a =longestCommonPrefix(s); 
		System.out.println(a);
	}
	
	public static String longestCommonPrefix(String[] strs) {
		  if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		     
		    	while (strs[i].indexOf(prefix) != 0) {
		    		int a = strs[i].indexOf(prefix);
		    		prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    return prefix;
        
    }
}
