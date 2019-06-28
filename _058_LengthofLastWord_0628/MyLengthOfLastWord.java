package _058_LengthofLastWord_0628;

public class MyLengthOfLastWord {
	public static void main(String[] args) {
		String s = " ";
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		if (s.length() == 0)
			return 0;
		
		int count = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			//if the end char is ' ',we will substring the String,until the end is not ' ';
			while (i>=0&&i == s.length() - 1 && s.charAt(i)==' ') {
				s=s.substring(0, s.length()-1);
				i--;
			}
			//control the index.
			if(i<0) {
				break;
			}
			
			if (s.charAt(i) == ' ') {
				break;
			}
			
			count++;
		}

		return count;
	}
}
