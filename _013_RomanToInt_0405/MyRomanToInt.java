package _013_RomanToInt_0405;

public class MyRomanToInt {
	public static void main(String[] args) {

		String s = "MDLXX";
		int i = romanToInt(s);
		System.out.println(i);
	}

	public static int romanToInt(String s) {
		int n = 0;
		while (s.length()!=0) {
			if (s.length()!=0&&s.charAt(0) == 'M') {
				n += 1000;
				s = s.substring(1);
			}
			if (s.length()!=0&&s.charAt(0) == 'D') {
				n += 500;
				s = s.substring(1);
			}
			if (s.length()!=0&&s.charAt(0) == 'C') {
				if (s.length()!=1&&s.charAt(1) == 'M') {
					n += 900;
					s = s.substring(2);
				} else if (s.length()!=1&&s.charAt(1) == 'D') {
					n += 400;
					s = s.substring(2);
				} else {
					n += 100;
					s = s.substring(1);
				}
			}
			if (s.length()!=0&&s.charAt(0) == 'L') {
				n += 50;
				s = s.substring(1);
			}
			if (s.length()!=0&&s.charAt(0) == 'X') {
				if (s.length()!=1&&s.charAt(1) == 'C') {
					n += 90;
					s = s.substring(2);
				} else if (s.length()!=1&&s.charAt(1) == 'L') {
					n += 40;
					s = s.substring(2);
				} else {
					n += 10;
					s = s.substring(1);
				}

			}
			if (s.length()!=0&&s.charAt(0) == 'V') {
				n += 5;
				s = s.substring(1);
			}
			
			if (s.length()!=0&&s.charAt(0) == 'I') {
				if (s.length()!=1&&s.charAt(1) == 'X') {
					n += 9;
					s = s.substring(2);
				} else if (s.length()!=1&&s.charAt(1) == 'V') {
					n += 4;
					s = s.substring(2);
				} else {
					n += 1;
					s = s.substring(1);
				}

			}

		}

		return n;

	}
}
