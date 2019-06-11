package _006_ZigzagRec_0329;

public class MyZigzagRec {
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int n = 5;
		String ss = convert(s, n);
		System.out.println(ss);
	}

	public static String convert(String s, int numRows) {
		if (s.length() == 1||numRows==1) {
			return s;
		} else {
			char[][] n = new char[numRows][s.length()];
			int i = 0;
			int x = 0;
			wf: for (int j = 0; j < s.length(); j++) {
				if (j % (numRows - 1) == 0) {
					i = 0;
					while (i < numRows) {
						if (x < s.length()) {
							n[i][j] = s.charAt(x++);
						} else {
							break wf;
						}
						i++;
					}
					i--;
				}else{
					if (x < s.length()) {
						n[--i][j] = s.charAt(x++);
					} else {
						break wf;
					}
				}

			}
			StringBuffer sb = new StringBuffer();
			for (char[] a : n) {
				for (char b : a) {
					if (b != '\0') {
						sb.append(b);
					}
				}
			}
			return sb.toString();

		}

	}
}
