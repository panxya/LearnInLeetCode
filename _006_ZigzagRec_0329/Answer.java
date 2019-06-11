package _006_ZigzagRec_0329;

public class Answer {
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int n = 5;
		String ss = convert(s, n);
		System.out.println(ss);
	}
	
	public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}
