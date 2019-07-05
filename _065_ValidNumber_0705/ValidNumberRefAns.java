package _065_ValidNumber_0705;

public class ValidNumberRefAns {
	public static void main(String[] args) {
		System.out.println(isNumber("123.1"));
	}

	public static boolean isNumber(String s) {
		s = s.trim();
		boolean pointSeen = false;
		boolean eSeen = false;
		boolean numberSeen = false;
		boolean numberAfterE = true;
		for (int i = 0; i < s.length(); i++) {
			if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
				numberSeen = true;
				numberAfterE = true;
			} else if (s.charAt(i) == '.') {
				if (eSeen || pointSeen) {
					return false;
				}
				pointSeen = true;
			} else if (s.charAt(i) == 'e') {
				if (eSeen || !numberSeen) {
					return false;
				}
				numberAfterE = false;
				eSeen = true;
			} else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
				if (i != 0 && s.charAt(i - 1) != 'e') {
					return false;
				}
			} else {
				return false;
			}
		}
		return numberSeen && numberAfterE;
//		solve it in a sentence.
//		return s.trim().matches("[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?");

	}
}
