package _038_GetNextString_0503;

public class RefAnsIter {
	public static void main(String[] args) {
		System.out.println(countAndSay(10));
	}
	public static String countAndSay(int n) {
		if(n ==1) {
			return "1";		
			}
		String last = countAndSay(n-1);
		return getNextString(last);
		
	}
	private static String getNextString(String last) {
		if(last.length()==0) {
			return "";		
			}
		int num = getRepeatNum(last);
		
		return num + "" +last.charAt(0)+getNextString(last.substring(num));
	}
	private static int getRepeatNum(String last) {
		int count = 1;
		char same = last.charAt(0);
		for(int i = 1;i<last.length();i++) {
			if(same==last.charAt(i)) {
				count ++;
			}else {
				break;
			}
		}
		return count;
	}
}
