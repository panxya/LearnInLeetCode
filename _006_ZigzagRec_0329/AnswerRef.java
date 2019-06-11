package _006_ZigzagRec_0329;

public class AnswerRef {
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int n = 5;
		String ss = convert(s, n);
		System.out.println(ss);
	}

	public static String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		int n = s.length();
		int cir = 2 * numRows - 2;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j+i < n; j += cir) {
				sb.append(s.charAt(i+j));
				if (i != 0 && i != (numRows - 1) && j + cir - i < n) {
					sb.append(s.charAt(j + cir - i));
				}
			}
		}

		return sb.toString();
	}
}
