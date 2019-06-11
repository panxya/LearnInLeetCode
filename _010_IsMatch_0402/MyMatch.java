
package _010_IsMatch_0402;

public class MyMatch {
	public static void main(String[] args) {
			String s = "aab",
					p = "c*a*b";
			boolean b = isMatch(s, p);
			System.out.println(b);
	}
	
    public static boolean isMatch(String s, String p) {
		int i = 0;int j=0;
    	while(i==s.length()&&j==p.length()) {
    		if(s.charAt(i)==p.charAt(j)) {
    			i++;j++;
    		}else if(p.charAt(j)=='.') {
    			i++;j++;
    		}else if(p.charAt(j)=='*') {
    		//i can't。
    		}else{
    			break;
    		}
    		
    		
    	}
    	
    	if (j==s.length()) {
    		return true;
    	}else {
    		return false;
    	}
    	
    
        
    }
}
